/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Tony
 */
public class Roleta extends JogoCasino{

    private boolean isVisible;
    private HashMap <Jogador,ApostaRoleta> apostas;
    private String corAtual;
    private int numeroAtual;
    private Cadastro modeloCadastro;
    
    public Roleta() {
        super();
        jogadorAtual=0;
        isVisible = false;
        corAtual = "vermelho";
        numeroAtual = 1;
        apostas = new HashMap<>();        
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
        
        if(apostas.get(jogador).getFichasAtuais()>valorJogada)
        {
            apostas.get(jogador).fazerApostaCor(valorJogada, jogada);
            return true;
        }
        else
            return false;
        
    }
    
    public boolean fazerApostaNumero(Jogador jogador,Integer valorJogada,int numero){
        
        if(apostas.get(jogador).getFichasAtuais()>valorJogada)
        {
            apostas.get(jogador).fazerApostaNumero(valorJogada, numero);
            return true;
        }
        else
            return false;
        
        
    }
    
    public boolean fazerApostaCorNumero(Jogador jogador,Integer valorJogada,String jogada){
        
        if(apostas.get(jogador).getFichasAtuais()>valorJogada)
        {
            apostas.get(jogador).fazerApostaCorNumero(valorJogada, jogada);
            return true;
        }
        else
            return false;
        
    }
    
    public void proximoJogador(){
        this.jogadorAtual++;
    }
    
    public void girarRoleta() throws InterruptedException{
        //reduzir as fichas do jogador e retornar o arraylist pro cadastro
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
        
        String testeCorNumero = "";
        testeCorNumero += corAtual + numeroAtual;
        Set<Jogador> k = apostas.keySet();
        Iterator<Jogador> it = k.iterator();
        while(it.hasNext())
        {
            Jogador aux = it.next();
            if(apostas.get(aux).getCor().equals(corAtual))
            {
                this.jogadores.get(jogadorAtual).addFichas(apostas.get(aux).getFichasApostadas()*2);
//                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*2);
            }
            else if(apostas.get(aux).getNumero().equals(numeroAtual))
            {
                this.jogadores.get(jogadorAtual).addFichas(apostas.get(aux).getFichasApostadas()*4);
//                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*4);
            }
            else if(apostas.get(aux).getCorNumero().equals(testeCorNumero))
            {
                this.jogadores.get(jogadorAtual).addFichas(apostas.get(aux).getFichasApostadas()*8);
//                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*8);
            }
            apostas.get(aux).setFichasApostadas(0);
            
            //voltar o arraylist pro cadastro
        }
        proximoJogador();
        setChanged();
        notifyObservers();
    }
    
}
