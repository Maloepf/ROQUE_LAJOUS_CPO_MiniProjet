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
    Joueur Player;
    String PlayerName;
    int Score;
    JButton [][] celluleGraphique=new JButton [2][2];
    

    

    public FenetreDeJeu() {
        initComponents();
        
        Score = 0;
        scorejoueur1.setText(""+Score);
        
        grilleJeu= new Grille(2);
        
        CellulesJeu=new Cellule [2][2];
        for (int l = 0 ; l<2 ; l++){
            for(int c=0 ; c<2 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
        celluleGraphique[0][0]=cellule00;
        celluleGraphique[0][1]=cellule01;
        celluleGraphique[1][0]=cellule10;
        celluleGraphique[1][1]=cellule22;
        
        allumerCelluleAleat();
        allumerCelluleAleat_graph();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grilleJeu_graphique = new javax.swing.JPanel();
        cellule00 = new javax.swing.JButton();
        cellule01 = new javax.swing.JButton();
        cellule10 = new javax.swing.JButton();
        cellule22 = new javax.swing.JButton();
        infosjoueur = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorejoueur1 = new javax.swing.JLabel();
        nomjoueur = new javax.swing.JLabel();
        recordnomjoueur1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nom = new javax.swing.JLabel();
        Record = new javax.swing.JLabel();
        panneaumodepartie = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleJeu_graphique.setBackground(new java.awt.Color(204, 255, 255));
        grilleJeu_graphique.setPreferredSize(new java.awt.Dimension(520, 520));
        grilleJeu_graphique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cellule00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule00ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule00, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        cellule01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule01ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule01, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 300, 300));

        cellule10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 300));

        cellule22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule22ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 300));

        getContentPane().add(grilleJeu_graphique, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 600));

        infosjoueur.setBackground(new java.awt.Color(255, 255, 204));
        infosjoueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Infos Joueurs : ");
        infosjoueur.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        scorejoueur1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scorejoueur1.setText("scorejoueur1");
        infosjoueur.add(scorejoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        nomjoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomjoueur.setText("nomjoueur");
        infosjoueur.add(nomjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        recordnomjoueur1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recordnomjoueur1.setText("reccordnomjoueur1");
        infosjoueur.add(recordnomjoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Score : ");
        infosjoueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        infosjoueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        Nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nom.setText("Nom : ");
        infosjoueur.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        Record.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Record.setText("Reccord : ");
        infosjoueur.add(Record, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 20));

        getContentPane().add(infosjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 310, 250));

        panneaumodepartie.setBackground(new java.awt.Color(255, 153, 255));
        panneaumodepartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("Bienvenue dans la Partie 2x2 classique");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panneaumodepartie.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 307, 48));

        getContentPane().add(panneaumodepartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 380, -1));

        setBounds(0, 0, 1077, 771);
    }// </editor-fold>//GEN-END:initComponents

    private void cellule00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule00ActionPerformed
        if (CellulesJeu[0][0].EstAllume){ 
            Score++;
            scorejoueur1.setText(""+Score);
            eteindreCellule(0,0);
            celluleGraphique[0][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }          
    }//GEN-LAST:event_cellule00ActionPerformed

    private void cellule10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10ActionPerformed
        if (CellulesJeu[1][0].EstAllume){ 
            Score++;
            scorejoueur1.setText(""+Score);
            eteindreCellule(1,0);
            celluleGraphique[1][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }  
    }//GEN-LAST:event_cellule10ActionPerformed

    private void cellule01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule01ActionPerformed
        if (CellulesJeu[0][1].EstAllume){ 
            Score++;
            scorejoueur1.setText(""+Score);
            eteindreCellule(0,1);
            celluleGraphique[0][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }  
    }//GEN-LAST:event_cellule01ActionPerformed

    private void cellule22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule22ActionPerformed
        if (CellulesJeu[1][1].EstAllume){ 
            Score++;
            scorejoueur1.setText(""+Score);
            eteindreCellule(1,1);
            celluleGraphique[1][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        } 
    }//GEN-LAST:event_cellule22ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


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
    
    public void AssimilationNom(){
        Player= new Joueur(PlayerName);
        System.out.println(PlayerName);
        nomjoueur.setText(PlayerName);
   }


   



    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Record;
    private javax.swing.JButton cellule00;
    private javax.swing.JButton cellule01;
    private javax.swing.JButton cellule10;
    private javax.swing.JButton cellule22;
    private javax.swing.JPanel grilleJeu_graphique;
    private javax.swing.JPanel infosjoueur;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomjoueur;
    private javax.swing.JPanel panneaumodepartie;
    private javax.swing.JLabel recordnomjoueur1;
    private javax.swing.JLabel scorejoueur1;
    // End of variables declaration//GEN-END:variables
}
