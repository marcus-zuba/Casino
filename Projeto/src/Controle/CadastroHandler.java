package Controle;

import Modelo.Cadastro;
import Modelo.IdadeInsuficienteException;
import Modelo.Menu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CadastroHandler implements MouseListener,KeyListener{

    private Cadastro cadastro;
    private Menu menu;
    
    private String nomeAtual;
    private String RGatual;
    private Integer idadeAtual;
    
    public CadastroHandler(Cadastro cadastro, Menu menu){
        
        this.cadastro = cadastro;
        this.menu=menu;
        nomeAtual="";
        RGatual="";
        idadeAtual=0;
        
    }
    
    public void mousePressedd(MouseEvent me) throws IdadeInsuficienteException {
        if(me.getSource() instanceof JButton)
        {
            if(((JButton)me.getSource()).getName().equals("cadastrar"))
            {
                cadastro.cadastrarJogador(nomeAtual, idadeAtual, RGatual);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent().getName().equals("Menu")){
            cadastro.setVisible(false);
            menu.setVisible(true);
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
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke){
        if(ke.getSource() instanceof JTextField)
        {
            if(((JTextField)ke.getSource()).getName().equals("nome"))
                nomeAtual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("RG"))
                RGatual=((JTextField)ke.getSource()).getText();
            if(((JTextField)ke.getSource()).getName().equals("idade"))
                idadeAtual=Integer.parseInt(((JTextField)ke.getSource()).getText());
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
