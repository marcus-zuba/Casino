package Modelo;

//REGRAS DO JOGO
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
    private Cadastro modeloCadastro;
    
    private Baralho copag;
    private JogadorBlackJack j1;
    private JogadorBlackJack mesa;
    private boolean contj1;
    private boolean cont;
    
    public VinteeUm(){
        super();
        isVisible = false;
        this.contj1 = true;
        this.cont = true; 
    }

    public void setModeloCadastro(Cadastro modeloCadastro) {
        this.modeloCadastro = modeloCadastro;
    }
    
    public boolean isVisible(){
        return isVisible;
    }
    
    public void setVisible(boolean b){
        isVisible = b;
        
        this.setChanged();
        this.notifyObservers();
    }
    
    public void inicializarJogo(){
        // embaralha as cartas
        copag.embaralharCartas();
        
        //atribui carta aleatória para o jogador e para mesa
        j1.recebeCarta(copag.distribuirCarta());     
        mesa.recebeCarta(copag.distribuirCarta());
    }
    
    public void adicionarCartaAMesa(){
      
            mesa.recebeCarta(copag.distribuirCarta());
            
    }
    
    public void resetarJogo(){
        mesa.
        
    }

    public void game(){
        // setup inicial do jogo
        inicializarJogo();
        
        //definindo os valores da pontuação
        int v1 = mesa.getValorTotal()+j1.getValorTotal();        
        
        //verificar se estourou
        v1 = mesa.getValorTotal()+j1.getValorTotal();
        
        
    }    
  
}


