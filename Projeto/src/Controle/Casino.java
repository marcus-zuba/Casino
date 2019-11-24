package Controle;

import Modelo.Jogador;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator; //pesquisar essa classe depois que pode ser útil
import java.util.Set;

/*
@author Tony
*/

public class Casino {
    //Integer usado aqui é para HashMap que não aceita tipo primitivo, mas ele funciona como um
    //Vamos evitar usar tipos primitivos em toda aplicação que tia Lulu vai gostar rs
    private HashMap<Jogador,Integer> casino;
    
    public String exibeFichasJogador(Jogador jogador){
        return casino.get(jogador).toString();
    }
    
    public Integer somaLucros(){
        Set<Jogador> key = casino.keySet();
        Iterator<Jogador> it = key.iterator();
        Integer Soma = 0;
        while(it.hasNext()){
            Soma += casino.get(it.next());
        }
        return Soma;
    }
    
    public boolean adicionaJogador(Jogador jogador, Integer fichas){
        if(jogador.getIdade() >= IDADEMINIMA && fichas >= FICHASMINIMAS){
            casino.put(jogador, fichas);
            return true;
        }
        return false;
    }
    
    public final static Integer IDADEMINIMA = 21;
    public final static Integer FICHASMINIMAS = 500;
}
