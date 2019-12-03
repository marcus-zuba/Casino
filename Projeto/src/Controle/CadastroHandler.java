/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Jogador;
import Modelo.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author marcus
 */
public class CadastroHandler implements MouseListener,KeyListener{

    private Menu menu;
    
    private String nomeAtual;
    private String RGatual;
    private Integer idadeAtual;
    
    public CadastroHandler(Menu menu){
        
        this.menu=menu;
        nomeAtual="";
        RGatual="";
        idadeAtual=0;
        
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource() instanceof JButton)
        {
            if(((JButton)me.getSource()).getName().equals("cadastrar") && idadeAtual>17)
            {
                HashMap<Jogador,Integer>aux = new HashMap<Jogador,Integer>();
                Jogador j = new Jogador(nomeAtual,idadeAtual,RGatual);
                Integer i = 0 ;
                aux.put(j, i);
                menu.colocaNoCasino(aux);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            if(((JTextField)ke.getSource()).getName().equals("RG"))
                RGatual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("idade"))
                idadeAtual=Integer.parseInt(((JTextField)ke.getSource()).getText());
            System.out.println(nomeAtual + " " + RGatual + " " + idadeAtual);
        }
    }
    
}
