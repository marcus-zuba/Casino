/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.FichasInsuficientesException;
import Modelo.Jogador;
import Modelo.Roleta;
import Modelo.Menu;
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
    private Menu menu;
    private String apostaAtual;
    private Jogador jogadorAtual;
    private String corAtual;
    private int numeroAtual;
    private Integer valorApostado;    
    
    public RoletaHandler(Roleta roleta,Menu menu){
        
        this.roleta = roleta;
        this.menu = menu;
        apostaAtual="";
        
    }
    
    public String getApostaAtual() {
        return apostaAtual;
    }

    public void setApostaAtual(String apostaAtual) {
        this.apostaAtual = apostaAtual;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    public void mousePressedd(MouseEvent me) throws FichasInsuficientesException {
        if(me.getComponent().getName().equals("Menu")){
            roleta.setVisible(false);
            menu.setVisible(true);
        }else if(me.getComponent().getName().equals("Regras")){
            roleta.setVisible(false);
            roleta.setRegrasIsVisible(true);
        }
        else{
            
            jogadorAtual = roleta.getJogadores().get(roleta.getJogadorAtual());
//            System.out.println("jogadorAtual do handler " + jogadorAtual.getNome());
            
            if(me.getSource() instanceof JButton)
            {
                if(((JButton)me.getSource()).getName().equals("sortear"))
                {
                    if(apostaAtual.equals("cor"))
                    {
                        roleta.fazerApostaCor(jogadorAtual,valorApostado,corAtual);
                    }
                    else if(apostaAtual.equals("numero"))
                    {
                        roleta.fazerApostaNumero(jogadorAtual,valorApostado,numeroAtual);
                    }
                    else if(apostaAtual.equals("corNumero"))
                    {
                        String aux = "";
                        aux += corAtual + numeroAtual;
                        roleta.fazerApostaCorNumero(jogadorAtual,valorApostado,aux);
                    }
                    try {
                        roleta.girarRoleta();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RoletaHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if(((JButton)me.getSource()).getName().equals("proximo"))
                {
                    roleta.proximoJogador();
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
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(ke.getSource() instanceof JTextField)
        {
            if(((JTextField)ke.getSource()).getName().equals("cor"))
                corAtual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("numero"))
                numeroAtual=Integer.parseInt(((JTextField)ke.getSource()).getText());
            if(((JTextField)ke.getSource()).getName().equals("aposta"))
                valorApostado=Integer.parseInt(((JTextField)ke.getSource()).getText());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) { //Eventos só da tela de regras
        if(e.getComponent().getName().equals("Comecar")){
            roleta.setRegrasIsVisible(false);
            roleta.setVisible(true);
        }
        if(e.getComponent().getName().equals("Menu")){
            roleta.setRegrasIsVisible(false);
            menu.setVisible(true);
        }
        
    }
    
}
