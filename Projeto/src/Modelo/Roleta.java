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
    private Integer apostaMinima = 100;
    private int numeroAtual;
    private String corAtual;
    private SecureRandom gerador;
    private String nome;
    private Integer numeroMaximo;
    
    public Roleta() {
        
        nome = "Roleta";
        numeroMaximo = JogoCasino.LIMITE_BOM_SENSO_ARBITRARIO;
        apostas = new HashMap<Jogador,ApostaRoleta>();
        numeroAtual = 1;
        corAtual = "vermelho";
        gerador = new SecureRandom();
        
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
    
    public boolean fazerJogada(Jogador jogador,Integer valorJogada,String jogada){
        
        if(apostas.get(jogador).getFichasAtuais()>valorJogada)
        {
            apostas.get(jogador).fazerAposta(valorJogada, jogada);
            return true;
        }
        else
            return false;
        
    }
    
    public void girarRoleta() throws InterruptedException{
        
        int numeroGerado = gerador.nextInt(100);
        for(int i=0;i<numeroGerado;i++)
        {
            Thread.currentThread().sleep(200);
            numeroAtual++;
            setChanged();
            notifyObservers();
        }
        
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
