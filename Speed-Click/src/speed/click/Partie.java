/*
    Classe Partie
    Mini-Projet : Speed-Click
    ROQUE Daphné & LAJOUS Malô
    Décembre 2021
*/
package speed.click;

import java.util.Random;


public class Partie {
    
    Grille grilleJeu;
    Joueur joueurCourant;
    double timer; //attributs de la classe partie

    
    
    public Partie(Joueur j){ //constructeur de partie qui  désigne le joueur courant 
        joueurCourant=j;
    }
   
    
    public void initialiserPartie(int s,double temps){
        grilleJeu = new Grille(2); //creation de la grille
        joueurCourant.score=s; //initialisation du score
        timer=temps; //initialisation timer
        eteindreGrille(); //avant de commencer la partie -> on eteint toutes les cellules
        allumerCelluleAleat(); //avant de commencer la partie -> on allume une cellule aleatoirement
    }
    
   public void eteindreGrille(){
       for (int i = 0 ; i<2 ; i++){
           for (int j = 0 ; j<2 ; j++){ //parcours le tableau pour éteindre toutes les cellules du tableau
               grilleJeu.eteindreCellule(i, j); //appel de la méthode eteindreCellule
           }
       }
   }
   
   public void allumerCelluleAleat() {
    grilleJeu.allumerCellule(new Random().nextInt(2),new Random().nextInt(2));
      //création de l'aleatoire avec la fonction Random
      // appel de la methode allumerCellule
}

   
   
}
