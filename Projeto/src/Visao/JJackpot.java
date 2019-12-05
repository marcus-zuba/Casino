/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Controle.JackpotHandler;
import Modelo.Jackpot;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Tony
 */
public class JJackpot extends javax.swing.JFrame implements Observer {

    JackpotHandler handler;
    Jackpot modelo;
    JInstrucoesJackpot instrucoes;
    
    /**
     * Creates new form JJackpot
     */
    public JJackpot(Jackpot modelo, JackpotHandler handler) {
        this.handler = handler;
        this.modelo = modelo;
        instrucoes = new JInstrucoesJackpot(modelo, handler);
        initComponents();
        setNames();
        initialize();
        this.modelo.addObserver(this);
        update(modelo, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMenu = new javax.swing.JButton();
        jButtonRegras = new javax.swing.JButton();
        jLabelTítulo = new javax.swing.JLabel();
        jSeparatorBaixo = new javax.swing.JSeparator();
        jSeparatorCima = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabelValorDeAposta = new javax.swing.JLabel();
        jTextFieldValorDeAposta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonProximoJogador = new javax.swing.JButton();
        jLabelJogadorAtual = new javax.swing.JLabel();
        jLabelFichasJogadorAtual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMenu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonMenu.setText("Menu");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMenuMousePressed(evt);
            }
        });

        jButtonRegras.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonRegras.setText("Regras");
        jButtonRegras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegrasMousePressed(evt);
            }
        });

        jLabelTítulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("Caça-Níquel");

        jLabelValorDeAposta.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabelValorDeAposta.setText("Valor de aposta");

        jTextFieldValorDeAposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldValorDeApostaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Teste sua sorte");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Jogar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JJackpot.this.mousePressed(evt);
            }
        });

        jButtonProximoJogador.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonProximoJogador.setText("Próximo Jogador");
        jButtonProximoJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JJackpot.this.mousePressed(evt);
            }
        });

        jLabelJogadorAtual.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelJogadorAtual.setText("Jogador 0");

        jLabelFichasJogadorAtual.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelFichasJogadorAtual.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelJogadorAtual))
                    .addComponent(jLabelFichasJogadorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTítulo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonRegras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonProximoJogador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMenu))
                            .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparatorCima, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(193, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorDeAposta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldValorDeAposta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTítulo)
                        .addComponent(jLabelFichasJogadorAtual))
                    .addComponent(jLabelJogadorAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCima, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelValorDeAposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorDeAposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu)
                    .addComponent(jButtonRegras)
                    .addComponent(jButtonProximoJogador))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMousePressed
        // TODO add your handling code here:
        handler.mousePressed(evt);
    }//GEN-LAST:event_jButtonMenuMousePressed

    private void jButtonRegrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegrasMousePressed
        // TODO add your handling code here:
        handler.mousePressed(evt);
    }//GEN-LAST:event_jButtonRegrasMousePressed

    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        // TODO add your handling code here:
        handler.mousePressed(evt);
    }//GEN-LAST:event_mousePressed

    private void jTextFieldValorDeApostaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorDeApostaKeyReleased
        // TODO add your handling code here:
        handler.keyReleased(evt);
    }//GEN-LAST:event_jTextFieldValorDeApostaKeyReleased

    /**
     * @param args the command line arguments
     */
    
    private void initialize(){
        jTextField2.setOpaque(true);
        jTextField1.setOpaque(true);
        jTextField3.setOpaque(true);
        jTextField2.setEditable(false);
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
    }
       
    private void setNames(){
        jButton1.setName("Jogar");
        jButtonMenu.setName("Menu");
        jButtonRegras.setName("Regras");
        jButtonProximoJogador.setName("Proximo");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonProximoJogador;
    private javax.swing.JButton jButtonRegras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFichasJogadorAtual;
    private javax.swing.JLabel jLabelJogadorAtual;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JLabel jLabelValorDeAposta;
    private javax.swing.JSeparator jSeparatorBaixo;
    private javax.swing.JSeparator jSeparatorCima;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldValorDeAposta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        this.setVisible(modelo.isVisible());
        this.setEnabled(modelo.isVisible());
        if(modelo.isVisible()){
        //1-Vermelho 2-Azul 3-Verde 4-Amarelo 5-Preto
            switch(modelo.getCampo1()){
                case(10):
                    jTextField1.setBackground(Color.WHITE);
                    break;                
                case(1):
                    jTextField1.setBackground(Color.RED);
                    break;
                case(2):
                    jTextField1.setBackground(Color.BLUE);
                    break;
                case(3):
                    jTextField1.setBackground(Color.GREEN);
                    break;
                case(4):
                    jTextField1.setBackground(Color.YELLOW);
                    break;
                case(0):
                    jTextField1.setBackground(Color.BLACK);
                    break;
            }
            jTextField1.repaint();            
            switch(modelo.getCampo2()){
                case(10):
                    jTextField2.setBackground(Color.WHITE);
                    break;
                case(1):
                    jTextField2.setBackground(Color.RED);
                    break;
                case(2):
                    jTextField2.setBackground(Color.BLUE);
                    break;
                case(3):
                    jTextField2.setBackground(Color.GREEN);
                    break;
                case(4):
                    jTextField2.setBackground(Color.YELLOW);
                    break;
                case(0):
                    jTextField2.setBackground(Color.BLACK);
                    break;            
            }
            switch(modelo.getCampo3()){
                case(10):
                    jTextField3.setBackground(Color.WHITE);
                    break;
                case(1):
                    jTextField3.setBackground(Color.RED);
                    break;
                case(2):
                    jTextField3.setBackground(Color.BLUE);
                    break;
                case(3):
                    jTextField3.setBackground(Color.GREEN);
                    break;
                case(4):
                    jTextField3.setBackground(Color.YELLOW);
                    break;
                case(0):
                    jTextField3.setBackground(Color.BLACK);
                    break;
            }
        }
    }
        
    
}
