/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.*;

/**
 *
 * @author marcus
 */
public class Main {
    
    public static void main(String[] args) {
        
        MenuHandler mh = new MenuHandler();
        JMenu menu = new JMenu(mh);
        mh.setMenu(menu);

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
        JJackpot jackpot = new JJackpot(jh,menu);
        mh.setJackpot(jackpot);
        
        menu.setVisible(true);
        
    }
    
}
