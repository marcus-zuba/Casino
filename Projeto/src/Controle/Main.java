package Controle;
import javax.swing.JFrame;
import Modelo.*;
import Visao.*;
public class Main {
    
    public static void main(String[] args) {
        
        j 
        
        Menu modeloMenu = new Menu();
        MenuHandler handlerMenu = new MenuHandler(modeloMenu);     
        JMenu janelaMenu = new JMenu(handlerMenu, modeloMenu);
        janelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaMenu.setVisible(true);   
        handlerMenu.setMenu(janelaMenu);

        JInstrucoes instrucoes = new JInstrucoes(menu);
        mh.setInstrucoes(instrucoes);
        
        LojaHandler lh = new LojaHandler();
        JLoja loja = new JLoja(lh, menu);
        mh.setLoja(loja);
        
        CadastroHandler ch = new CadastroHandler();
        JCadastro cadastro = new JCadastro(ch,menu);
        mh.setCadastro(cadastro);
        
        RoletaHandler rh = new RoletaHandler();
        JRoleta roleta = new JRoleta(rh, menu);
        mh.setRoleta(roleta);
        
        VinteeUmHandler vh = new VinteeUmHandler();
        JVinteeUm vinteeum = new JVinteeUm(vh, menu);
        mh.setVinteeum(vinteeum);
        
        JackpotHandler jh = new JackpotHandler();
        JCacaNiquel jackpot = new JCacaNiquel(jh,menu);
        mh.setJackpot(jackpot);
        
        menu.setVisible(true);
        
        
    }
    
}
