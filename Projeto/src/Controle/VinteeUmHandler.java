/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.FichasInsuficientesException;
import Modelo.Menu;
import Modelo.VinteeUm;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author marcus
 */
public class VinteeUmHandler implements MouseListener,KeyListener{

    Menu modeloMenu;
    VinteeUm modelo21;

    public VinteeUmHandler(Menu modeloMenu, VinteeUm modelo21) {
        this.modeloMenu = modeloMenu;
        this.modelo21 = modelo21;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mousePressedd(MouseEvent e) throws FichasInsuficientesException{
        switch (e.getComponent().getName()) {
            case "Menu":
                modeloMenu.setVisible(true);
                modelo21.setVisible(false);
                break;
            case "Regras":
                modelo21.setVisible(false);
                modelo21.setRegrasIsVisible(true);
                break;
            case "ProxCarta":
                modelo21.adicionarCarta();
                break;
            case "ProxJogador":
                modelo21.proximoJogador();
                break;
            case "Parar":
                modelo21.parar();
                break;
            default:
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) { //Eventos das instrucoes
        if(e.getComponent().getName().equals("Comecar")){
            modelo21.setRegrasIsVisible(false);
            modelo21.setVisible(true);
        }
        else if(e.getComponent().getName().equals("Menu")){
            modelo21.setRegrasIsVisible(false);
            modeloMenu.setVisible(true);
        }
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void keyPressed(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        modelo21.setAposta(Integer.parseInt(((JTextField)e.getSource()).getText()));
    }
    
}
