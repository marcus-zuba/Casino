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
    
    public boolean cadastrarJogador(String nome, int idade, String RG){
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
    
    public void cadastrarNoArquivo(){        //Método que coloca os jogadores e seus dados no arquivo Cadastro.txt
        try{
            writer = new FileWriter("Cadastro.txt");
        }catch(IOException e){
            System.err.println("Impossible creating/opening the file!");
            e.printStackTrace();
        }
        try{
            writer.write("NOME -- RG -- IDADE -- FICHAS");
            writer.write("\n");
        }catch(IOException e){
            System.err.println("Impossible writing in the file!");    
        }        
        for(int i=0;i<jogadores.size();i++){
            Jogador j = jogadores.get(i);
            String linha = "";
            linha += j.getNome() + " ";
            linha += j.getRG() + " ";
            linha += j.getIdade() + " ";
            linha += j.getFichas() + "\n";
            try{
                writer.write(linha);
            }catch(IOException e){
                System.err.println("Impossible writing in the file!");
            }
        }
        try{
            writer.close();
        }catch(IOException e){
            System.err.println("Impossible closing the file!");
        }                
    }
    
    public void lerDoArquivo(){  //Método que lê os jogadores e seus dadosdo Cadastro.txt  
        String inputLine;        //e adiciona eles no ArrayList de jogadores
        try{
            readerer = new BufferedReader(new FileReader("Cadastro.txt"));
        }catch(IOException e){
            System.err.println("Impossible opening the file to read!");
        }
        try {
            inputLine = readerer.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("There was an error during reading: "
                                + exc.getMessage());
        }
        try {
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
        } catch (IOException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            readerer.close();
        }catch(IOException e){
            System.err.println("Impossible closing the file!");
        }  
        modeloRoleta.setJogadores(this.jogadores);
        modeloJackpot.setJogadores(this.jogadores);  //Coloca o ArrayList atualizado 
        modelo21.setJogadores(this.jogadores);       //em todos os jogos
    }
}
