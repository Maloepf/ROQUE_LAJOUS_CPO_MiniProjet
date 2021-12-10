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
    double timer;
    Cellule celluleActive;
    
    public void initialiserPartie(int s,double temps){
        grilleJeu = new Grille(2);
        joueurCourant.score=s;
        timer=temps;
        grilleJeu.allumerCellule(new Random().nextInt(2),new Random().nextInt(2));
    }
    
   public void eteindreGrille(){
       for (int i = 0 ; i<2 ; i++){
           for (int j = 0 ; j<2 ; j++){
               grilleJeu.eteindreCellule(i, j);
           }
       }
   }
   
   
}
