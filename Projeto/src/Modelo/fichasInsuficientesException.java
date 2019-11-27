package Modelo;

/*
@author Tony
*/

public class fichasInsuficientesException extends Exception{

        public fichasInsuficientesException(){
            super("Jogador com fichas insuficientes para jogar este jogo");
        }
}
