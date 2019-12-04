/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.Instrucoes;
import Modelo.Menu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author arthur
 */
public class InstrucoesHandler implements MouseListener{

    Instrucoes modeloInstrucoes;
    Menu modeloMenu;
    
    public InstrucoesHandler(Instrucoes modeloInstrucoes, Menu modeloMenu){
        this.modeloInstrucoes = modeloInstrucoes;
        this.modeloMenu = modeloMenu;
    }
    
    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent().getName().equals("Menu")){
            modeloInstrucoes.setVisible(false);
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
    
}
