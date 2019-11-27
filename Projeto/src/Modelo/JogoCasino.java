/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author eduardo
 */
public abstract class JogoCasino {
    protected HashMap<Jogador, Integer> jogadores;
    protected Integer numeroMaximoJogadores;
    protected String nomeJogo;
    protected Integer apostaMinima;
    
    public JogoCasino(String nome,Integer numeroMaximo,Integer apostaMinima){
        this.numeroMaximoJogadores = numeroMaximo;
        this.nomeJogo = nome;
        this.apostaMinima = apostaMinima;
        this.jogadores = null;
    }
    
    public JogoCasino(String nome,Integer apostaMinima){
        this.numeroMaximoJogadores = LIMITE_BOM_SENSO_ARBITRARIO;
        this.nomeJogo = nome;
        this.apostaMinima = apostaMinima;
        this.jogadores = null;
    }

    public Integer getApostaMinima() {
        return apostaMinima;
    }

    public void setApostaMinima(Integer apostaMinima) {
        this.apostaMinima = apostaMinima;
    }
    
    public String getNomeJogo(){
        return this.nomeJogo;
    }
    
    public boolean adicionaJogador(Jogador jogador, Integer fichas){
        if(jogadores.size() < this.numeroMaximoJogadores){
            jogadores.put(jogador, fichas);
            return true;
        }
        return false;
    }
    
    public HashMap<Jogador,Integer> retiraDoJogo(Jogador jogador, Integer integer) throws jogadorNaoEncontradoNaColecaoException{
        HashMap<Jogador,Integer> response = new HashMap<>();
        if(!this.jogadores.containsKey(jogador))
            throw new jogadorNaoEncontradoNaColecaoException();
        this.jogadores.remove(jogador);
        response.put(jogador,integer);
        return response;
    }
    
    //Esse método vai retornar o HashMap de jogadores que não tem fichas suficientes para fazer a aposta minima quando ele for chamado
    protected HashMap<Jogador,Integer> confereFichas(){
        HashMap<Jogador, Integer> response = new HashMap<>();
        Set<Jogador> set = this.jogadores.keySet();
        Iterator<Jogador> it = set.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            if(this.jogadores.get(aux)<this.apostaMinima)
                response.put(aux, this.jogadores.get(aux));
        }
        return response;
    }
    
    
    
    //Esse método deve retornar as instruções q deverão aparecer quando clicado em instruções ou help na tela do jogo
    public abstract String instrucoesDoJogo();
    //Esse método ainda está em discussão sobre ser lucro do dia, ou da partida ou seilá, mas vai ser or eferencial pro casino ter controle de quanto está lucrando
    public abstract Integer lucroDoDia();
    
    //tira isso daqui antes de entregar o trabalho e bota um valor lá q tá bom
    public final static int LIMITE_BOM_SENSO_ARBITRARIO = 100;
}
