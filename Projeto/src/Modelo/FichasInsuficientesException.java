package Modelo;

/*
@author Tony
*/

public class FichasInsuficientesException extends Exception{

        public FichasInsuficientesException(){
            super("Jogador com fichas insuficientes para jogar este jogo");
        }
}
