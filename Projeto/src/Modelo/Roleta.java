/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author Tony
 */
public class Roleta extends JogoCasino{

    private HashMap<ApostaRoleta,Jogador> apostas;
    
    public Roleta(String nome, Integer numeroMaximo) {
        super("Roleta", JogoCasino.LIMITE_BOM_SENSO_ARBITRARIO);
    }

    @Override
    public String instrucoesDoJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer lucroDoDia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
