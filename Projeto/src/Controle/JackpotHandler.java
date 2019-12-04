/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Jackpot;
import Modelo.Menu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author marcus
 */
public class JackpotHandler implements MouseListener{
    
    Jackpot modeloJackpot;
    Menu modeloMenu;
    
    public JackpotHandler(Jackpot modelo, Menu modeloMenu){
        this.modeloJackpot=modelo;
        this.modeloMenu=modeloMenu;
    }
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent().getName().equals("Menu")){
            modeloJackpot.setVisible(false);
            modeloMenu.setVisible(true);
        }
        else if(e.getComponent().getName().equals("InstrucoesMenu")){
            modeloJackpot.setVisible(false);
            modeloJackpot.setRegrasIsVisible(false);
            modeloMenu.setVisible(true);
        }
        else if(e.getComponent().getName().equals("Comecar")){
            modeloJackpot.setRegrasIsVisible(false);
            modeloJackpot.setVisible(true);
        }
        else if(e.getComponent().getName().equals("Regras")){
            modeloJackpot.setRegrasIsVisible(true);
            modeloJackpot.setVisible(false);
        } 
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
        if(evt.getComponent().getName().equals("Jogar"))
            modeloJackpot.rodar();
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
