package com.mycompany.mavenproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Şevval
 */
public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2 );
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0,0,0,0));
        
        ImageIcon icon = new ImageIcon("home.jpg");
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tamtesisat_button = new javax.swing.JButton();
        donusum_button = new javax.swing.JButton();
        kombi_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tesisat_box2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tamtesisat_button.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        tamtesisat_button.setText("TAM TESİSAT MALİYET HESABI  ");
        tamtesisat_button.setToolTipText("Dairenizde kalorifer hattı, doğalgaz hattı, kombi ve radyatörleriniz yoksa full tesisat yaptırmalısınız.");
        tamtesisat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamtesisat_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(tamtesisat_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 240, 30));

        donusum_button.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        donusum_button.setText("DÖNÜŞÜM MALİYET HESABI  ");
        donusum_button.setToolTipText("Dairenizde kalorifer hattı ve radyatörleriniz mevcut, doğalgaz hattınız ve kombiniz yoksa dönüşüm yaptırmalısınız.");
        donusum_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donusum_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(donusum_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 240, 30));

        kombi_button.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        kombi_button.setText("KOMBİ DEĞİŞİM MALİYETİ  ");
        kombi_button.setToolTipText("Dairenizde kalorifer hattı, doğalgaz hattı ve radyatörleriniz mevcut, kombiniz yoksa veya kombinizi değiştirecekseniz bu hizmetten yararlanabilirsiniz.");
        kombi_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kombi_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(kombi_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 240, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 280, 50));

        jButton1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("ŞEVVAL YÜKSEK ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 130, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setText("1821012025");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 130, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("DOĞALGAZ MALİYET HESABI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 330, 50));

        jLabel6.setBackground(java.awt.Color.white);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Gece\\Yeni klasör\\Proje\\Java\\mavenproject\\home.jpg")); // NOI18N
        jLabel2.setText("DO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        tesisat_box2.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        tesisat_box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Şap Üstü Full Tesisat", "Şap Altı (Kırımlı) Full Tesisat" }));
        tesisat_box2.setSelectedIndex(-1);
        tesisat_box2.setToolTipText("");
        tesisat_box2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tesisat_box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesisat_box2ActionPerformed(evt);
            }
        });
        jPanel1.add(tesisat_box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1053, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tesisat_box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesisat_box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tesisat_box2ActionPerformed

    private void tamtesisat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamtesisat_buttonActionPerformed

        TesisatMaliyetFrame tesisatNewFrame = new TesisatMaliyetFrame();
        tesisatNewFrame.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tamtesisat_buttonActionPerformed

    private void donusum_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donusum_buttonActionPerformed
        DonusumMaliyetFrame donusumNewFrame = new DonusumMaliyetFrame();
        donusumNewFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_donusum_buttonActionPerformed

    private void kombi_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kombi_buttonActionPerformed
        KombiMaliyetFrame kombiNewFrame = new KombiMaliyetFrame();
        kombiNewFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kombi_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donusum_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kombi_button;
    private javax.swing.JButton tamtesisat_button;
    private javax.swing.JComboBox<String> tesisat_box2;
    // End of variables declaration//GEN-END:variables
}
