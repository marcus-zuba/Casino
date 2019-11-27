/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author eduardo
 */
public abstract class JogoCasino {
    protected HashMap<Jogador, Integer> jogadores;
    protected Integer numeroMaximoJogadores;
    protected String nomeJogo;
    
    public String getNomeJogo(){
        return this.nomeJogo;
    }
    
    public JogoCasino(String nome,Integer numeroMaximo){
        this.numeroMaximoJogadores = numeroMaximo;
        this.nomeJogo = nome;
        this.jogadores = null;
    }
    
    public JogoCasino(String nome){
        this.numeroMaximoJogadores = LIMITE_BOM_SENSO_ARBITRARIO;
        this.nomeJogo = nome;
        this.jogadores = null;
    }
    
    public boolean adicionaJogador(Jogador jogador, Integer fichas){
        if(jogadores.size() < this.numeroMaximoJogadores){
            jogadores.put(jogador, fichas);
            return true;
        }
        return false;
    }
    
    //Esse método deve retornar as instruções q deverão aparecer quando clicado em instruções ou help na tela do jogo
    public abstract String instrucoesDoJogo();
    //Esse método ainda está em discussão sobre ser lucro do dia, ou da partida ou seilá, mas vai ser or eferencial pro casino ter controle de quanto está lucrando
    public abstract Integer lucroDoDia();
    
    //tira isso daqui antes de entregar o trabalho e bota um valor lá q tá bom
    private final static int LIMITE_BOM_SENSO_ARBITRARIO = 100;
}
