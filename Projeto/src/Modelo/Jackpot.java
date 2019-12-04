/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
package Modelo;

import java.security.SecureRandom;
/**
 *
 * @author Tony
 */
public class Jackpot extends JogoCasino{
    
    private boolean isVisible;
    private boolean regrasIsVisible;
    private int campo1;
    private int campo2;
    private int campo3;
    
    public Jackpot(){
        super("Teste",0);
        campo1=0;
        campo2=0;
        campo3=0;
        isVisible = false;
        regrasIsVisible = false;
    }

    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        this.isVisible=b;
        this.setChanged();
        this.notifyObservers();
    }

    public void setRegrasIsVisible(boolean regrasIsVisible) {
        this.regrasIsVisible = regrasIsVisible;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean regrasIsVisible(){
        return this.regrasIsVisible;
    }
    
    public void rodar(){
        SecureRandom gerador = new SecureRandom();
        campo1 = gerador.nextInt(5);
        campo2 = gerador.nextInt(5);
        campo3 = gerador.nextInt(5);
        this.setChanged();
        this.notifyObservers();
    }    

    @Override
    public String instrucoesDoJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer lucroDoDia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
