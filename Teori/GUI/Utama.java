
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d14h
 */
public class Utama extends javax.swing.JFrame implements java.io.Serializable {

    double bilangan1, bilangan2, hasilOperasi;
    String tampilanHasil;
    int pilihanOperasi;
    
    /**
     * Creates new form Utama
     */
    public Utama() {
        initComponents();
        setTitle("Kalkulator Nama Saudara");
        setLocationRelativeTo(null);
        setVisible(true);
        tampilanHasil="";
    }

    public void getNama(String nama){
        
    }
    
    public void setNama(String nama){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        tb7 = new javax.swing.JButton();
        tb8 = new javax.swing.JButton();
        tb9 = new javax.swing.JButton();
        tb4 = new javax.swing.JButton();
        tb5 = new javax.swing.JButton();
        tb6 = new javax.swing.JButton();
        tb1 = new javax.swing.JButton();
        tb2 = new javax.swing.JButton();
        tb3 = new javax.swing.JButton();
        tbKoma = new javax.swing.JButton();
        tb0 = new javax.swing.JButton();
        tbNegatif = new javax.swing.JButton();
        tbBagi = new javax.swing.JButton();
        tbKali = new javax.swing.JButton();
        tbKurang = new javax.swing.JButton();
        tbTambah = new javax.swing.JButton();
        tbHasil = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tb7.setText("7");

        tb8.setText("8");

        tb9.setText("9");

        tb4.setText("4");
        tb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb4ActionPerformed(evt);
            }
        });

        tb5.setText("5");
        tb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb5ActionPerformed(evt);
            }
        });

        tb6.setText("6");
        tb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb6ActionPerformed(evt);
            }
        });

        tb1.setText("1");
        tb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb1ActionPerformed(evt);
            }
        });

        tb2.setText("2");
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });

        tb3.setText("3");
        tb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb3ActionPerformed(evt);
            }
        });

        tbKoma.setText(".");

        tb0.setText("0");

        tbNegatif.setText("(-)");

        tbBagi.setText("/");
        tbBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBagiActionPerformed(evt);
            }
        });

        tbKali.setText("x");
        tbKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKaliActionPerformed(evt);
            }
        });

        tbKurang.setText("-");
        tbKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKurangActionPerformed(evt);
            }
        });

        tbTambah.setText("+");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });

        tbHasil.setText("=");
        tbHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHasilActionPerformed(evt);
            }
        });

        tbHapus.setText("C");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tb7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tb8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tb9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tb4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tb5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbKoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tb2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tb0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tbNegatif)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbKurang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbBagi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbKali, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbHasil, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb7)
                            .addComponent(tb9)
                            .addComponent(tb8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb4)
                            .addComponent(tb6)
                            .addComponent(tb5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb1)
                            .addComponent(tb3)
                            .addComponent(tb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbKoma)
                            .addComponent(tbNegatif)
                            .addComponent(tb0)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tbTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbKurang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbBagi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbKali))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tbHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb1ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "1";
        jTextField2.setText("1");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb1ActionPerformed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "2";
        jTextField2.setText("2");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb2ActionPerformed

    private void tb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb3ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "3";
        jTextField2.setText("3");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb3ActionPerformed

    private void tb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb4ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "4";
        jTextField2.setText("4");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb4ActionPerformed

    private void tb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb5ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "5";
        jTextField2.setText("5");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb5ActionPerformed

    private void tb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb6ActionPerformed
        // TODO add your handling code here:
        tampilanHasil += "6";
        jTextField2.setText("6");
        jTextField2.setText(tampilanHasil);
    }//GEN-LAST:event_tb6ActionPerformed

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        bilangan1 = Double.parseDouble(tampilanHasil);
        tampilanHasil = "";
        jTextField2.setText("+");
        pilihanOperasi = 1;
    }//GEN-LAST:event_tbTambahActionPerformed

    private void tbKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKurangActionPerformed
        // TODO add your handling code here:
        bilangan1 = Double.parseDouble(tampilanHasil);
        tampilanHasil = "";
        jTextField2.setText("-");
        pilihanOperasi = 2;
    }//GEN-LAST:event_tbKurangActionPerformed

    private void tbBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBagiActionPerformed
        // TODO add your handling code here:
        bilangan1 = Double.parseDouble(tampilanHasil);
        tampilanHasil = "";
        jTextField2.setText("/");
        pilihanOperasi = 3;
    }//GEN-LAST:event_tbBagiActionPerformed

    private void tbKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKaliActionPerformed
        // TODO add your handling code here:
        bilangan1 = Double.parseDouble(tampilanHasil);
        tampilanHasil = "";
        jTextField2.setText("x");
        pilihanOperasi = 4;
    }//GEN-LAST:event_tbKaliActionPerformed

    private void tbHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHasilActionPerformed
        // TODO add your handling code here:
        switch(pilihanOperasi)
        {
            case 1 :
                bilangan2 = Double.parseDouble(tampilanHasil);
                hasilOperasi = bilangan1 + bilangan2;
                tampilanHasil = Double.toString(hasilOperasi);
                jTextField2.setText(tampilanHasil);
                break;
            case 2:
                
        }
    }//GEN-LAST:event_tbHasilActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        bilangan1 = 0.0;
        bilangan2 = 0.0;
        hasilOperasi = 0.0;
        tampilanHasil="";
        jTextField2.setText(null);
    }//GEN-LAST:event_tbHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
         //   public void run() {
            Sekilas s = new Sekilas();
            s.setVisible(true);
            s.setLocationRelativeTo(null);
            try {
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
            Logger.getLogger(Utama.class.getName()).log(Level.SEVERE, null, ex);
            }
            s.dispose();
            new Utama().setVisible(true);
         //   }
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton tb0;
    private javax.swing.JButton tb1;
    private javax.swing.JButton tb2;
    private javax.swing.JButton tb3;
    private javax.swing.JButton tb4;
    private javax.swing.JButton tb5;
    private javax.swing.JButton tb6;
    private javax.swing.JButton tb7;
    private javax.swing.JButton tb8;
    private javax.swing.JButton tb9;
    private javax.swing.JButton tbBagi;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbHasil;
    private javax.swing.JButton tbKali;
    private javax.swing.JButton tbKoma;
    private javax.swing.JButton tbKurang;
    private javax.swing.JButton tbNegatif;
    private javax.swing.JButton tbTambah;
    // End of variables declaration//GEN-END:variables
}