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


    private HashMap <Jogador,ApostaRoleta> apostas;
    private HashMap <Jogador,Integer> ganhadores;
    private Integer lucroAtual;
    private String corAtual;
    private SecureRandom gerador;
    private int numeroAtual;
    
    public Roleta() {
        super("Roleta",100);
        corAtual = "vermelho";
        numeroAtual = 1;
        lucroAtual=0;
        gerador = new SecureRandom();
        apostas = new HashMap<>();
        ganhadores = new HashMap<>();
        
    }
    
    public Integer getLucroAtual() {
        return lucroAtual;
    }

    public void setLucroAtual(Integer lucroAtual) {
        this.lucroAtual = lucroAtual;
    }

    public int getNumeroAtual() {
        return numeroAtual;
    }

    public String getCorAtual() {
        return corAtual;
    }

    @Override
    public String instrucoesDoJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer lucroDoDia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void adicionarJogador(Jogador jogador, Integer fichas) throws FichasInsuficientesException{
        
        if(fichas>=apostaMinima)
        {
            super.adicionarJogador(jogador, fichas);
            ApostaRoleta temp = new ApostaRoleta(fichas);
            apostas.put(jogador, temp);
        }
        else
            throw new FichasInsuficientesException();
            
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
        
        
        
    }
    
    public void girarRoleta() throws InterruptedException{
        
        int numeroGerado = gerador.nextInt(100);
        for(int i=0;i<numeroGerado;i++)
        {
            Thread.currentThread().sleep(200);
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
            numeroAtual++;
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
                ganhadores.put(aux,apostas.get(aux).getFichasApostadas()*2);
                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*2);
                lucroAtual-=apostas.get(aux).getFichasApostadas()*1;
            }
            else if(apostas.get(aux).getNumero().equals(numeroAtual))
            {
                ganhadores.put(aux,apostas.get(aux).getFichasApostadas()*4);
                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*4);
                lucroAtual-=apostas.get(aux).getFichasApostadas()*3;
            }
            else if(apostas.get(aux).getCorNumero().equals(testeCorNumero))
            {
                ganhadores.put(aux,apostas.get(aux).getFichasApostadas()*8);
                apostas.get(aux).setFichasAtuais(apostas.get(aux).getFichasAtuais() + apostas.get(aux).getFichasApostadas()*8);
                lucroAtual-=apostas.get(aux).getFichasApostadas()*7;
            }
            else
            {
                lucroAtual+=apostas.get(aux).getFichasApostadas();
            }           
            apostas.get(aux).setFichasApostadas(0);
        }
        setChanged();
        notifyObservers();
    }

    //Remove todos os jogadores do jogo e retorna o HashMap de todos os jogadores removidos com suas respectivas fichas
    public HashMap<Jogador, Integer> removeTodosOsJogadores() {
        
        HashMap<Jogador,Integer> response = new HashMap<>();
        Set<Jogador> k = apostas.keySet();
        Iterator<Jogador> it = k.iterator();
        while(it.hasNext())
        {
            Jogador aux = it.next();
            response.put(aux, apostas.get(aux).getFichasAtuais());
            try{
                this.retiraDoJogo(aux);
            }catch(JogadorNaoEncontradoException e){
                System.err.println("HashMap de apostas: "+e.getMessage());
            }
        }
        return response;
        
    }

    @Override
    public HashMap<Jogador, Integer> retiraDoJogo(Jogador jogador) throws JogadorNaoEncontradoException {

        HashMap<Jogador,Integer> jogadorRetirado = new HashMap<>();
        if(apostas.containsKey(jogador))
        {
            try{
                super.retiraDoJogo(jogador);
            }catch(JogadorNaoEncontradoException e){
                System.err.println("HashMap de jogadores da Roleta: "+e.getMessage());
            }
            jogadorRetirado.put(jogador, apostas.get(jogador).getFichasAtuais());
            apostas.remove(jogador);
            return jogadorRetirado;
        }
        throw new JogadorNaoEncontradoException();        
    }
    
}
