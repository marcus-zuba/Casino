/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author marcus
 */
public class SemJogadoresCadastradosException extends Exception{

    public SemJogadoresCadastradosException() {
        super("Nao eh possivel acessar os jogos sem jogadores cadastrados!");
    }
    
    
}
