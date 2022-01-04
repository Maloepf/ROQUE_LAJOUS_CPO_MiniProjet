/*
    4x4 Classique
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

public class InterfacePartie4x4classique extends JFrame implements ActionListener{

    Cellule [][] CellulesJeu;
    Grille grilleJeu;
    String PlayerName;
    Joueur Player;
    int Score;
    int TempsDeJeu;
    JButton [][] celluleGraphique=new JButton [4][4];
    
    protected JLabel viewTime;  // composant permettant l'affichage du temps ecoule
    protected int timeCount;	// variable permettant de memoriser le temps ecoule
    protected Timer timer;

    public InterfacePartie4x4classique() {
        initComponents();
        
        TempsDeJeu=10; //Initialisation du temps de jeu
        Chrono.setText(""+TempsDeJeu); //Affichage du temps de jeu
        
        Score = 0; //Initialisation du score en début de partit
        scorejoueur.setText(""+Score); //Affichage du Score initiale
        
        grilleJeu= new Grille(2); //Création nouvelle grille
        
        CellulesJeu=new Cellule [4][4]; //Création nouvelles cellules
        for (int l = 0 ; l<4 ; l++){
            for(int c=0 ; c<4 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
        
        
        
        celluleGraphique[0][0]=cellule00; //Création tableau de type JButton contenant toutes les cellules graphiques
        celluleGraphique[0][1]=cellule01;
        celluleGraphique[0][2]=cellule02;
        celluleGraphique[0][3]=cellule03;
        
        celluleGraphique[1][0]=cellule10;
        celluleGraphique[1][1]=cellule11;
        celluleGraphique[1][2]=cellule12;
        celluleGraphique[1][3]=cellule13;
        
        celluleGraphique[2][0]=cellule20;
        celluleGraphique[2][1]=cellule21;
        celluleGraphique[2][2]=cellule22;
        celluleGraphique[2][3]=cellule23;
        
        celluleGraphique[3][0]=cellule30;
        celluleGraphique[3][1]=cellule31;
        celluleGraphique[3][2]=cellule32;
        celluleGraphique[3][3]=cellule33;
        
        allumerCelluleAleat();
        allumerCelluleAleat_graph();
        
        this.timeCount = TempsDeJeu; // Initialisation du timer
	this.viewTime = Chrono; // Affichage du décompte
	this.timer = new Timer (1000, this); //Création timer
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneaumodepartie = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        infosjoueur2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scorejoueur = new javax.swing.JLabel();
        nomjoueur = new javax.swing.JLabel();
        recordnomjoueur4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chronometre2 = new javax.swing.JPanel();
        chronometre1 = new javax.swing.JPanel();
        Chonormètre = new javax.swing.JLabel();
        Chrono = new javax.swing.JLabel();
        PanneauGrille_4x4 = new javax.swing.JPanel();
        cellule00 = new javax.swing.JButton();
        cellule01 = new javax.swing.JButton();
        cellule02 = new javax.swing.JButton();
        cellule03 = new javax.swing.JButton();
        cellule10 = new javax.swing.JButton();
        cellule11 = new javax.swing.JButton();
        cellule12 = new javax.swing.JButton();
        cellule13 = new javax.swing.JButton();
        cellule20 = new javax.swing.JButton();
        cellule21 = new javax.swing.JButton();
        cellule22 = new javax.swing.JButton();
        cellule23 = new javax.swing.JButton();
        cellule30 = new javax.swing.JButton();
        cellule31 = new javax.swing.JButton();
        cellule32 = new javax.swing.JButton();
        cellule33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneaumodepartie.setBackground(new java.awt.Color(255, 153, 255));
        panneaumodepartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("Bienvenue dans la Partie 4x4 classique !");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panneaumodepartie.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 307, 48));

        getContentPane().add(panneaumodepartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 123, 380, -1));

        infosjoueur2.setBackground(new java.awt.Color(255, 255, 204));
        infosjoueur2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Infos Joueurs : ");
        infosjoueur2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        scorejoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        scorejoueur.setText("scorejoueur4");
        infosjoueur2.add(scorejoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 20));

        nomjoueur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomjoueur.setText("nomjoueur4");
        infosjoueur2.add(nomjoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 20));

        recordnomjoueur4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        recordnomjoueur4.setText("reccordnomjoueur4");
        infosjoueur2.add(recordnomjoueur4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Score : ");
        infosjoueur2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        infosjoueur2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nom : ");
        infosjoueur2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Reccord : ");
        infosjoueur2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 20));

        getContentPane().add(infosjoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 436, 310, 250));

        chronometre2.setBackground(new java.awt.Color(255, 255, 204));
        chronometre2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chronometre1.setBackground(new java.awt.Color(255, 255, 204));
        chronometre1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chronometre2.add(chronometre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 310, 130));

        Chonormètre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Chonormètre.setText("Chronomètre : ");
        chronometre2.add(Chonormètre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        Chrono.setText("jLabel3");
        chronometre2.add(Chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        getContentPane().add(chronometre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 242, 310, 130));

        PanneauGrille_4x4.setBackground(new java.awt.Color(204, 255, 255));
        PanneauGrille_4x4.setLayout(new java.awt.GridLayout(4, 4));

        cellule00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule00ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule00);

        cellule01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule01ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule01);

        cellule02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule02ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule02);

        cellule03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule03ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule03);

        cellule10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule10ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule10);

        cellule11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule11ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule11);

        cellule12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule12ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule12);

        cellule13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule13ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule13);

        cellule20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule20ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule20);

        cellule21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule21ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule21);

        cellule22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule22ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule22);

        cellule23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule23ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule23);

        cellule30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule30ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule30);

        cellule31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule31ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule31);

        cellule32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule32ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule32);

        cellule33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellule33ActionPerformed(evt);
            }
        });
        PanneauGrille_4x4.add(cellule33);

        getContentPane().add(PanneauGrille_4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cellule00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule00ActionPerformed
  if (CellulesJeu[0][0].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(0,0);
            celluleGraphique[0][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
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
            startDTimer ();
        }
    }//GEN-LAST:event_cellule01ActionPerformed

    private void cellule02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule02ActionPerformed
  if (CellulesJeu[0][2].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(0,2);
            celluleGraphique[0][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule02ActionPerformed

    private void cellule03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule03ActionPerformed
  if (CellulesJeu[0][3].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(0,3);
            celluleGraphique[0][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule03ActionPerformed

    private void cellule10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule10ActionPerformed
  if (CellulesJeu[1][0].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(1,0);
            celluleGraphique[1][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
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
            startDTimer ();
        }
    }//GEN-LAST:event_cellule11ActionPerformed

    private void cellule12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule12ActionPerformed
  if (CellulesJeu[1][2].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(1,2);
            celluleGraphique[1][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule12ActionPerformed

    private void cellule13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule13ActionPerformed
  if (CellulesJeu[1][3].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(1,3);
            celluleGraphique[1][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule13ActionPerformed

    private void cellule20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule20ActionPerformed
  if (CellulesJeu[2][0].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(2,0);
            celluleGraphique[2][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule20ActionPerformed

    private void cellule21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule21ActionPerformed
  if (CellulesJeu[2][1].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(2,1);
            celluleGraphique[2][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule21ActionPerformed

    private void cellule22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule22ActionPerformed
  if (CellulesJeu[2][2].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(2,2);
            celluleGraphique[2][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule22ActionPerformed

    private void cellule23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule23ActionPerformed
  if (CellulesJeu[2][3].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(2,3);
            celluleGraphique[2][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule23ActionPerformed

    private void cellule30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule30ActionPerformed
  if (CellulesJeu[3][0].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(3,0);
            celluleGraphique[3][0].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule30ActionPerformed

    private void cellule31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule31ActionPerformed
  if (CellulesJeu[3][1].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(3,1);
            celluleGraphique[3][1].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule31ActionPerformed

    private void cellule32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule32ActionPerformed
  if (CellulesJeu[3][2].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(3,2);
            celluleGraphique[3][2].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule32ActionPerformed

    private void cellule33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellule33ActionPerformed
  if (CellulesJeu[3][3].EstAllume){
            Score++;
            scorejoueur.setText(""+Score);
            eteindreCellule(3,3);
            celluleGraphique[3][3].setBackground(Color.lightGray);
            allumerCelluleAleat();
            allumerCelluleAleat_graph();
            startDTimer ();
        }
    }//GEN-LAST:event_cellule33ActionPerformed


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
            java.util.logging.Logger.getLogger(InterfacePartie4x4classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie4x4classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie4x4classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePartie4x4classique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePartie4x4classique().setVisible(true);
            }
        });
    }
    
    public void allumerCelluleAleat() {
        allumerCellule(new Random().nextInt(4),new Random().nextInt(4)); 
    }
    
    public void allumerCelluleAleat_graph(){
        for (int l =0; l<4; l++){
            for (int c = 0; c<4; c++){
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
	
	// lance le compteur de temps 
	public void startDTimer ()
	{	this.timer.start ();
	}
	
	// stop le compteur de temps 
	public void stopDTimer ()
	{	this.timer.stop ();
	}
	
	// permet de recuperer le temps deja ecoule
	public int getTime ()
	{	return ( this.timeCount );
	}
	
	// permet de connaitre l'etat d'activite du timer (lance ou non)
	public boolean isRunning ()
	{	return ( this.timer.isRunning () );
	}
	
	/****
	    * Methode de l'interface ActionListener : 
	    *        necessaire pour l'object javax.swing.Timer
	    *        methode appelle a intervalle de temps regulier par le timer
	    *        (utilise egalement par le bouton pour stopper et lancer le timer
	    *         la difference ce fait via l'instruction getActionCommand)
	    *
	    ****/
	public void actionPerformed (ActionEvent e)
	{	// Cas d'un evenement genere par le bouton
		if ( "Bouton".equals (e.getActionCommand ()) )
		{	// le timer est en court d'execution donc on l'arrete
			if ( this.isRunning () )
			{	this.stopDTimer ();
			}
			else // le timer est arrete donc on le lance ou relance
			{	this.startDTimer ();
			}
		}
                else // Cas d'un evenement genere par le composant javax.swing.Timer
		{	this.timeCount--;
			this.viewTime.setText (""+this.timeCount);
		}
                if (this.timeCount==0){
                    this.stopDTimer ();
                    for (int l =0; l<4; l++){
                        for (int c = 0; c<4; c++){
                            celluleGraphique[c][l].setVisible(false);
                        }
                    }
                }
                
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chonormètre;
    private javax.swing.JLabel Chrono;
    private javax.swing.JPanel PanneauGrille_4x4;
    private javax.swing.JButton cellule00;
    private javax.swing.JButton cellule01;
    private javax.swing.JButton cellule02;
    private javax.swing.JButton cellule03;
    private javax.swing.JButton cellule10;
    private javax.swing.JButton cellule11;
    private javax.swing.JButton cellule12;
    private javax.swing.JButton cellule13;
    private javax.swing.JButton cellule20;
    private javax.swing.JButton cellule21;
    private javax.swing.JButton cellule22;
    private javax.swing.JButton cellule23;
    private javax.swing.JButton cellule30;
    private javax.swing.JButton cellule31;
    private javax.swing.JButton cellule32;
    private javax.swing.JButton cellule33;
    private javax.swing.JPanel chronometre1;
    private javax.swing.JPanel chronometre2;
    private javax.swing.JPanel infosjoueur2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nomjoueur;
    private javax.swing.JPanel panneaumodepartie;
    private javax.swing.JLabel recordnomjoueur4;
    private javax.swing.JLabel scorejoueur;
    // End of variables declaration//GEN-END:variables
}
