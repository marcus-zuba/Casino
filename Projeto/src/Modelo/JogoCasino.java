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

    //Olhem exemplo do jogo do Arthur, ele achou melhor ele mesmo gerenciar o seu HashMap de jogadores com outras classes
    //Não precisa se ater a este porém já é meio caminho andado caso seja conveniente usá-lo
    //Caso vá usar outros, sobreescreva os métodos relacionados a ele ams mantenha-o atualizado
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
}
