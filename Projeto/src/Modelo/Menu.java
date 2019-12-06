package Modelo;

import java.util.Observable;

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
        this.setChanged();
        this.notifyObservers();
    }
    
}
