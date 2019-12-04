/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.CadastroHandler;
import Modelo.Cadastro;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author eduardocorno
 */
public class JCadastro extends javax.swing.JFrame implements Observer{

    CadastroHandler h;
    Cadastro modeloCadastro;
    
    /**
     * Creates new form JCadastro
     */
    public JCadastro(CadastroHandler h, Cadastro modeloCadastro) {
        this.modeloCadastro=modeloCadastro;
        this.h=h;
        initComponents();
        jButtonMenu.setName("Menu");
        modeloCadastro.addObserver(this);
        this.update(modeloCadastro, this);
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
        jSeparatorBaixo = new javax.swing.JSeparator();
        jSeparatorCima = new javax.swing.JSeparator();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTítulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("Cadastro");

        jButtonMenu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonMenu.setText("Menu");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMenuMousePressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("RG:");

        jTextFieldRG.setName("RG"); // NOI18N
        jTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRGActionPerformed(evt);
            }
        });
        jTextFieldRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRGKeyReleased(evt);
            }
        });

        jTextFieldNome.setName("nome"); // NOI18N
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });

        jTextFieldIdade.setName("idade"); // NOI18N
        jTextFieldIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldIdadeKeyReleased(evt);
            }
        });

        jLabel3.setText("Idade:");

        jButtonCadastrar.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setEnabled(false);
        jButtonCadastrar.setName("cadastrar"); // NOI18N
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorCima)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMenu))
                    .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldRG)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTítulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCima, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu)
                    .addComponent(jButtonCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMousePressed
        // TODO add your handling code here:
        h.mousePressed(evt);
    }//GEN-LAST:event_jButtonMenuMousePressed

    private void jTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRGActionPerformed

    private void jButtonCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarMousePressed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        h.keyReleased(evt);
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jTextFieldRGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRGKeyReleased
        h.keyReleased(evt);
    }//GEN-LAST:event_jTextFieldRGKeyReleased

    private void jTextFieldIdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdadeKeyReleased
        h.keyReleased(evt);
        if(Integer.parseInt(jTextFieldIdade.getText())>17)
            jButtonCadastrar.setEnabled(true);
        else
            jButtonCadastrar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldIdadeKeyReleased

    private void jButtonCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMouseClicked
        h.mouseClicked(evt);
    }//GEN-LAST:event_jButtonCadastrarMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JSeparator jSeparatorBaixo;
    private javax.swing.JSeparator jSeparatorCima;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRG;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        this.setVisible(modeloCadastro.isVisible());
    }

}
