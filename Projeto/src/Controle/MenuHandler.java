/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Visao.*;
import javax.swing.JFrame;

/**
 *
 * @author Tony
 */
public class MenuHandler implements ActionListener, MouseListener, KeyListener{
    
    JMenu menu;
    JInstrucoes instrucoes;
    JLoja loja;
    JCadastro cadastro;
    JRoleta roleta;
    JJackpot jackpot;
    JVinteeUm vinteeum;
    
    public void setMenu(JMenu menu){
        this.menu=menu;
    }

    public void setInstrucoes(JInstrucoes instrucoes) {
        this.instrucoes = instrucoes;
    }

    public void setLoja(JLoja loja) {
        this.loja = loja;
    }

    public void setCadastro(JCadastro cadastro) {
        this.cadastro = cadastro;
    }

    public void setRoleta(JRoleta roleta) {
        this.roleta = roleta;
    }
    
    public void setVinteeum(JVinteeUm vinteeum) {
        this.vinteeum = vinteeum;
    }

    public void setJackpot(JJackpot jackpot) {
        this.jackpot = jackpot;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        if(e.getComponent().getName().equals("Instrucoes")){
            instrucoes.setVisible(true);
            menu.setVisible(false);
        }
        else if(e.getComponent().getName().equals("Cadastro")){
            cadastro.setVisible(true);
            menu.setVisible(false);
        }
        else if(e.getComponent().getName().equals("21")){
            vinteeum.setVisible(true);
            menu.setVisible(false);
        }
        else if(e.getComponent().getName().equals("Loja")){
            loja.setVisible(true);
            menu.setVisible(false);
        }
        else if(e.getComponent().getName().equals("Jackpot")){
            jackpot.setVisible(true);
            menu.setVisible(false);
        }
        else if(e.getComponent().getName().equals("Roleta")){
            roleta.setVisible(true);
            menu.setVisible(false);
        }
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void keyReleased(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
