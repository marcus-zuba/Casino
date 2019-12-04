/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.Menu;
import Modelo.VinteeUm;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author marcus
 */
public class VinteeUmHandler implements MouseListener{

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

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent().getName().equals("Menu")){
            modeloMenu.setVisible(true);
            modelo21.setVisible(false);
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
