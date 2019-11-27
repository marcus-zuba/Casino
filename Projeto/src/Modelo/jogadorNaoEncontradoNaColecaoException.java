package Modelo;

/*
@author Tony
*/

public class jogadorNaoEncontradoNaColecaoException extends Exception{

    public jogadorNaoEncontradoNaColecaoException() {
        super("Jogador não foi encontrado na coleção buscada!!");
    }

}
