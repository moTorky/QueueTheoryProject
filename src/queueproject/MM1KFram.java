/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueproject;

import java.text.DecimalFormat;

/**
 *
 * @author power
 */
public class MM1KFram extends javax.swing.JFrame {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private DD1kFram parent;
    public MM1KFram(DD1kFram dD1kFram) {
        initComponents();
        this.parent = dD1kFram ;
    }

    private MM1KFram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_W = new javax.swing.JTextField();
        txt_WQ = new javax.swing.JTextField();
        txt_L = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_LQ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Lambda = new javax.swing.JTextField();
        txt_Mu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_k = new javax.swing.JTextField();
        back_Btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("get Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("WQ : ");

        jLabel5.setText("W :");

        txt_W.setEditable(false);
        txt_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_WActionPerformed(evt);
            }
        });

        txt_WQ.setEditable(false);
        txt_WQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_WQActionPerformed(evt);
            }
        });

        txt_L.setEditable(false);
        txt_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LActionPerformed(evt);
            }
        });

        jLabel1.setText("Lambda : ");

        txt_LQ.setEditable(false);
        txt_LQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LQActionPerformed(evt);
            }
        });

        jLabel2.setText("Mu : ");

        jLabel3.setText("L : ");

        jLabel4.setText("LQ : ");

        txt_Lambda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LambdaActionPerformed(evt);
            }
        });

        txt_Mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MuActionPerformed(evt);
            }
        });

        jLabel7.setText("K :");

        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });

        back_Btn.setText("Back");
        back_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BtnActionPerformed(evt);
            }
        });

        jLabel8.setText("MM1K");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2))
                                    .addGap(23, 23, 23)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Mu, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txt_Lambda, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_LQ, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_W, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_WQ, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_k)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_Btn)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_Btn)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Lambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Mu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_L, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_LQ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_W, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_WQ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double Lambda, Mu;
        int k;
        Lambda = validateUserInput.validateNumber(txt_Lambda.getText());
        Mu = validateUserInput.validateNumber(txt_Mu.getText());
        k = (int)validateUserInput.validateNumber(txt_k.getText());
        if(Lambda == -1 || Mu == -1 || k == -1)
        {
            errorMsg msg = new errorMsg();
            msg.setVisible(true);
            return;
        }
        queueMM1K mM1K = new queueMM1K(Lambda, Mu,k);

        txt_L.setText(df.format(mM1K.getL())+"");
        txt_LQ.setText(df.format(mM1K.getLq())+"");
        txt_W.setText(df.format(mM1K.getW())+"");
        txt_WQ.setText(df.format(mM1K.getWq())+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_WActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_WActionPerformed

    private void txt_WQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_WQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_WQActionPerformed

    private void txt_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LActionPerformed

    private void txt_LQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LQActionPerformed

    private void txt_LambdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LambdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LambdaActionPerformed

    private void txt_MuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MuActionPerformed

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kActionPerformed

    private void back_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BtnActionPerformed
        // TODO add your handling code here:
        parent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(MM1KFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MM1KFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MM1KFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MM1KFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MM1KFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_L;
    private javax.swing.JTextField txt_LQ;
    private javax.swing.JTextField txt_Lambda;
    private javax.swing.JTextField txt_Mu;
    private javax.swing.JTextField txt_W;
    private javax.swing.JTextField txt_WQ;
    private javax.swing.JTextField txt_k;
    // End of variables declaration//GEN-END:variables
}
