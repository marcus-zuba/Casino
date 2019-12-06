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
 * @author marcus
 */
public class Loja extends Observable{
    
    private Cadastro modeloCadastro;
    private boolean isVisible;
    
    public Loja(Cadastro cadastro){
        this.modeloCadastro = cadastro;
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
    
    public void addFichas(String nome,Integer fichasExtras) throws JogadorNaoEncontradoException{
        boolean conseguiu = false;
        System.out.println(nome);
        ArrayList <Jogador> jogadores = modeloCadastro.getJogadores();
        for(int i=0;i<jogadores.size();i++){
            if(jogadores.get(i).getNome().equals(nome))
            {
                conseguiu = true;
                Jogador j = jogadores.get(i);
                j.addFichas(fichasExtras);
                jogadores.remove(i);
                jogadores.add(i, j);
            }
        }
        if(!conseguiu)
            throw new JogadorNaoEncontradoException();
        modeloCadastro.setJogadores(jogadores);
    }
}
