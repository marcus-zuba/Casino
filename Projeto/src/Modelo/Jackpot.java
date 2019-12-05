/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
package Modelo;

import java.security.SecureRandom;
/**
 *
 * @author Tony
 */
public class Jackpot extends JogoCasino{
    
    private Cadastro modeloCadastro;
    private boolean isVisible;
    private boolean regrasIsVisible;
    private int aposta;
    private int campo1;
    private int campo2;
    private int campo3;
    
    public Jackpot(){
        super();
        campo1=10;
        campo2=10;
        campo3=10;
        jogadorAtual = 0;
        isVisible = false;
        regrasIsVisible = false;
    }

    public void setModeloCadastro(Cadastro modeloCadastro) {
        this.modeloCadastro = modeloCadastro;
    }
    
    public void resetarJogo(){
        campo1=10;
        campo2=10;
        campo3=10;    
    }
    
    public void proximoJogador(){
        this.jogadorAtual++;
        if(jogadorAtual == jogadores.size())
            jogadorAtual=0;
        System.out.println(jogadores.get(jogadorAtual).getNome());
    }
        
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        this.isVisible=b;
        this.setChanged();
        this.notifyObservers();
    }

    public void setRegrasIsVisible(boolean regrasIsVisible) {
        this.regrasIsVisible = regrasIsVisible;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean regrasIsVisible(){
        return this.regrasIsVisible;
    }
    
    public int quantidadeIguais(){
        if(campo1 == campo2 && campo1 != campo3)
            return 2;
        else if(campo1 == campo3 && campo1 != campo2)
            return 2;
        else if(campo2 == campo3 && campo2 != campo1)
            return 2;
        else if(campo1 == campo2 && campo1 == campo3)
            return 3;
        else
            return 0;
    }
    
    public void verificaVitoria(){
        if(quantidadeIguais()==2){
            Jogador j = this.jogadores.get(jogadorAtual);
            this.jogadores.remove(j);
            j.addFichas(aposta*2);
            this.jogadores.add(jogadorAtual, j);
        }
        if(quantidadeIguais()==3){
            Jogador j = this.jogadores.get(jogadorAtual);
            this.jogadores.remove(j);
            j.addFichas(aposta*8);
            this.jogadores.add(jogadorAtual, j);
        }
    }

    public int getCampo1() {
        return campo1;
    }

    public int getCampo2() {
        return campo2;
    }

    public int getCampo3() {
        return campo3;
    }
    
    public void rodar(int aposta) throws FichasInsuficientesException, InterruptedException{
        
        this.aposta=aposta;
        Jogador j = this.jogadores.get(jogadorAtual);
        this.jogadores.remove(j);
        j.reduzirFichas(aposta);
        this.jogadores.add(jogadorAtual, j);
        SecureRandom gerador = new SecureRandom();
        campo1 = gerador.nextInt(5);
        campo2 = gerador.nextInt(5);
        campo3 = gerador.nextInt(5);
        verificaVitoria();
        modeloCadastro.setJogadores(this.jogadores); //atualiza o ArrayList do cadastro
        this.setChanged();
        this.notifyObservers();
    }    
    
}
