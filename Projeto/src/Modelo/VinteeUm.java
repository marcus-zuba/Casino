package Modelo;

//REGRAS DO JOGO

import java.security.SecureRandom;

// -Recebe carta aleatória do baralho
// -Nova carta é aberta
// -Pode pedir para não continuar se não quiser apostar mais
// -Puxará mais uma carta caso não quiserem continuar
// -Se a soma das da mesa com a da sua mão der mais próximo de 21, você ganha.
// -Se estourar, ir além de 21, a mesa ganha
//  ** A VALE 11
//  ** J, Q, K VALEM 10

public class VinteeUm extends JogoCasino{
    
    private boolean isVisible;
    private boolean regrasIsVisible;
    private Cadastro modeloCadastro;
    private int aposta;
    private int valorMesa;
    private int valorMao;
    private int valorTotal;
    private int cartasDistribuidas;
    
    public VinteeUm(){
        super();
        resetarJogo();
        jogadorAtual=0;
        isVisible = false;
    }

    public void setModeloCadastro(Cadastro modeloCadastro) {
        this.modeloCadastro = modeloCadastro;
    }

    public boolean RegrasIsVisible() {
        return regrasIsVisible;
    }

    public void setRegrasIsVisible(boolean regrasIsVisible) {
        this.regrasIsVisible = regrasIsVisible;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        isVisible = b;
        this.setChanged();
        this.notifyObservers();
    }

    public void proximoJogador(){
        resetarJogo();
        this.jogadorAtual++;
        if(jogadorAtual == jogadores.size())
            jogadorAtual=0;
        this.setChanged();
        this.notifyObservers();
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }
    
    public String getValorMesa(){
        return Integer.toString(valorMesa);
    }

    public String getValorMao(){
        return Integer.toString(valorMao);
    }
    
    public String getValorTotal(){
        return Integer.toString(valorTotal);
    }
    
    public void resetarJogo(){
        valorMesa = 0;
        valorMao = 0;
        valorTotal=0;
        cartasDistribuidas=0;
        aposta =0;
    }
    
    public void adicionarCarta() throws FichasInsuficientesException{
        SecureRandom gerador = new SecureRandom();
        if(cartasDistribuidas==0){
            Jogador j = this.jogadores.get(jogadorAtual);
            if(aposta > j.getFichas())
                throw new FichasInsuficientesException();
            this.jogadores.remove(j);
            j.reduzirFichas(aposta);
            this.jogadores.add(jogadorAtual, j);   
            modeloCadastro.setJogadores(jogadores);
            valorMao = gerador.nextInt(12);
        }
        else{
            valorMesa += gerador.nextInt(12);
        }
        valorTotal = valorMao + valorMesa;
        cartasDistribuidas++;
        System.out.println(this.countObservers());
        this.setChanged();
        this.notifyObservers();
    }
    
    public void parar(){
        int premio;
        switch (valorTotal) {
            case 21:
                premio = 8;
                break;
            case 20:
            case 22:
                premio = 2;
                break;
            default:
                premio = 0;
                break;
        }
        Jogador j = jogadores.get(jogadorAtual);
        jogadores.remove(j);
        j.addFichas(aposta*premio);
        jogadores.add(jogadorAtual, j);
        modeloCadastro.setJogadores(jogadores);
        resetarJogo();
        this.setChanged();
        this.notifyObservers();        
    }    
  
}


