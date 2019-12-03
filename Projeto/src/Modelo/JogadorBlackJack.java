package Modelo;

import java.util.ArrayList;

public class JogadorBlackJack extends Jogador{
    
    private ArrayList <Carta> mao;

    public JogadorBlackJack(String nome, Integer idade, String RG) {
        super(nome, idade, RG);
        this.mao = new ArrayList<>();
    }
    
    public void setArray(ArrayList <Carta> al){
        this.mao= al;
    }
    
    public ArrayList <Carta> getArray(){
        return this.mao;
    }
        
    public boolean recebeCarta(Carta c){
        mao.add(c);
        return true;
    }
    
    public int getValorTotal(){
        int total =0;
                
        for(int i=0; i< mao.size(); i++)
            total = mao.get(i).getValor();
          
        return total;
    }
    
}
