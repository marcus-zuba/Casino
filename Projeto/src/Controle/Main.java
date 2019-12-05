package Controle;
import javax.swing.JFrame;
import Modelo.*;
import Visao.*;
public class Main {
    
    public static void main(String[] args) {
                
        Menu modeloMenu = new Menu();
        MenuHandler mh = new MenuHandler(modeloMenu);     
        JMenu janelaMenu = new JMenu(mh, modeloMenu);
        janelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Instrucoes modeloInstrucoes = new Instrucoes();
        InstrucoesHandler ih = new InstrucoesHandler(modeloInstrucoes, modeloMenu);
        JInstrucoes instrucoes = new JInstrucoes(ih,modeloInstrucoes);
        mh.setModeloInstrucoes(modeloInstrucoes);

                
        Roleta jogoRoleta = new Roleta();
        RoletaHandler rh = new RoletaHandler(jogoRoleta, modeloMenu);
        JRoleta roleta = new JRoleta(rh, janelaMenu, jogoRoleta);
        mh.setModeloRoleta(jogoRoleta);
        
        VinteeUm modelo21 = new VinteeUm();
        VinteeUmHandler vh = new VinteeUmHandler(modeloMenu, modelo21);
        JVinteeUm vinteeum = new JVinteeUm(vh, modelo21);
        mh.setModelo21(modelo21);
        
        Jackpot jogoJackpot = new Jackpot();
        JackpotHandler jh = new JackpotHandler(jogoJackpot, modeloMenu);
        JJackpot jackpot = new JJackpot(jogoJackpot, jh);
        mh.setModeloJackpot(jogoJackpot);

        Cadastro modeloCadastro = new Cadastro(jogoRoleta);
        CadastroHandler ch = new CadastroHandler(modeloCadastro, modeloMenu);
        JCadastro cadastro = new JCadastro(ch,modeloCadastro);
        mh.setModeloCadastro(modeloCadastro);

        Loja modeloLoja = new Loja(modeloCadastro);
        LojaHandler lh = new LojaHandler(modeloLoja, modeloMenu);
        JLoja loja = new JLoja(lh, modeloMenu,modeloLoja);
        mh.setModeloLoja(modeloLoja);

        
        modeloMenu.setCadastro(modeloCadastro);
        
        janelaMenu.setVisible(true);
    }
    
}
