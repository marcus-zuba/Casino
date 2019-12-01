package Controle;
import javax.swing.JFrame;
import Modelo.*;
import Visao.*;
public class Main {
    
    public static void main(String[] args) {
        
        
        Menu modeloMenu = new Menu();
        MenuHandler mh = new MenuHandler(modeloMenu);     
        JMenu janelaMenu = new JMenu(mh);
        janelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaMenu.setVisible(true);   
        mh.setMenu(janelaMenu);

        InstrucoesHandler ih = new InstrucoesHandler();
        JInstrucoes instrucoes = new JInstrucoes(ih,janelaMenu);
        mh.setInstrucoes(instrucoes);
        
        LojaHandler lh = new LojaHandler();
        JLoja loja = new JLoja(lh, janelaMenu);
        mh.setLoja(loja);
        
        CadastroHandler ch = new CadastroHandler();
        JCadastro cadastro = new JCadastro(ch,janelaMenu);
        mh.setCadastro(cadastro);
        
        Roleta jogoRoleta = new Roleta();
        RoletaHandler rh = new RoletaHandler(jogoRoleta);
        JRoleta roleta = new JRoleta(rh, janelaMenu, jogoRoleta);
        mh.setRoleta(roleta);
        
        VinteeUmHandler vh = new VinteeUmHandler();
        JVinteeUm vinteeum = new JVinteeUm(vh, janelaMenu);
        mh.setVinteeum(vinteeum);
        
        JackpotHandler jh = new JackpotHandler();
        JCacaNiquel jackpot = new JCacaNiquel(jh,janelaMenu);
        mh.setJackpot(jackpot);
        
        janelaMenu.setVisible(true);
        
        
    }
    
}
