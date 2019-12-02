/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Jogador;
import Modelo.Roleta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 
 * @author marcus
 */
public class RoletaHandler implements ActionListener , MouseListener, KeyListener{


    private Roleta roleta;
    private String apostaAtual;
    private Jogador jogadorAtual;
    private String corAtual;
    private int numeroAtual;
    private Integer valorApostado;
    
    public String getApostaAtual() {
        return apostaAtual;
    }

    public void setApostaAtual(String apostaAtual) {
        this.apostaAtual = apostaAtual;
    }
    
    
    public RoletaHandler(Roleta roleta){
        
        this.roleta = roleta;
        apostaAtual="";
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource() instanceof JButton)
        {
            if(((JButton)me.getSource()).getName().equals("sortear"))
            {
                try {
                    roleta.girarRoleta();
                } catch (InterruptedException ex) {
                    Logger.getLogger(RoletaHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(((JButton)me.getSource()).getName().equals("proximo"))
            {
                if(apostaAtual.equals("cor"))
                {
                    roleta.fazerApostaCor(jogadorAtual,valorApostado,corAtual);
                    roleta.proximoJogador();
                }
                else if(apostaAtual.equals("numero"))
                {
                    roleta.fazerApostaNumero(jogadorAtual,valorApostado,numeroAtual);
                    roleta.proximoJogador();
                }
                else if(apostaAtual.equals("corNumero"))
                {
                    String aux = "";
                    aux += corAtual + numeroAtual;
                    roleta.fazerApostaCorNumero(jogadorAtual,valorApostado,aux);
                    roleta.proximoJogador();
                }
            }
            {
                try {
                    roleta.girarRoleta();
                } catch (InterruptedException ex) {
                    Logger.getLogger(RoletaHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(me.getSource() instanceof JRadioButton)
        {
            if(((JRadioButton)me.getSource()).getName().equals("cor"))
                setApostaAtual("cor");
            else if(((JRadioButton)me.getSource()).getName().equals("numero"))
                setApostaAtual("numero");
            else if(((JRadioButton)me.getSource()).getName().equals("corNumero"))
                setApostaAtual("corNumero");
        }
        System.out.println(getApostaAtual());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getSource() instanceof JTextField)
        {
            if(((JTextField)ke.getSource()).getName().equals("cor"))
                corAtual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("numero"))
                numeroAtual=Integer.parseInt(((JTextField)ke.getSource()).getText());
            if(((JTextField)ke.getSource()).getName().equals("aposta"))
                valorApostado=Integer.parseInt(((JTextField)ke.getSource()).getText());
            System.out.println(numeroAtual + " " + corAtual + " " + valorApostado);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
