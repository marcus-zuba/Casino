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
    
    public Menu(){
        
        isVisible = true;
        
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        this.isVisible = b;
        System.out.println(isVisible);
        this.setChanged();
        this.notifyObservers();
    }
    
}
