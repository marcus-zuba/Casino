/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Menu;
import Visao.JCacaNiquel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Visao.JCadastro;
import Visao.JInstrucoes;
import Visao.JLoja;
import Visao.JMenu;
import Visao.JRoleta;
import Visao.JVinteeUm;
import javax.swing.JButton;
/**
 *
 * @author Tony
 */
public class MenuHandler implements ActionListener, MouseListener, KeyListener{
    
    Menu modeloMenu;
    
    JMenu menu;
    JInstrucoes instrucoes;
    JLoja loja;
    JCadastro cadastro;
    JRoleta roleta;
    JCacaNiquel jackpot;
    JVinteeUm vinteeum;
    
    public MenuHandler(Menu modeloMenu){
        
        this.modeloMenu=modeloMenu;
        
    }
    
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

    public void setJackpot(JCacaNiquel jackpot) {
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
