/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.JogadorNaoEncontradoException;
import Modelo.Loja;
import Modelo.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author marcus
 */
public class LojaHandler implements MouseListener,KeyListener {

    private String nomeAtual;
    private Integer fichasAtuais;
    private Loja modeloLoja;
    private Menu modeloMenu;
    
    public LojaHandler(Loja modeloLoja,Menu modeloMenu){
        
        this.modeloLoja=modeloLoja;
        this.modeloMenu=modeloMenu;
        
    }
    
    public void mousePressedd(MouseEvent me) throws JogadorNaoEncontradoException {
        if(me.getSource() instanceof JButton)
        {
            if(((JButton)me.getSource()).getName().equals("comprar"))
            {
                modeloLoja.addFichas(nomeAtual, fichasAtuais);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getComponent().getName().equals("Menu")){
            modeloMenu.setVisible(true);
            modeloLoja.setVisible(false);
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(ke.getSource() instanceof JTextField)
        {
            if(((JTextField)ke.getSource()).getName().equals("nome"))
                nomeAtual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("fichas"))
                fichasAtuais=(Integer.parseInt(((JTextField)ke.getSource()).getText()));
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
