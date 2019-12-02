/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author arthur
 */
public class ApostaRoleta {

    private Integer fichasApostadas;
    private String cor;
    private String corNumero;
    private int numero;
    private Integer fichasAtuais;
    
    public ApostaRoleta(Integer fichasAtuais){
        
        fichasApostadas = 0;
        this.cor=null;
        this.corNumero=null;
        this.numero=0;
        this.fichasAtuais = fichasAtuais;
        
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCorNumero() {
        return corNumero;
    }

    public void setCorNumero(String corNumero) {
        this.corNumero = corNumero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public Integer getFichasApostadas() {
        return fichasApostadas;
    }

    public void setFichasApostadas(Integer fichasApostadas) {
        this.fichasApostadas = fichasApostadas;
    }
    
    public Integer getFichasAtuais() {
        return fichasAtuais;
    }

    public void setFichasAtuais(Integer fichasAtuais) {
        this.fichasAtuais = fichasAtuais;
    }
    
    public void fazerApostaNumero(Integer fichasApostadas, int numero){
        
        this.fichasApostadas = fichasApostadas;
        this.fichasAtuais -= fichasApostadas; 
        this.setNumero(numero);
        
    }
    
    public void fazerApostaCor(Integer fichasApostadas, String cor){
        
        this.fichasApostadas = fichasApostadas;
        this.fichasAtuais -= fichasApostadas; 
        this.setCor(cor);
        
    }
    
    public void fazerApostaCorNumero(Integer fichasApostadas, String corNumero){
        
        this.fichasApostadas = fichasApostadas;
        this.fichasAtuais -= fichasApostadas; 
        this.setCorNumero(corNumero);
        
    }
    
}
