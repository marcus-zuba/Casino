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
    private String aposta;
    private Integer fichasAtuais;
    
    public ApostaRoleta(Integer fichasAtuais){
        
        fichasApostadas = 0;
        aposta = "";
        this.fichasAtuais = fichasAtuais;
        
    }
    
    public Integer getFichasApostadas() {
        return fichasApostadas;
    }

    public void setFichasApostadas(Integer fichasApostadas) {
        this.fichasApostadas = fichasApostadas;
    }

    public String getAposta() {
        return aposta;
    }

    public void setAposta(String aposta) {
        this.aposta = aposta;
    }
    
    public Integer getFichasAtuais() {
        return fichasAtuais;
    }

    public void setFichasAtuais(Integer fichasAtuais) {
        this.fichasAtuais = fichasAtuais;
    }
    
    public void fazerAposta(Integer fichasApostadas, String aposta){
        
        this.fichasApostadas = fichasApostadas;
        this.aposta = aposta;
        this.fichasAtuais -= fichasApostadas; 
        
    }
    
}
