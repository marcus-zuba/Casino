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
 * @author marcus
 */
public class Loja extends Observable{
    
    private Casino modeloCasino;
    private boolean isVisible;
    
    public Loja(Casino casino){
        this.modeloCasino = casino;
        isVisible = false;
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        this.isVisible = b; 
        this.setChanged();
        this.notifyObservers();
    }
    
    public void addFichas(String nome,Integer fichasExtras){
        HashMap <Jogador,Integer> casino = modeloCasino.getCasino();
        Set k = casino.keySet();
        Iterator<Jogador> it = k.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            if(aux.getNome().equals(nome))
            {
                Integer i = casino.get(aux);
                i+=fichasExtras;
                casino.remove(aux);
                casino.put(aux, i);
                modeloCasino.printarJogadores();
            }
        }
        modeloCasino.setCasino(casino);
    }
}
