/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class Roleta extends JogoCasino{

    private boolean isVisible;
    private ApostaRoleta aposta;
    private String corAtual;
    private int numeroAtual;
    private Cadastro modeloCadastro;
    
    public Roleta() {
        super();
        jogadorAtual=0;
        isVisible = false;
        corAtual = "vermelho";
        numeroAtual = 1;
        aposta = new ApostaRoleta();        
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        isVisible = b;
        this.setChanged();
        this.notifyObservers();
    }

    public void setModeloCadastro(Cadastro modeloCadastro) {
        this.modeloCadastro = modeloCadastro;
    }
    
    public int getNumeroAtual() {
        return numeroAtual;
    }

    public String getCorAtual() {
        return corAtual;
    }
            
    public boolean fazerApostaCor(Jogador jogador,Integer valorJogada,String jogada){
        
        if(jogador.getFichas()>valorJogada)
        {
            aposta.resetarAposta();
            aposta.setTipoAposta(0);
            this.jogadores.remove(jogador);
            jogador.reduzirFichas(valorJogada);
            this.jogadores.add(jogadorAtual, jogador);
            modeloCadastro.setJogadores(this.jogadores);
            aposta.fazerApostaCor(jogada, valorJogada);
            return true;
        }
        else
            JOptionPane.showMessageDialog(null, "Infelizmente você não possui fichas suficientes para realizar essa aposta", "Valor de Aposta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        
    }
    
    public boolean fazerApostaNumero(Jogador jogador,Integer valorJogada,int numero){
        
        if(jogador.getFichas()>valorJogada)
        {
            aposta.resetarAposta();
            aposta.setTipoAposta(1);
            this.jogadores.remove(jogador);
            jogador.reduzirFichas(valorJogada);
            this.jogadores.add(jogadorAtual, jogador);
            modeloCadastro.setJogadores(this.jogadores);
            aposta.fazerApostaNumero(numero,valorJogada);
            return true;
        }
        else
            JOptionPane.showMessageDialog(null, "Infelizmente você não possui fichas suficientes para realizar essa aposta", "Valor de Aposta", JOptionPane.INFORMATION_MESSAGE);
            return false;
    }
    
    public boolean fazerApostaCorNumero(Jogador jogador,Integer valorJogada,String jogada){
        
        if(jogador.getFichas()>valorJogada)
        {
            aposta.resetarAposta();
            aposta.setTipoAposta(2);
            this.jogadores.remove(jogador);
            jogador.reduzirFichas(valorJogada);
            this.jogadores.add(jogadorAtual, jogador);
            modeloCadastro.setJogadores(this.jogadores);
            aposta.fazerApostaCorNumero(jogada,valorJogada);
            return true;
        }
        else
            JOptionPane.showMessageDialog(null, "Infelizmente você não possui fichas suficientes para realizar essa aposta", "Valor de Aposta", JOptionPane.INFORMATION_MESSAGE);
            return false;
        
    }
    
    public void proximoJogador(){
        this.jogadorAtual++;
        if(jogadorAtual == jogadores.size())
            jogadorAtual = 0;
        System.out.println(jogadores.get(jogadorAtual).getNome());
        
    }
    
    public void girarRoleta() throws InterruptedException{
        System.out.println(jogadores.get(jogadorAtual).getNome() + jogadores.get(jogadorAtual).getFichas());
        SecureRandom gerador = new SecureRandom();
        int numeroGerado = gerador.nextInt(100);
        for(int i=0;i<numeroGerado;i++)
        {
            numeroAtual++;
            if(numeroAtual==19)
            {
                numeroAtual=1;
                if(corAtual.equals("vermelho"))
                    corAtual="preto";
                else
                    corAtual="vermelho";
            }
            setChanged();
            notifyObservers();
        }
        checarVencedor();
        numeroAtual=1;
        corAtual="vermelho";
        
    }
    
    public void checarVencedor(){
        
        System.out.println(aposta.getTipoAposta());
        String corNumero = "";
        corNumero += corAtual + numeroAtual;
        switch (aposta.getTipoAposta()) {
            case 0:
                if(aposta.getCor().equals(corAtual))
                {
                    Jogador j = this.jogadores.get(jogadorAtual);
                    this.jogadores.remove(j);
                    j.addFichas(aposta.getFichasApostadas()*2);
                    this.jogadores.add(jogadorAtual, j);
                    //apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*2);
                }   break;
            case 1:
                if(aposta.getNumero().equals(numeroAtual))
                {
                    Jogador j = this.jogadores.get(jogadorAtual);
                    this.jogadores.remove(j);
                    j.addFichas(aposta.getFichasApostadas()*4);
                    this.jogadores.add(jogadorAtual, j);
                    //apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*4);
                }   break;
            case 2:
                if(aposta.getCorNumero().equals(corNumero))
                {
                    Jogador j = this.jogadores.get(jogadorAtual);
                    this.jogadores.remove(j);
                    j.addFichas(aposta.getFichasApostadas()*8);
                    this.jogadores.add(jogadorAtual, j);
                    //apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*8);
                }   break;    
            default:
                break;
        }
        aposta.setFichasApostadas(0);
        modeloCadastro.setJogadores(this.jogadores); //atualiza o ArrayList do cadastro
            
        setChanged();
        notifyObservers();
    }
    
}
