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

public class BlackJack1 {
    
    private Baralho copag;
    private JogadorBlackJack j1;
    private JogadorBlackJack j2;
    private JogadorBlackJack mesa;
    private boolean contj1;
    private boolean contj2;
    private boolean cont;
    
    public BlackJack1(){
        this.contj1 = true;
        this.contj2 = true;
        this.cont = true;
    }
    
    public void inicializarJogo(){
        // embaralha as cartas
        copag.embaralharCartas();
        
        //atribui carta aleatória para jogadores e para mesa
        j1.recebeCarta(copag.distribuirCarta());
        j2.recebeCarta(copag.distribuirCarta());
        
        mesa.recebeCarta(copag.distribuirCarta());
    }
    
    public boolean decidir( JogadorBlackJack j){
        //pegar esse j daqui para colocar no "Turno do JogadorBlackJack:" j
        //mudar aqui o status do boolean cont de cada um dos j, pelo botão
        if(j == j1)
            return contj1;
        else
            return contj2;
    }
    
    public void game(){
        // setup inicial do jogo
        inicializarJogo();
        
        //definindo os valores das pontuações de cada
        int v1 = mesa.getValorTotal()+j1.getValorTotal();
        int v2 = mesa.getValorTotal()+j2.getValorTotal();
        
        //enquanto os dois quiserem continuar, acrescentar-se-ão novas cartas
        while(cont){
            
            //decisão de continuar de cad um
            decidir(j1);
            decidir(j2);
            
            //se ambos decidirem por parar breka, contrário mesa come mais uma
            if(!contj1 && !contj2){
                cont=false;
                break;
            }else
                mesa.recebeCarta(copag.distribuirCarta());
            
            //verificar se estourou
            v1 = mesa.getValorTotal()+j1.getValorTotal();
            if(v1>21){
                //colocaar a cena de quando perdeu j1
                System.out.println("ESTOUROU J1");
            }
            
            v2 = mesa.getValorTotal()+j2.getValorTotal();
            if(v2>21){
                //colocaar a cena de quando perdeu j2
                System.out.println("ESTOUROU J2");
            }
        }
        
        if((v1-v2)>(v2-v1)){
            //aqui será a tela de vitória j1
            System.out.println("Ganhou J1");
        }
        
        if((v2-v1)>(v1-v2)){
            //aqui será a tela de vitória j2
            System.out.println("Ganhou J2");
        }
        
    }    
  
}

