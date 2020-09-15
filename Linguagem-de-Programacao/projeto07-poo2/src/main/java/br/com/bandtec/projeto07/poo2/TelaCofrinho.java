/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto07.poo2;

/**
 *
 * @author Aluno
 */
public class TelaCofrinho extends javax.swing.JFrame {
    
    /*
    "cofrinho1" é um "atributo de instâcia" da "TelaCofrinho"
    "cofrinho1" é um OBJETO dot tipo "Cofrinho"
    */
    Cofrinho cofrinho1 = new Cofrinho();
    
    // O mesmo vale para "cofrinho2" e "cofrinho3"
    Cofrinho cofrinho2 = new Cofrinho();
    Cofrinho cofrinho3 = new Cofrinho();

    void atualizarSaldos(){
        lbSaldo1.setText(cofrinho1.saldo.toString());
        lbSaldo2.setText(cofrinho2.saldo.toString());
        lbSaldo3.setText(cofrinho3.saldo.toString());
    }
    
    void tirar1real(Cofrinho algumCofrinho){
        
        if (algumCofrinho.saldo - 1 >= 0){
            algumCofrinho.saldo -= 1;
            atualizarSaldos();
        }
    }
    
    void depositar2reais(Cofrinho algumCofrinho){
        
        if (algumCofrinho.saldo + 2 <= 20){
            algumCofrinho.saldo += 2;
            atualizarSaldos();
        }
    }
    
    /**
     * Creates new form TelaCofrinho
     */
    public TelaCofrinho() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbSaldo1 = new javax.swing.JLabel();
        btDepositar1 = new javax.swing.JButton();
        btTirar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbSaldo2 = new javax.swing.JLabel();
        btDepositar2 = new javax.swing.JButton();
        btTirar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbSaldo3 = new javax.swing.JLabel();
        btDepositar3 = new javax.swing.JButton();
        btTirar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor guardado:");

        lbSaldo1.setText("0");

        btDepositar1.setText("Depositar 2,00");
        btDepositar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar1ActionPerformed(evt);
            }
        });

        btTirar1.setText("Tirar 1,00");
        btTirar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor guardado:");

        lbSaldo2.setText("0");

        btDepositar2.setText("Depositar 2,00");
        btDepositar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar2ActionPerformed(evt);
            }
        });

        btTirar2.setText("Tirar 1,00");
        btTirar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor guardado:");

        lbSaldo3.setText("0");

        btDepositar3.setText("Depositar 2,00");
        btDepositar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar3ActionPerformed(evt);
            }
        });

        btTirar3.setText("Tirar 1,00");
        btTirar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbSaldo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btDepositar3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTirar3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbSaldo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btDepositar2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btTirar2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbSaldo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btDepositar1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btTirar1))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar1)
                    .addComponent(btTirar1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbSaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar2)
                    .addComponent(btTirar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbSaldo3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar3)
                    .addComponent(btTirar3))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTirar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar1ActionPerformed
        tirar1real(cofrinho1);
    }//GEN-LAST:event_btTirar1ActionPerformed

    private void btDepositar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar1ActionPerformed
        depositar2reais(cofrinho1);
    }//GEN-LAST:event_btDepositar1ActionPerformed

    private void btDepositar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar2ActionPerformed
        depositar2reais(cofrinho2);
    }//GEN-LAST:event_btDepositar2ActionPerformed

    private void btTirar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar2ActionPerformed
        tirar1real(cofrinho2);
    }//GEN-LAST:event_btTirar2ActionPerformed

    private void btDepositar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar3ActionPerformed
        depositar2reais(cofrinho3);
    }//GEN-LAST:event_btDepositar3ActionPerformed

    private void btTirar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar3ActionPerformed
        tirar1real(cofrinho3);
    }//GEN-LAST:event_btTirar3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCofrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar1;
    private javax.swing.JButton btDepositar2;
    private javax.swing.JButton btDepositar3;
    private javax.swing.JButton btTirar1;
    private javax.swing.JButton btTirar2;
    private javax.swing.JButton btTirar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSaldo1;
    private javax.swing.JLabel lbSaldo2;
    private javax.swing.JLabel lbSaldo3;
    // End of variables declaration//GEN-END:variables
}