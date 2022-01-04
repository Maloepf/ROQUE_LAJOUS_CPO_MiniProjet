package speed.click;

import javax.swing.JFrame;


public class Interfacedemarrage extends javax.swing.JFrame {

     String nomDuJoueur;

    public Interfacedemarrage() {
        initComponents();
        
    }
    
    public String getnomDuJoueur(){
        return nomDuJoueur;
    }
    
    InterfacePartie2x2classique fenetreJeu2x2_classique = new InterfacePartie2x2classique();
    InterfacePartie4x4infinie fenetreJeu4x4_infini = new InterfacePartie4x4infinie();
    InterfacePartie4x4classique fenetreJeu4x4_classique = new InterfacePartie4x4classique();
    InterfacePartie16x16infini fenetreJeu16x16_infini = new InterfacePartie16x16infini();
    InterfacePartie16x16classique fenetreJeu16x16_classique = new InterfacePartie16x16classique();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_16x16_infini = new javax.swing.JPanel();
        entrezpeudo = new javax.swing.JTextField();
        pseudo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        partie = new javax.swing.JLabel();
        partie2x2 = new javax.swing.JLabel();
        partie4X4 = new javax.swing.JLabel();
        partie16x16 = new javax.swing.JLabel();
        btn_2x2_infini = new javax.swing.JButton();
        btn_2x2_classique1 = new javax.swing.JButton();
        btn_4x4_classique = new javax.swing.JButton();
        btn_4x4_infini = new javax.swing.JButton();
        btn_16x16_classique = new javax.swing.JButton();
        btn_2x2_classique5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("panel demarrage"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_16x16_infini.setBackground(new java.awt.Color(255, 255, 204));
        btn_16x16_infini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        entrezpeudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrezpeudoActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(entrezpeudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 240, 40));

        pseudo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pseudo.setText(" Entrez votre PSEUDO : ");
        btn_16x16_infini.add(pseudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, 100));
        btn_16x16_infini.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 990, 10));

        partie.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        partie.setText("MODE Partie :");
        btn_16x16_infini.add(partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 50));

        partie2x2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        partie2x2.setText("2x2");
        btn_16x16_infini.add(partie2x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 60, 40));

        partie4X4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        partie4X4.setText("4X4");
        btn_16x16_infini.add(partie4X4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, 40));

        partie16x16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        partie16x16.setText("16x16");
        btn_16x16_infini.add(partie16x16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 80, 30));

        btn_2x2_infini.setText("infini");
        btn_2x2_infini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2x2_infiniActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_2x2_infini, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 110, 40));

        btn_2x2_classique1.setText("classique");
        btn_2x2_classique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2x2_classique1ActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_2x2_classique1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, 40));

        btn_4x4_classique.setText("classique");
        btn_4x4_classique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4x4_classiqueActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_4x4_classique, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 110, 40));

        btn_4x4_infini.setText("infini");
        btn_4x4_infini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4x4_infiniActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_4x4_infini, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 110, 40));

        btn_16x16_classique.setText("classique");
        btn_16x16_classique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_16x16_classiqueActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_16x16_classique, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 110, 40));

        btn_2x2_classique5.setText("infini");
        btn_2x2_classique5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2x2_classique5ActionPerformed(evt);
            }
        });
        btn_16x16_infini.add(btn_2x2_classique5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 110, 40));

        getContentPane().add(btn_16x16_infini, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrezpeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrezpeudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrezpeudoActionPerformed

    private void btn_2x2_infiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2x2_infiniActionPerformed
        FenetreDeJeu fenetreJeu2x2_infini = new FenetreDeJeu();
        fenetreJeu2x2_infini.setVisible(true);
        fenetreJeu2x2_infini.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nomDuJoueur = entrezpeudo.getText();
        fenetreJeu2x2_infini.PlayerName=nomDuJoueur;
        fenetreJeu2x2_infini.AssimilationNom();
    }//GEN-LAST:event_btn_2x2_infiniActionPerformed

    private void btn_2x2_classique1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2x2_classique1ActionPerformed
          fenetreJeu2x2_classique.setVisible(true);
          fenetreJeu2x2_classique.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_2x2_classique1ActionPerformed

    private void btn_4x4_classiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4x4_classiqueActionPerformed
        fenetreJeu4x4_classique.setVisible(true);
        fenetreJeu4x4_classique.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btn_4x4_classiqueActionPerformed

    private void btn_4x4_infiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4x4_infiniActionPerformed
        fenetreJeu4x4_infini.setVisible(true);
        fenetreJeu4x4_infini.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_4x4_infiniActionPerformed

    private void btn_16x16_classiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_16x16_classiqueActionPerformed
        fenetreJeu16x16_classique.setVisible(true);
        fenetreJeu16x16_classique.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_16x16_classiqueActionPerformed

    private void btn_2x2_classique5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2x2_classique5ActionPerformed
        fenetreJeu16x16_infini.setVisible(true);
        fenetreJeu16x16_infini.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_2x2_classique5ActionPerformed


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
            java.util.logging.Logger.getLogger(Interfacedemarrage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfacedemarrage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfacedemarrage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfacedemarrage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfacedemarrage().setVisible(true);
            }
        });
    }
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_16x16_classique;
    private javax.swing.JPanel btn_16x16_infini;
    private javax.swing.JButton btn_2x2_classique1;
    private javax.swing.JButton btn_2x2_classique5;
    private javax.swing.JButton btn_2x2_infini;
    private javax.swing.JButton btn_4x4_classique;
    private javax.swing.JButton btn_4x4_infini;
    private javax.swing.JTextField entrezpeudo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel partie;
    private javax.swing.JLabel partie16x16;
    private javax.swing.JLabel partie2x2;
    private javax.swing.JLabel partie4X4;
    private javax.swing.JLabel pseudo;
    // End of variables declaration//GEN-END:variables
}


