/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.FichasInsuficientesException;
import Modelo.Jackpot;
import Modelo.Menu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        else if(e.getComponent().getName().equals("Jogar")){
            try {
                try {
                    modeloJackpot.rodar();
                } catch (InterruptedException ex) {
//                    Logger.getLogger(JackpotHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FichasInsuficientesException ex) {
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent evt) {
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
