/*
    Fenêtre de Jeu
    Mini-Projet : Speed-Click
    ROQUE Daphné & LAJOUS Malô
    Décembre 2021
*/
package speed.click;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

public class FenetreDeJeu extends javax.swing.JFrame {

    Cellule [][] CellulesJeu;
    Grille grilleJeu;
    Joueur joueurCourant;
    double timer;
    JButton [][] celluleGraphique=new JButton [2][2];
    

    

    public FenetreDeJeu() {
        initComponents();

        grilleJeu= new Grille(2);
        
        CellulesJeu=new Cellule [2][2];
        for (int l = 0 ; l<2 ; l++){
            for(int c=0 ; c<2 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
        
        celluleGraphique[0][0]=cellule11;
        celluleGraphique[0][1]=cellule12;
        celluleGraphique[1][0]=cellule21;
        celluleGraphique[1][1]=cellule22;
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grilleJeu_graphique = new javax.swing.JPanel();
        cellule11 = new javax.swing.JButton();
        cellule12 = new javax.swing.JButton();
        cellule21 = new javax.swing.JButton();
        cellule22 = new javax.swing.JButton();
        chronometre = new javax.swing.JPanel();
        chronometre1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        START = new javax.swing.JButton();
        infosjoueur = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorejoueur = new javax.swing.JLabel();
        nomjoueur = new javax.swing.JLabel();
        recordnomjoueur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        infospartie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mode1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleJeu_graphique.setBackground(new java.awt.Color(204, 255, 255));
        grilleJeu_graphique.setPreferredSize(new java.awt.Dimension(520, 520));
        grilleJeu_graphique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cellule11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        cellule12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule12ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 300));

        cellule21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule21ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 300));

        cellule22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule22ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 300));

        getContentPane().add(grilleJeu_graphique, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 600));

        chronometre.setBackground(new java.awt.Color(255, 255, 204));
        chronometre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chronometre1.setBackground(new java.awt.Color(255, 255, 204));
        chronometre1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chronometre.add(chronometre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 310, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Chronomètre : ");
        chronometre.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        START.setText("START");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        chronometre.add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 40));

        getContentPane().add(chronometre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 310, 130));

        infosjoueur.setBackground(new java.awt.Color(255, 255, 204));
        infosjoueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Infos Joueurs : ");
        infosjoueur.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        scorejoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scorejoueur.setText("scorejoueur");
        infosjoueur.add(scorejoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        nomjoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomjoueur.setText("nomjoueur");
        infosjoueur.add(nomjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        recordnomjoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recordnomjoueur.setText("reccordnomjoueur");
        infosjoueur.add(recordnomjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Score : ");
        infosjoueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        infosjoueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nom : ");
        infosjoueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Reccord : ");
        infosjoueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 20));

        getContentPane().add(infosjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 310, 250));

        infospartie.setBackground(new java.awt.Color(255, 255, 204));
        infospartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Selectionner mode de jeu : ");
        infospartie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 20));

        mode1.setText("mode1");
        mode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mode1ActionPerformed(evt);
            }
        });
        infospartie.add(mode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        getContentPane().add(infospartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 310, 120));

        setBounds(0, 0, 1000, 668);
    }// </editor-fold>//GEN-END:initComponents

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STARTActionPerformed

    private void mode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mode1ActionPerformed

    private void cellule11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11ActionPerformed
        if (CellulesJeu[0][0].EstAllume){ 
            eteindreCellule(0,0);
            celluleGraphique[0][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          
    }//GEN-LAST:event_cellule11ActionPerformed

    private void cellule21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule21ActionPerformed
        allumerCelluleAleat() ;
        allumerCelluleAleat_graph();
    }//GEN-LAST:event_cellule21ActionPerformed

    private void cellule12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule12ActionPerformed
        allumerCelluleAleat() ;
        allumerCelluleAleat_graph();
    }//GEN-LAST:event_cellule12ActionPerformed

    private void cellule22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule22ActionPerformed
        allumerCelluleAleat() ;
        allumerCelluleAleat_graph();
    }//GEN-LAST:event_cellule22ActionPerformed


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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }
    
    public void allumerCelluleAleat() {
        allumerCellule(new Random().nextInt(2),new Random().nextInt(2)); 
    }
    
    public void allumerCelluleAleat_graph(){
        for (int l =0; l<2; l++){
            for (int c = 0; c<2; c++){
                if (CellulesJeu[c][l].EstAllume){ 
                    celluleGraphique[c][l].setBackground(Color.RED);
                }
            }
        }
    }
    
    public void allumerCellule (int x, int y){
        CellulesJeu[x][y].allumer();
    }
    
    public void eteindreCellule (int x, int y){
        CellulesJeu[x][y].eteindre();
    }
    



   



    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton START;
    private javax.swing.JButton cellule11;
    private javax.swing.JButton cellule12;
    private javax.swing.JButton cellule21;
    private javax.swing.JButton cellule22;
    private javax.swing.JPanel chronometre;
    private javax.swing.JPanel chronometre1;
    private javax.swing.JPanel grilleJeu_graphique;
    private javax.swing.JPanel infosjoueur;
    private javax.swing.JPanel infospartie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mode1;
    private javax.swing.JLabel nomjoueur;
    private javax.swing.JLabel recordnomjoueur;
    private javax.swing.JLabel scorejoueur;
    // End of variables declaration//GEN-END:variables
}
