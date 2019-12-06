/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.FichasInsuficientesException;
import Modelo.Jackpot;
import Modelo.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author marcus
 */
public class JackpotHandler implements MouseListener, KeyListener{
    
    Jackpot modeloJackpot;
    Menu modeloMenu;
    int aposta;
    
    public JackpotHandler(Jackpot modelo, Menu modeloMenu){
        this.modeloJackpot=modelo;
        this.modeloMenu=modeloMenu;
    }
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void mousePressedd(MouseEvent e) throws FichasInsuficientesException{
        switch (e.getComponent().getName()) {
            case "Menu":
                modeloJackpot.setVisible(false);
                modeloMenu.setVisible(true);
                break;
            case "InstrucoesMenu":
                modeloJackpot.setVisible(false);
                modeloJackpot.setRegrasIsVisible(false);
                modeloMenu.setVisible(true);
                break;
            case "Comecar":
                modeloJackpot.setRegrasIsVisible(false);
                modeloJackpot.setVisible(true);
                break;
            case "Regras":
                modeloJackpot.setRegrasIsVisible(true);
                modeloJackpot.setVisible(false);
                break;
            case "Proximo":
                modeloJackpot.proximoJogador();
                break;
            case "Jogar":
                    modeloJackpot.rodar(aposta);
                    break;
            default:
                break;
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

    @Override
    public void keyTyped(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(!((JTextField)e.getComponent()).getText().equals(""))
            aposta = Integer.parseInt(((JTextField)e.getSource()).getText());
        System.out.println(aposta);
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
