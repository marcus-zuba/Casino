/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author marcus
 */
public class Cadastro extends  JogoCasino{  //Classe responsavel por armazenar o ArrayList de Jogadores
                                            //e atualizar os jogos quando há uma mudança nele
    private boolean isVisible;
    private Roleta modeloRoleta;
    private Jackpot modeloJackpot;
    private VinteeUm modelo21;
    private FileWriter writer;
    private BufferedReader readerer;
    
    public Cadastro(Roleta modeloRoleta, Jackpot modeloJackpot, VinteeUm modelo21){
        super();
        this.modeloRoleta = modeloRoleta;
        this.modeloJackpot = modeloJackpot;
        this.modelo21 = modelo21;
        this.isVisible=false;
    }

    @Override
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
        modeloRoleta.setJogadores(jogadores);    //Quando recebe um arraylist de jogadores
        modeloJackpot.setJogadores(jogadores);   //novo já coloca ele em todos os jogos
        modelo21.setJogadores(jogadores);        //pq ele é tipo o "atualizado"
    }
        
    public boolean isVisible(){
        return isVisible;
    }

    public void setVisible(boolean b){
        this.isVisible = b;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean cadastrarJogador(String nome, int idade, String RG) throws IdadeInsuficienteException{
        if(idade<18)
            throw new IdadeInsuficienteException();
        Jogador j = new Jogador(nome, idade, RG);
        this.jogadores.add(j);
        modeloRoleta.setJogadores(this.jogadores);
        modeloJackpot.setJogadores(this.jogadores);
        modelo21.setJogadores(this.jogadores);
        return true;
    }
    
    public void printarJogadores(){
        for(int i=0;i<jogadores.size();i++){
            System.out.println(jogadores.get(i).getNome() + "  " + jogadores.get(i).getFichas());
        }
    }
    
    public void cadastrarNoArquivo() throws IOException{        //Método que coloca os jogadores e seus dados no arquivo Cadastro.txt
        writer = new FileWriter("Cadastro.txt");
        writer.write("NOME -- RG -- IDADE -- FICHAS");
        writer.write("\n");
        for(int i=0;i<jogadores.size();i++){
            Jogador j = jogadores.get(i);
            String linha = "";
            linha += j.getNome() + " ";
            linha += j.getRG() + " ";
            linha += j.getIdade() + " ";
            linha += j.getFichas() + "\n";
            writer.write(linha);
        }
        writer.close();
    }
    
    public void lerDoArquivo() throws IOException{  //Método que lê os jogadores e seus dadosdo Cadastro.txt  
        String inputLine;        //e adiciona eles no ArrayList de jogadores
            readerer = new BufferedReader(new FileReader("Cadastro.txt"));
            inputLine = readerer.readLine();
            inputLine = readerer.readLine(); 
            while(inputLine!=null){
                String [] dados = inputLine.split(" ");
                String nome = dados[0];
                String RG = dados[1];
                Integer idade = Integer.parseInt(dados[2]);
                Integer fichas = Integer.parseInt(dados[3]);
                Jogador j = new Jogador(nome,RG,idade,fichas);
                this.jogadores.add(j);
                inputLine = readerer.readLine();
            }
        readerer.close();
        modeloRoleta.setJogadores(this.jogadores);
        modeloJackpot.setJogadores(this.jogadores);  //Coloca o ArrayList atualizado 
        modelo21.setJogadores(this.jogadores);       //em todos os jogos
    }
}
