package Modelo;

import Modelo.Jogador;
import Modelo.JogoCasino;
import Modelo.JogadorNaoEncontradoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator; //pesquisar essa classe depois que pode ser útil
import java.util.Observable;
import java.util.Scanner;
import java.util.Set;


public class Menu extends Observable{

    
    private boolean isVisible;
    private Cadastro cadastro;
    
    public Menu(){
        
        isVisible = true;
        
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        this.isVisible = b;
        System.out.println(isVisible);
        cadastro.printarJogadores();
        this.setChanged();
        this.notifyObservers();
    }
    
}
