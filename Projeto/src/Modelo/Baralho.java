package Modelo;

import java.util.ArrayList;
import java.security.SecureRandom;

public class Baralho {
    
    private ArrayList <Carta> baralho;
    private SecureRandom gerador;
    private String [] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
    
    public Baralho(){
        this.baralho= new ArrayList<>();
        this.gerador= new SecureRandom();
        
        for(int n=0; n<4; n++){
            for(int i=1, u=i; i<14; i++){
                if(i==1)
                    u=11;
                if(i>10)
                    u=10;
                Carta c = new Carta(naipes[n],u);
                baralho.add(c);
                u=i;
            }
        }
    }
    
    public ArrayList <Carta> getBar(){
        return this.baralho;
    }
    
    public void setBar(ArrayList <Carta> b){
        this.baralho=b;
    }
    
    
    public boolean embaralharCartas(){
        for(int i=0; i<baralho.size(); i++){
            int num = gerador.nextInt(baralho.size());
            baralho.add(baralho.get(num));
            baralho.remove(baralho.get(num));
        }
        
        return true;
    }
    
    public Carta distribuirCarta(){
        
        int num = gerador.nextInt(baralho.size());
        Carta c= baralho.get(num);
        baralho.remove(num);
        return c;
    }
    
}
