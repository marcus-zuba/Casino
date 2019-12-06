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

    private String cor;
    private String corNumero;
    private int numero;
    private Integer fichasApostadas;
    private int tipoAposta; // 0 para cor, 1 para numero, 2 para corNumero
    
    public ApostaRoleta(){
        
        this.cor=null;
        this.corNumero=null;
        fichasApostadas=null;
        this.numero=0;
        int tipoAposta = 0;
        
    }
    
    public void resetarAposta(){
        this.fichasApostadas=null;
        this.cor=null;
        this.corNumero=null;
        this.numero=0;    
    }

    public void setTipoAposta(int tipoAposta) {
        this.tipoAposta = tipoAposta;
    }

    public int getTipoAposta() {
        return tipoAposta;
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
        
    public void fazerApostaNumero(int numero, Integer fichasApostadas){
        
        this.setNumero(numero);
        this.fichasApostadas=fichasApostadas;
        
    }
    
    public void fazerApostaCor(String cor, Integer fichasApostadas){
        
        this.setCor(cor);
        this.fichasApostadas=fichasApostadas;
        
    }
    
    public void fazerApostaCorNumero(String corNumero, Integer fichasApostadas){
        
        this.setCorNumero(corNumero);
        this.fichasApostadas=fichasApostadas;
        
    }
    
}
