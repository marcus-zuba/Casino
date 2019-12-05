/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Tony
 */
public class MenuHandler implements ActionListener, MouseListener, KeyListener{
    
    Menu modeloMenu;
    Roleta modeloRoleta;
    Jackpot modeloJackpot;
    VinteeUm modelo21;
    Loja modeloLoja;
    Cadastro modeloCadastro;
    Instrucoes modeloInstrucoes;
    
    
    public MenuHandler(Menu modeloMenu){
        
        this.modeloMenu=modeloMenu;
        
    }

    public void setModeloMenu(Menu modeloMenu) {
        this.modeloMenu = modeloMenu;
    }

    public void setModeloRoleta(Roleta modeloRoleta) {
        this.modeloRoleta = modeloRoleta;
    }

    public void setModeloJackpot(Jackpot modeloJackpot) {
        this.modeloJackpot = modeloJackpot;
    }

    public void setModelo21(VinteeUm modelo21) {
        this.modelo21 = modelo21;
    }

    public void setModeloLoja(Loja modeloLoja) {
        this.modeloLoja = modeloLoja;
    }

    public void setModeloCadastro(Cadastro modeloCadastro) {
        this.modeloCadastro = modeloCadastro;
    }

    public void setModeloInstrucoes(Instrucoes modeloInstrucoes) {
        this.modeloInstrucoes = modeloInstrucoes;
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
        
        switch (e.getComponent().getName()) {
            case "Instrucoes":
                modeloInstrucoes.setVisible(true);
                modeloMenu.setVisible(false);
                break;
            case "Cadastro":
                modeloCadastro.setVisible(true);
                modeloMenu.setVisible(false);
                break;
            case "Cadastrar":
                modeloCadastro.cadastrarNoArquivo();                
                break;
            case "Ler":
                modeloCadastro.lerDoArquivo();                
                break;
            case "21":
                modelo21.setVisible(true);
                modeloMenu.setVisible(false);
                break;
            case "Loja":
                modeloLoja.setVisible(true);
                modeloMenu.setVisible(false);
                break;
            case "Jackpot":
                modeloJackpot.setVisible(true);
                modeloMenu.setVisible(false);
                break;
            case "Roleta":
                modeloMenu.setVisible(false);
                modeloRoleta.setVisible(true);
                break;
            case "Sair":
                System.exit(0);
                break;
            default:
                break;
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
    public void keyReleased(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
