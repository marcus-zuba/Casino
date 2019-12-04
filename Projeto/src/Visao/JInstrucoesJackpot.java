/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Controle.JackpotHandler;
import Modelo.Jackpot;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author eduardo
 */
public class JInstrucoesJackpot extends javax.swing.JFrame implements Observer{

    JackpotHandler h;
    Jackpot modelo;
    
    /**
     * Creates new form JInstrucoesJackpot
     */
    public JInstrucoesJackpot(Jackpot modelo, JackpotHandler h) {
        this.modelo=modelo;
        this.h = h;
        initComponents();
        jButtonMenu.setName("InstrucoesMenu");
        jButtonComecar.setName("Comecar");
        modelo.addObserver(this);
        this.update(modelo, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTítulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelInstrucoes = new javax.swing.JLabel();
        jSeparatorBaixo = new javax.swing.JSeparator();
        jSeparatorCima = new javax.swing.JSeparator();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonComecar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTítulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("Jackpot");

        jLabelNome.setFont(new java.awt.Font("Ubuntu", 2, 18)); // NOI18N
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome.setText("Insira o nome do jogador que deseja participar:");

        jLabelInstrucoes.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabelInstrucoes.setText("Instruções");

        jButtonComecar.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jButtonComecar.setText("Começar");
        jButtonComecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JInstrucoesJackpot.this.mousePressed(evt);
            }
        });

        jButtonConfirmar.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jButtonConfirmar.setText("Confirmar");

        jButtonMenu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonMenu.setText("Menu");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JInstrucoesJackpot.this.mousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonMenu))
                            .addComponent(jLabelTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparatorCima, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonComecar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInstrucoes)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonConfirmar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTítulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCima, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar))
                .addGap(18, 18, 18)
                .addComponent(jLabelInstrucoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButtonComecar)
                .addGap(10, 10, 10)
                .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        // TODO add your handling code here:
        h.mousePressed(evt);
    }//GEN-LAST:event_mousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComecar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabelInstrucoes;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JSeparator jSeparatorBaixo;
    private javax.swing.JSeparator jSeparatorCima;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        this.setVisible(modelo.regrasIsVisible());
        this.setEnabled(modelo.regrasIsVisible());
    }
}
