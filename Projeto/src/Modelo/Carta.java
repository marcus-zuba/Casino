package Modelo;

public class Carta {
    
    private String naipe;
    private int valor;
    
    public Carta(String str, int num){
        this.naipe = str;
        this.valor = num;    
    }    
    
    public String getNaipe(){
        return this.naipe;
    }
    public void setNaipe(String str){
        this.naipe = str;
    }
    
    public int getValor(){
        return this.valor;
    }
    public void setValor(int val){
        this.valor = val;
    }
    
    public boolean souMaior(Carta c){
        if(c.getValor()<this.valor)
            return true;
        else
            return false;
    }
}
