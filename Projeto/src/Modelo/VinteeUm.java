/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Tony
 */
public class VinteeUm extends JogoCasino{
    
    private boolean isVisible;
    
    public VinteeUm(){
        super();
        isVisible = false;
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        isVisible = b;
        this.setChanged();
        this.notifyObservers();
    }

    
}
