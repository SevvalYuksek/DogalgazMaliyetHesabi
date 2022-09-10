package com.mycompany.mavenproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Şevval
 */
public class TesisatMaliyetFrame extends javax.swing.JFrame {

    int cost = 500;
    int tesisat,termostat,kombi,radyatör,boru;
    public TesisatMaliyetFrame() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tesisat_box = new javax.swing.JComboBox<>();
        kombi_box = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        metre_button = new javax.swing.JButton();
        metre_text = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        termostat_box = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        radyatör_text = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tesisat_box2 = new javax.swing.JComboBox<>();
        radyatör_button = new javax.swing.JButton();
        hesapla_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cost_field = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Havlupan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 230, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("TAM TESİSAT MALİYET HESABI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 340, 50));

        jLabel6.setBackground(java.awt.Color.white);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Evin Metrekare Değerini Giriniz");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 230, 30));

        tesisat_box.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        tesisat_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Şap Üstü Full Tesisat", "Şap Altı (Kırımlı) Full Tesisat" }));
        tesisat_box.setSelectedIndex(-1);
        tesisat_box.setToolTipText("");
        tesisat_box.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tesisat_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesisat_boxActionPerformed(evt);
            }
        });
        jPanel1.add(tesisat_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, 40));

        kombi_box.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        kombi_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomik", "Orta Seviye", "Üst Seviye", "Kombim var, istemiyorum." }));
        kombi_box.setSelectedIndex(-1);
        kombi_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kombi_boxActionPerformed(evt);
            }
        });
        jPanel1.add(kombi_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jCheckBox1.setText("Havlupan İhtiyacınız İçin Tıklayınız");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 210, 40));

        metre_button.setText("Gir");
        metre_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metre_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(metre_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 80, 40));

        metre_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metre_textActionPerformed(evt);
            }
        });
        jPanel1.add(metre_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 140, 40));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 230, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Oda Termostatı Seçimi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 230, 30));

        termostat_box.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        termostat_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oda Termostatı İstemiyorum", "Kablolu Oda Termostatı", "Kablosuz Oda Termostatı" }));
        termostat_box.setSelectedIndex(-1);
        termostat_box.setToolTipText("");
        termostat_box.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        termostat_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termostat_boxActionPerformed(evt);
            }
        });
        jPanel1.add(termostat_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 230, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Oda Sayınıza Göre Radyatör Sayısı ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 250, 30));
        jPanel1.add(radyatör_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 140, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Doğalgaz Tesisatı Seçimi");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 230, 30));

        tesisat_box2.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        tesisat_box2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Demir Boru Tesisatı", "Esnek Boru Tesisatı" }));
        tesisat_box2.setSelectedIndex(-1);
        tesisat_box2.setToolTipText("");
        tesisat_box2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tesisat_box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tesisat_box2ActionPerformed(evt);
            }
        });
        jPanel1.add(tesisat_box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 230, 40));

        radyatör_button.setText("Gir");
        radyatör_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radyatör_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(radyatör_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 80, 40));

        hesapla_button.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        hesapla_button.setText("HESAPLA");
        hesapla_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapla_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(hesapla_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Evinize Yapılacak İş");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kombi Dolabı");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 230, 30));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jCheckBox2.setText("Kombi Dolabı İhtiyacınız İçin Tıklayınız");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 230, 40));

        jButton2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 130, 30));

        jButton1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jButton1.setText("ANASAYFA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 130, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel13.setText("ŞEVVAL YÜKSEK ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 130, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel14.setText("1821012025");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 130, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kombi Seçimi ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 30));

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
            case "Şap Üstü Full Tesisat":
                cost= cost+4750;
            case "Şap Altı (Kırımlı) Full Tesisat":
                cost= cost+5000;
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
                cost= cost+5500;
                System.out.println(cost);
            case "Orta Seviye":
                cost= cost+6500;
            case "Üst Seviye":
                cost= cost+8500;
            case "Kombim var, istemiyorum.":
                cost= cost+0;
        }
    }//GEN-LAST:event_kombi_boxActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        cost= cost+350;
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void metre_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metre_buttonActionPerformed
        String degerm = metre_text.getText();
        int a = Integer.parseInt(degerm);
        int b = a/10;
        int m= b*100;
        System.out.println(m);
        cost = cost +m;
        
    }//GEN-LAST:event_metre_buttonActionPerformed

    private void radyatör_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radyatör_buttonActionPerformed
        String deger = radyatör_text.getText();
        int x = Integer.parseInt(deger);
        radyatör=x*950;
        
        System.out.println(radyatör);
        cost = cost + radyatör;
    }//GEN-LAST:event_radyatör_buttonActionPerformed

    private void metre_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metre_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metre_textActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void termostat_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termostat_boxActionPerformed
        
        String termostat = (String) termostat_box.getSelectedItem();
        switch(termostat){
            case "Oda Termostatı İstemiyorum":
                cost= cost+0;
                System.out.println(cost);
            case "Kablolu Oda Termostatı":
                cost= cost+350;
            case "Kablosuz Oda Termostatı":
                cost= cost+700;
            
        }
        
    }//GEN-LAST:event_termostat_boxActionPerformed

    private void tesisat_box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tesisat_box2ActionPerformed
       
        String boru = (String) termostat_box.getSelectedItem();
        switch(boru){
            case "Demir Boru Tesisatı":
                cost= cost+0;
                System.out.println(cost);
            case "Esnek Boru Tesisatı":
                cost= cost+1000;
            
        }
    }//GEN-LAST:event_tesisat_box2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home homeFrame = new Home();
        homeFrame.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(TesisatMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesisatMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesisatMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesisatMaliyetFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesisatMaliyetFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cost_field;
    private javax.swing.JButton hesapla_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> kombi_box;
    private javax.swing.JButton metre_button;
    private javax.swing.JTextField metre_text;
    private javax.swing.JButton radyatör_button;
    private javax.swing.JTextField radyatör_text;
    private javax.swing.JComboBox<String> termostat_box;
    private javax.swing.JComboBox<String> tesisat_box;
    private javax.swing.JComboBox<String> tesisat_box2;
    // End of variables declaration//GEN-END:variables
}
