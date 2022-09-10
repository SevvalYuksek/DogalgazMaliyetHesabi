package com.mycompany.mavenproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Şevval
 */
public class KombiMaliyetFrame extends javax.swing.JFrame {

    int cost = 0;
    int tesisat,termostat,kombi,radyatör,boru;
    public KombiMaliyetFrame() {
        initComponents();
        Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2 );
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0,0,0,0));
        
    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tesisat_box = new javax.swing.JComboBox<>();
        kombi_box = new javax.swing.JComboBox<>();
        hesapla_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cost_field = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("DÖNÜŞÜM MALİYET HESABI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 330, 50));

        jLabel6.setBackground(java.awt.Color.white);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));

        jButton2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 130, 30));

        tesisat_box.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        tesisat_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kombi Değişimi", "Kombi Değişimi + Kombi Dolabı" }));
        tesisat_box.setSelectedIndex(-1);
        tesisat_box.setToolTipText("");
        tesisat_box.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tesisat_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesisat_boxActionPerformed(evt);
            }
        });
        jPanel1.add(tesisat_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 230, 40));

        kombi_box.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        kombi_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomik", "Orta Seviye", "Üst Seviye", " " }));
        kombi_box.setSelectedIndex(-1);
        kombi_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kombi_boxActionPerformed(evt);
            }
        });
        jPanel1.add(kombi_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 230, 40));

        hesapla_button.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        hesapla_button.setText("HESAPLA");
        hesapla_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapla_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(hesapla_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 130, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kombi Seçimi ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 230, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Evinize Yapılacak İş");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 230, 30));

        jButton1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton1.setText("ANASAYFA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 130, 30));

        cost_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(cost_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 100, 30));

        jTextField2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTextField2.setText("  YAKLAŞIK MALİYET :");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 140, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setText("1821012025");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 130, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setText("ŞEVVAL YÜKSEK ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 130, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/frame.jpg"))); // NOI18N
        jLabel2.setText("DO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1053, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tesisat_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesisat_boxActionPerformed
        
        String tesisat = (String) tesisat_box.getSelectedItem();
        switch(tesisat){
            case "Kombi Değişimi":
                cost= cost+1200;
            case "Kombi Değişimi + Kombi Dolabı":
                cost= cost+1600;
                System.out.println(cost);
        }
    }//GEN-LAST:event_tesisat_boxActionPerformed

    private void cost_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_fieldActionPerformed
        
    }//GEN-LAST:event_cost_fieldActionPerformed

    private void hesapla_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesapla_buttonActionPerformed
        
        //cost_field.setColumns(cost);
        String sonuc = String.valueOf(cost);
        cost_field.setText(sonuc);
        
        //JOptionPane.showMessageDialog(null, "YAKLAŞIK MALİYET HESABI :" +cost);
        
        
    }//GEN-LAST:event_hesapla_buttonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void kombi_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kombi_boxActionPerformed
        String kombi = (String) kombi_box.getSelectedItem();
        switch(kombi){
            case "Ekonomik":
                cost= 8100;
                System.out.println(cost);
            case "Orta Seviye":
                cost= 9600;
            case "Üst Seviye":
                cost= 11100;
            
        }
    }//GEN-LAST:event_kombi_boxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(KombiMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KombiMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KombiMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KombiMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KombiMaliyetFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cost_field;
    private javax.swing.JButton hesapla_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> kombi_box;
    private javax.swing.JComboBox<String> tesisat_box;
    // End of variables declaration//GEN-END:variables
}
