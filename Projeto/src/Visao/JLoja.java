/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;
import Controle.LojaHandler;
import Modelo.JogadorNaoEncontradoException;
import Modelo.Loja;
import Modelo.Menu;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class JLoja extends javax.swing.JFrame implements Observer{

    LojaHandler h;
    Menu modeloMenu;
    Loja modeloLoja;
    
    /**
     * Creates new form JLoja
     */
    public JLoja(LojaHandler h, Menu modeloMenu, Loja modeloLoja) {
        this.h = h;
        this.modeloMenu = modeloMenu;
        this.modeloLoja = modeloLoja;
        initComponents();
        jButtonMenu.setName("Menu");
        modeloLoja.addObserver(this);
        this.update(modeloLoja, this);
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
        jLabelTítulo = new javax.swing.JLabel();
        jSeparatorBaixo = new javax.swing.JSeparator();
        jSeparatorCima = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFichas = new javax.swing.JTextField();
        jButtonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMenu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonMenu.setText("Menu");
        jButtonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMenuMousePressed(evt);
            }
        });

        jLabelTítulo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabelTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTítulo.setText("Loja");

        jLabel1.setText("Nome do jogador:");

        jTextFieldNome.setName("nome"); // NOI18N
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });

        jLabel2.setText("Fichas:");

        jTextFieldFichas.setName("fichas"); // NOI18N
        jTextFieldFichas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFichasKeyReleased(evt);
            }
        });

        jButtonComprar.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButtonComprar.setText("Comprar");
        jButtonComprar.setName("comprar"); // NOI18N
        jButtonComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonComprarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTítulo, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jSeparatorCima, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldFichas, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparatorBaixo))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenu)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTítulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorCima, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparatorBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu)
                    .addComponent(jButtonComprar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMenuMousePressed
        // TODO add your handling code here:
        h.mousePressed(evt);
    }//GEN-LAST:event_jButtonMenuMousePressed

    private void jButtonComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonComprarMousePressed
        try {
            // TODO add your handling code here:
            h.mousePressedd(evt);
            JOptionPane.showMessageDialog(this, "Fichas adquiridas com suceso!", 
                            "Sucesso na compra", JOptionPane.INFORMATION_MESSAGE);                    
        } catch (JogadorNaoEncontradoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), 
                            "Jogador Nao Encontrado", JOptionPane.ERROR_MESSAGE);        
        }
    }//GEN-LAST:event_jButtonComprarMousePressed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        h.keyReleased(evt);
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jTextFieldFichasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFichasKeyReleased
        h.keyReleased(evt);
    }//GEN-LAST:event_jTextFieldFichasKeyReleased

    private void setNames(){
        jButtonMenu.setName("Menu");
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTítulo;
    private javax.swing.JSeparator jSeparatorBaixo;
    private javax.swing.JSeparator jSeparatorCima;
    private javax.swing.JTextField jTextFieldFichas;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable arg0, Object arg1) {
        this.setVisible(modeloLoja.isVisible());
    }
}
