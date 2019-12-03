/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Set;

/**
 *
 * @author eduardo
 */
public abstract class JogoCasino extends Observable{

    //Olhem exemplo do jogo do Arthur, ele achou melhor ele mesmo gerenciar o seu HashMap de jogadores com outras classes
    //Não precisa se ater a este porém já é meio caminho andado caso seja conveniente usá-lo
    //Caso vá usar outros, sobreescreva os métodos relacionados a ele ams mantenha-o atualizado
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
    
    //Retornar o hashmap de jogadores e suas fichas atuais(como quando encerrar a mesa e todos saírem)
    public HashMap<Jogador,Integer> getJogadores(){
        return this.jogadores;
    }
    
    //Retirar um unico jogador do jogo
    public HashMap<Jogador,Integer> retiraDoJogo(Jogador jogador) throws JogadorNaoEncontradoException{
        if(!this.jogadores.containsKey(jogador))
            throw new JogadorNaoEncontradoException();
        Integer fichas = this.jogadores.get(jogador);
        this.jogadores.remove(jogador);
        HashMap<Jogador,Integer> response = new HashMap<Jogador,Integer>();
        response.put(jogador, fichas);
        return response;
    }
    
    //Adicionar um jogador ao HashMap do jogo e retirar do HashMap do menu (retirar ainda deve ser tratado quando este método for chamado)
    public void adicionarJogador(Jogador jogador, Integer fichas) throws FichasInsuficientesException{
        this.jogadores.put(jogador, fichas);
    }
    
    //Retornar aposta minima
    public Integer getApostaMinima(){
        return this.apostaMinima;
    }
    
    //Retornar nome do jogo
    public String getNomeJogo(){
        return this.nomeJogo;
    }
    
    //Retornar numero maximo de jogadores
    public Integer getNumeroMaximoJogadores(){
        return this.numeroMaximoJogadores;
    }
    
    //Esse método vai retornar o HashMap de jogadores que não tem fichas suficientes para fazer a aposta minima quando ele for chamado
    public HashMap<Jogador,Integer> confereFichas(){
        HashMap<Jogador,Integer> response = new HashMap<>();
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
