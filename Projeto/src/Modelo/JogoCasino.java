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
public abstract interface JogoCasino {

    
    //Retornar nome do jogo
    public String getNomeJogo();
    //Retornar aposta minima
    public Integer getApostaMinima();
    //Retornar numero maximo de jogadores
    public Integer getNumeroMaximoJogadores();
    //Retornar o hashmap de jogadores e suas fichas atuais(como quando encerrar a mesa e todos saírem)
    public HashMap<Jogador,Integer> getJogadores();
    //Retirar um unico jogador do jogo
    public HashMap<Jogador,Integer> retiraDoJogo(Jogador jogador) throws JogadorNaoEncontradoException;
    //Esse método vai retornar o HashMap de jogadores que não tem fichas suficientes para fazer a aposta minima quando ele for chamado
    public HashMap<Jogador,Integer> confereFichas();
    //Adicionar um jogador ao HashMap do jogo e retirar do HashMap do menu
    public boolean adicionarJogador(Jogador jogador, Integer fichas);   
    //Esse método deve retornar as instruções q deverão aparecer quando clicado em instruções ou help na tela do jogo
    public abstract String instrucoesDoJogo();
    //Esse método ainda está em discussão sobre ser lucro do dia, ou da partida ou seilá, mas vai ser or eferencial pro casino ter controle de quanto está lucrando
    public abstract Integer lucroDoDia();

    
    //tira isso daqui antes de entregar o trabalho e bota um valor lá q tá bom
    public final static int LIMITE_BOM_SENSO_ARBITRARIO = 100;
}
