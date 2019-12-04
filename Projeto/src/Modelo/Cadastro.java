/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Observable;

/**
 *
 * @author marcus
 */
public class Cadastro extends Observable {
    
    private boolean isVisible;
    
    public Cadastro(){
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
}
