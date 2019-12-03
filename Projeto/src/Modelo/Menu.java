package Modelo;

import Modelo.Jogador;
import Modelo.JogoCasino;
import Modelo.JogadorNaoEncontradoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator; //pesquisar essa classe depois que pode ser útil
import java.util.Scanner;
import java.util.Set;


public class Menu {

    //Integer usado aqui é para HashMap que não aceita tipo primitivo, mas ele funciona como um
    //Vamos evitar usar tipos primitivos em toda aplicação que tia Lulu vai gostar rs
    
    private HashMap<Jogador,Integer> casino;
    private ArrayList<JogoCasino> jogos;
    
    public Menu(){
        
        casino = new HashMap<Jogador,Integer>();
        jogos = new ArrayList<JogoCasino>();
        
    }
    
    public HashMap<Jogador,Integer> getCasino() {
        return casino;
    }

    public void setCasino(HashMap<Jogador,Integer> casino) {
        this.casino = casino;
    }
    
    public void addFichas(String nome,Integer fichasExtras){
        Set k = casino.keySet();
        Iterator<Jogador> it = k.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            if(aux.getNome().equals(nome))
            {
                Integer i = casino.get(aux);
                i+=fichasExtras;
                casino.remove(aux);
                casino.put(aux, i);
                printarJogadores();
            }
        }
        
    }
    public String exibeFichasJogador(Jogador jogador){
        return getCasino().get(jogador).toString();
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
            getCasino().put(jogador, fichas);
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
        //JogoCassino agora é uma interface, esse bloco estava dando erro
        return false;
    }
    
    public void colocaNoCasino(HashMap<Jogador,Integer> jogador){
        Set<Jogador> set = jogador.keySet();
        Iterator<Jogador> it = set.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            this.getCasino().put(aux, jogador.get(aux));
        }
        System.out.println("Colocado");
        printarJogadores();
    }
    
    public void printarJogadores(){

        Set<Jogador> set = getCasino().keySet();
        Iterator<Jogador> it = set.iterator();
        Jogador aux;
        while(it.hasNext()){
            aux = it.next();
            System.out.println(aux.getDados() + " " + getCasino().get(aux));
        }
        
    }
    
    public void sairDoCasino(Jogador jogador) throws JogadorNaoEncontradoException{
        if(!this.casino.containsKey(jogador))
            throw new JogadorNaoEncontradoException();
        this.getCasino().remove(jogador);
    }
    
    public final static Integer IDADEMINIMA = 21;
    public final static Integer FICHASMINIMAS = 500;
}
