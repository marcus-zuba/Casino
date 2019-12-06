/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Controle.VinteeUmHandler;
import Modelo.FichasInsuficientesException;
import Modelo.VinteeUm;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class JVinteeUm extends javax.swing.JFrame implements Observer{
    
    VinteeUmHandler h;
    VinteeUm modelo;
    JInstrucoesVinteeUm instrucoes;

    /**
     * Creates new form JVinteeUm
     */
    public JVinteeUm(VinteeUmHandler h, VinteeUm modelo) {
        this.h = h;
        this.modelo=modelo;
        instrucoes = new JInstrucoesVinteeUm(h,this.modelo);
        initComponents();
        setNames();
        this.modelo.addObserver(this);
        this.update(this.modelo, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButtonMenu = new javax.swing.JButton();
        jLabelTítulo = new javax.swing.JLabel();
        jButtonRegras = new javax.swing.JButton();
        jSeparatorBaixo = new javax.swing.JSeparator();
        jSeparatorCima = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonProxCarta = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        jLabelValorJogador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabelValorMesa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonProxJogador = new javax.swing.JButton();
        jLabelJogadorAtual = new javax.swing.JLabel();
        jLabelFichasJogadorAtual = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMenu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonMenu.setText("Menu");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JVinteeUm.this.mousePressed(evt);
            }
        });

        jLabelTítulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("Vinte e Um");

        jButtonRegras.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonRegras.setText("Regras");
        jButtonRegras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JVinteeUm.this.mousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("Valor da carta");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("do Jogador ");

        jButtonProxCarta.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonProxCarta.setText("Próxima Carta");
        jButtonProxCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JVinteeUm.this.mousePressed(evt);
            }
        });

        jButtonParar.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonParar.setText("Parar");
        jButtonParar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JVinteeUm.this.mousePressed(evt);
            }
        });

        jLabelValorJogador.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelValorJogador.setForeground(new java.awt.Color(255, 0, 0));
        jLabelValorJogador.setText("0");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setText("Total");

        jLabelValorTotal.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelValorTotal.setText("0");

        jLabelValorMesa.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabelValorMesa.setText("0");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel10.setText("Valor da Aposta");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButtonProxJogador.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonProxJogador.setText("Proximo Jogador");
        jButtonProxJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JVinteeUm.this.mousePressed(evt);
            }
        });

        jLabelJogadorAtual.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelJogadorAtual.setText("Jogador 0");

        jLabelFichasJogadorAtual.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabelFichasJogadorAtual.setText("Fichas: 150000");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel2.setText("Próxima Carta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonRegras)
                                .addGap(165, 165, 165)
                                .addComponent(jButtonProxJogador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                                .addComponent(jButtonMenu))
                            .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparatorCima, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelJogadorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelFichasJogadorAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(96, 96, 96)
                                .addComponent(jLabelTítulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabelValorJogador)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonProxCarta)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelValorMesa)
                                            .addComponent(jButtonParar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelValorTotal)
                                        .addGap(35, 35, 35)))
                                .addGap(64, 64, 64))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTítulo)
                        .addComponent(jLabelFichasJogadorAtual))
                    .addComponent(jLabelJogadorAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCima, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelValorMesa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorTotal)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonParar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProxCarta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu)
                    .addComponent(jButtonRegras)
                    .addComponent(jButtonProxJogador))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try{
            h.keyReleased(evt);  //Colocando esse try-catch para evitar excecao no metoto ParseInt de palavra
        }catch(Exception e){}    //Pois estamos assumindo que só sera digitado numero, conforme as instruções
    }//GEN-LAST:event_jTextField1KeyReleased

    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        // TODO add your handling code here:
        try{
            h.mousePressedd(evt);
        }catch(FichasInsuficientesException e){
            JOptionPane.showMessageDialog(this, e.getMessage(), 
                            "Fichas Insuficientes", JOptionPane.ERROR_MESSAGE);        
        }    
    }//GEN-LAST:event_mousePressed

    public void setNames(){
        jButtonMenu.setName("Menu");
        jButtonRegras.setName("Regras");
        jButtonProxJogador.setName("ProxJogador");
        jButtonProxCarta.setName("ProxCarta");
        jButtonParar.setName("Parar");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonParar;
    private javax.swing.JButton jButtonProxCarta;
    private javax.swing.JButton jButtonProxJogador;
    private javax.swing.JButton jButtonRegras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFichasJogadorAtual;
    private javax.swing.JLabel jLabelJogadorAtual;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JLabel jLabelValorJogador;
    private javax.swing.JLabel jLabelValorMesa;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparatorBaixo;
    private javax.swing.JSeparator jSeparatorCima;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        System.out.println("entrou adnadaksd 1");        
        this.setVisible(modelo.isVisible());
        this.setEnabled(modelo.isVisible());
        if(this.isEnabled()){
            System.out.println("entrou adnadaksd 2");
            jLabelJogadorAtual.setText(modelo.getNomeJogadorAtual());
            jLabelFichasJogadorAtual.setText("Fichas: " + modelo.getFichasJogadorAtual());
            jLabelValorJogador.setText(modelo.getValorMao());
            jLabelValorMesa.setText(modelo.getValorMesa());
            jLabelValorTotal.setText(modelo.getValorTotal());
        }    
    }
}
