package Controle;

import Modelo.Jogador;
import Modelo.JogoCasino;
import Modelo.jogadorNaoEncontradoNaColecaoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator; //pesquisar essa classe depois que pode ser útil
import java.util.Scanner;
import java.util.Set;

/*
@author Tony
*/

public class Casino {
    //Integer usado aqui é para HashMap que não aceita tipo primitivo, mas ele funciona como um
    //Vamos evitar usar tipos primitivos em toda aplicação que tia Lulu vai gostar rs
    private HashMap<Jogador,Integer> casino;
    private ArrayList<JogoCasino> jogos;
    
    public void addFichas(Jogador jogador,Integer fichasExtras){
        Integer fichas = this.casino.get(jogador) + fichasExtras;
        //Conferir metodo merge do HashMap para talvez implementar aqui
        this.casino.remove(jogador);
        this.casino.put(jogador, fichas);
    }
    public String exibeFichasJogador(Jogador jogador){
        return casino.get(jogador).toString();
    }
    
    public Integer lucroDoDia(){
        Iterator<JogoCasino> it = this.jogos.iterator();
        Integer Soma = 0;
        while(it.hasNext())
            Soma += it.next().lucroDoDia();
        return Soma;
    }
    
    private boolean isRegistred(String Nome){
        //if(encontrou o jogador no arquivo)
            //return true;
        return false;
    }
    
    private Jogador buscaJogador(String Nome){
        //Implementação pendente quando descobrir como q mexe em arquivo
        Jogador jogador = new Jogador("naosei",0,"0");
        return jogador;
    }
    
    private Jogador criaJogador(String Nome){
        Scanner input = new Scanner(System.in);
        String RG;
        System.out.print("Digite o RG do jogador: ");
        RG = input.next();
        Integer Idade;
        System.out.print("Digite a idade do jogador: ");
        Idade = input.nextInt();
        Jogador response = new Jogador(Nome, Idade, RG);
        this.regJogador(response);
        return response;
    }
        
    private void regJogador(Jogador jogador){
        //Implementação pendente para registrar jogador no bloco de notas, nesse registro a quantidade de vezes que ele veio deverá ser 0 pela forma como o adicionaJogadorCasino está
    }
    
    private boolean firstTime(Jogador jogador){ //KAPPA
        //Metodo q informa se o Jogador é novo no casino ou já esteve antes
        return false;
    }
    
    public boolean adicionaJogadorCasino(Integer fichas){
        Jogador jogador;
        Scanner input = new Scanner(System.in);
        String Nome;
        System.out.print("Digite o nome do jogador: ");
        Nome = input.next();
        if(this.isRegistred(Nome))
            jogador = this.buscaJogador(Nome);
        else
            jogador = this.criaJogador(Nome);
        if(jogador.getIdade() >= IDADEMINIMA && fichas >= FICHASMINIMAS){
            if(this.firstTime(jogador))
                this.regJogador(jogador);
            casino.put(jogador, fichas);
            this.addVez(jogador);
            return true;
        }
        return false;
    }
    
    private void addVez(Jogador jogador){
        //Implementação pendente que adiciona 1 à quantidade de vezes que a pessoa já foi no casino la no bloco de notas
        //Esse daqui pode fazer algum evento ou beneficio de visitantes frequentes ou simplesmente informar
        //quantas vezes/dias o jogador já esteve no casino, se n implementar nd assim só faz um boolean de reincidente ou sla
        //a principal importancia desse metodo é registrar em algum lugar que vai ficar salvo que este jogador especifico
        //já veio no casino alguma vez
    }
    
    public boolean colocaEmJogo(Jogador jogador, JogoCasino jogo){
        if(jogo.adicionaJogador(jogador, casino.get(jogador))){
            this.casino.remove(jogador);
            return true;
        }
        return false;
    }
    
    public void colocaNoCasino(HashMap<Jogador,Integer> jogador){
        Set<Jogador> set = jogador.keySet();
        Iterator<Jogador> it = set.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            this.casino.put(aux, jogador.get(aux));
        }
    }
    
    public void sairDoCasino(Jogador jogador) throws jogadorNaoEncontradoNaColecaoException{
        if(!this.casino.containsKey(jogador))
            throw new jogadorNaoEncontradoNaColecaoException();
        this.casino.remove(jogador);
    }
    
    public final static Integer IDADEMINIMA = 21;
    public final static Integer FICHASMINIMAS = 500;
}
