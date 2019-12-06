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
public class IdadeInsuficienteException extends Exception{
    
    public IdadeInsuficienteException() {
        super("Menores de idade não podem se cadastrar no cassino!");
    }
}
