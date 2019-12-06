package Modelo;

/*
@author Tony
*/

public class JogadorNaoEncontradoException extends Exception{

    public JogadorNaoEncontradoException() {
        super("Jogador não foi encontrado no cadastro!!");
    }

}
