/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Set;

/**
 *
 * @author Tony
 */
public class Roleta extends Observable implements JogoCasino{


    private HashMap <Jogador,ApostaRoleta> apostas;
    private HashMap <Jogador,Integer> ganhadores;
    private Integer apostaMinima = 100;
    private Integer numeroMaximo;
    private Integer lucroAtual;
    private String corAtual;
    private String nome;
    private SecureRandom gerador;
    private int numeroAtual;
    
    public Roleta() {
        
        nome = "Roleta";
        corAtual = "vermelho";
        numeroAtual = 1;
        lucroAtual=0;
        gerador = new SecureRandom();
        apostas = new HashMap<Jogador,ApostaRoleta>();
        ganhadores = new HashMap<Jogador,Integer>();
        numeroMaximo = JogoCasino.LIMITE_BOM_SENSO_ARBITRARIO;
        
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
    public boolean adicionarJogador(Jogador jogador, Integer fichas){
        
        if(fichas>=apostaMinima)
        {
            ApostaRoleta temp = new ApostaRoleta(fichas);
            apostas.put(jogador, temp);
            return true;
        }
        else
            return false;
            
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

    @Override
    public String getNomeJogo() {
        
        return nome;
        
    }

    @Override
    public Integer getApostaMinima() {
        
        return apostaMinima;
        
    }

    @Override
    public Integer getNumeroMaximoJogadores() {
        
        return numeroMaximo;
        
    }

    @Override
    public HashMap<Jogador, Integer> getJogadores() {
        
        HashMap<Jogador,Integer> jogadores = new HashMap<Jogador,Integer>();
        Set<Jogador> k = apostas.keySet();
        Iterator<Jogador> it = k.iterator();
        while(it.hasNext())
        {
            Jogador aux = it.next();
            jogadores.put(aux, apostas.get(aux).getFichasAtuais());
            apostas.remove(aux);
        }
        return jogadores;
        
    }

    @Override
    public HashMap<Jogador, Integer> retiraDoJogo(Jogador jogador) throws JogadorNaoEncontradoException {

        HashMap<Jogador,Integer> jogadorRetirado = new HashMap<Jogador,Integer>();
        if(apostas.get(jogador)!=null)
        {
            jogadorRetirado.put(jogador, apostas.get(jogador).getFichasAtuais());
            apostas.remove(jogador);
        }
        else
            throw new JogadorNaoEncontradoException();
        return jogadorRetirado;
        
    }

    @Override
    public HashMap<Jogador, Integer> confereFichas() {
        
        HashMap<Jogador,Integer> jogadores = new HashMap<Jogador,Integer>();
        Set<Jogador> k = apostas.keySet();
        Iterator<Jogador> it = k.iterator();
        while(it.hasNext())
        {
            Jogador aux = it.next();
            if(apostas.get(aux).getFichasAtuais()<apostaMinima)
            {
                jogadores.put(aux, apostas.get(aux).getFichasAtuais());
                apostas.remove(aux);
            }
        }
        return jogadores;
        
    }
    
}
