/*
    2x2 Infini
    Mini-Projet : Speed-Click
    ROQUE Daphné & LAJOUS Malô
    Décembre 2021
*/
package speed.click;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;

public class InterfacePartie2x2Infinie extends JFrame{

    Cellule [][] CellulesJeu;
    Grille grilleJeu;
    String PlayerName;
    Joueur Player;
    int Score; //attributs de la classe

    JButton [][] celluleGraphique=new JButton [2][2]; //creation des boutons sous forme de tableau celluleGraphique

    public InterfacePartie2x2Infinie() {
        initComponents();
        
        Score = 0; //Initialisation du score en début de partit
        scorejoueur.setText(""+Score); //Affichage du Score initiale
        
        grilleJeu= new Grille(2); //Création nouvelle grille
        
        CellulesJeu=new Cellule [2][2]; //Création nouvelles cellules (4 en tout)
        for (int l = 0 ; l<2 ; l++){
            for(int c=0 ; c<2 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
        celluleGraphique[0][0]=cellule00; //Création tableau de type JButton contenant toutes les cellules graphiques
        celluleGraphique[0][1]=cellule01;
        celluleGraphique[1][0]=cellule10;
        celluleGraphique[1][1]=cellule11;
        
        allumerCelluleAleat();
        allumerCelluleAleat_graph();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infosjoueur2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorejoueur = new javax.swing.JLabel();
        nomjoueur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panneaumodepartie = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        grilleJeu_graphique = new javax.swing.JPanel();
        cellule00 = new javax.swing.JButton();
        cellule01 = new javax.swing.JButton();
        cellule10 = new javax.swing.JButton();
        cellule11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infosjoueur2.setBackground(new java.awt.Color(255, 255, 204));
        infosjoueur2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Infos Joueurs : ");
        infosjoueur2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        scorejoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scorejoueur.setText("scorejoueur2");
        infosjoueur2.add(scorejoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        nomjoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomjoueur.setText("nomjoueur2");
        infosjoueur2.add(nomjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Score : ");
        infosjoueur2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        infosjoueur2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nom : ");
        infosjoueur2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        getContentPane().add(infosjoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 310, 250));

        panneaumodepartie.setBackground(new java.awt.Color(255, 153, 255));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("Bienvenue dans la Partie 2x2  Infini !");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneaumodepartieLayout = new javax.swing.GroupLayout(panneaumodepartie);
        panneaumodepartie.setLayout(panneaumodepartieLayout);
        panneaumodepartieLayout.setHorizontalGroup(
            panneaumodepartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneaumodepartieLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panneaumodepartieLayout.setVerticalGroup(
            panneaumodepartieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneaumodepartieLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(panneaumodepartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 380, -1));

        grilleJeu_graphique.setBackground(new java.awt.Color(204, 255, 255));
        grilleJeu_graphique.setPreferredSize(new java.awt.Dimension(520, 520));
        grilleJeu_graphique.setLayout(new java.awt.GridLayout(2, 2));

        cellule00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule00ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule00);

        cellule01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule01ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule01);

        cellule10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule10);

        cellule11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11ActionPerformed(evt);
            }
        });
        grilleJeu_graphique.add(cellule11);

        getContentPane().add(grilleJeu_graphique, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cellule00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule00ActionPerformed
        if (CellulesJeu[0][0].EstAllume){ //vérification si la cellule es allumée
            Score++; //incrémentation du score -> mise a jour du score
            scorejoueur.setText(""+Score);//affichage des scores sur l'interface
            eteindreCellule(0,0); //on eteint ensuite la cellule avec la methode eteindre cellule
            celluleGraphique[0][0].setBackground(Color.lightGray); //redonne à la cellule étainte la couleur initiale
            allumerCelluleAleat(); //on allume une cellule aletoirment pour continuer le jeu
            allumerCelluleAleat_graph(); //permet de donner une couleur à la cellule allumee aleatoirement
        }
    }//GEN-LAST:event_cellule00ActionPerformed

    private void cellule01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule01ActionPerformed
        if (CellulesJeu[0][1].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(0,1);
            celluleGraphique[0][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }
    }//GEN-LAST:event_cellule01ActionPerformed

    private void cellule10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10ActionPerformed
        if (CellulesJeu[1][0].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(1,0);
            celluleGraphique[1][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }
    }//GEN-LAST:event_cellule10ActionPerformed

    private void cellule11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule11ActionPerformed
        if (CellulesJeu[1][1].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(1,1);
            celluleGraphique[1][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
        }
    }//GEN-LAST:event_cellule11ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfacePartie2x2classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie2x2classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie2x2classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie2x2classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePartie2x2classique().setVisible(true);
            }
        });
    }
    
    
    public void allumerCelluleAleat() {
        allumerCellule(new Random().nextInt(2),new Random().nextInt(2)); 
    }
    
    
    public void allumerCelluleAleat_graph(){
        for (int l =0; l<2; l++){
            for (int c = 0; c<2; c++){ //parcours du tableau de cellule et une cellule est allumee
                if (CellulesJeu[c][l].EstAllume){ 
                    celluleGraphique[c][l].setBackground(Color.RED); //donne la couleur rouge à la cellule allumée
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
    
    public void AssimilationNom(){ //permet d'afficher le nom et le score du joueur sur l'interface
        Player= new Joueur(PlayerName);
        System.out.println(PlayerName);
        nomjoueur.setText(PlayerName);
   }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cellule00;
    private javax.swing.JButton cellule01;
    private javax.swing.JButton cellule10;
    private javax.swing.JButton cellule11;
    private javax.swing.JPanel grilleJeu_graphique;
    private javax.swing.JPanel infosjoueur2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomjoueur;
    private javax.swing.JPanel panneaumodepartie;
    private javax.swing.JLabel scorejoueur;
    // End of variables declaration//GEN-END:variables
}

