/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author eduardo
 */
public abstract class JogoCasino extends Observable{

    protected ArrayList<Jogador> jogadores;
    protected Integer jogadorAtual;

    public JogoCasino(){
        this.jogadores = new ArrayList<>();
        jogadorAtual = 0;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public Integer getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void setJogadorAtual(Integer jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }    
    
    public String getNomeJogadorAtual(){
        return jogadores.get(jogadorAtual).getNome();
    }
    
    public String getFichasJogadorAtual(){
        return Integer.toString(jogadores.get(jogadorAtual).getFichas());
    }

}
