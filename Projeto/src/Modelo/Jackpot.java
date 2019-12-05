/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
 
package Modelo;

import Visao.JJackpot;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tony
 */
public class Jackpot extends JogoCasino{
    
    private boolean isVisible;
    private boolean regrasIsVisible;
    private int rodada;
    private int campo1;
    private int campo2;
    private int campo3;
    
    public Jackpot(){
        super();
        campo1=10;
        campo2=10;
        campo3=10;
        isVisible = false;
        regrasIsVisible = false;
    }

    public void resetarJogo(){
        campo1=10;
        campo2=10;
        campo3=10;    
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
    
    public boolean verificaVitoria(){
        if(campo1 == campo2 && campo2 == campo3 && campo1!=10){
            return true;
        }
        return false;
    }

    public int getCampo1() {
        return campo1;
    }

    public int getCampo2() {
        return campo2;
    }

    public int getCampo3() {
        return campo3;
    }
    
    public void rodar() throws FichasInsuficientesException, InterruptedException{
        SecureRandom gerador = new SecureRandom();
        campo1 = gerador.nextInt(5);
        campo2 = gerador.nextInt(5);
        campo3 = gerador.nextInt(5);
        this.setChanged();
        this.notifyObservers();
    }    
    
}
