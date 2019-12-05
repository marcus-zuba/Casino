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
public class Cadastro extends  JogoCasino{
    
    private boolean isVisible;
    private Roleta modeloRoleta;
    
    public Cadastro(Roleta modeloRoleta){
        super();
        this.modeloRoleta = modeloRoleta;
        this.isVisible=false;
    }
    
    public boolean isVisible(){
        return isVisible;
    }

    public void setVisible(boolean b){
        this.isVisible = b;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean cadastrarJogador(String nome, int idade, String RG){
        Jogador j = new Jogador(nome, idade, RG);
        this.jogadores.add(j);
        modeloRoleta.setJogadores(this.jogadores);
        return true;
    }
    
    public void printarJogadores(){
        for(int i=0;i<jogadores.size();i++){
            System.out.println(jogadores.get(i).getNome() + "  " + jogadores.get(i).getFichas());
        
        
        }
    }
    
}
