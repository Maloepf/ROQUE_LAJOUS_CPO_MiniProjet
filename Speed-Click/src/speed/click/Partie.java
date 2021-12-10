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

    
    
    public Partie(Joueur j){
        joueurCourant=j;
    }
   
    
    public void initialiserPartie(int s,double temps){
        grilleJeu = new Grille(2);
        joueurCourant.score=s;
        timer=temps;
        eteindreGrille();
        allumerCelluleAleat();
    }
    
   public void eteindreGrille(){
       for (int i = 0 ; i<2 ; i++){
           for (int j = 0 ; j<2 ; j++){
               grilleJeu.eteindreCellule(i, j);
           }
       }
   }
   
   public void allumerCelluleAleat() {
    grilleJeu.allumerCellule(new Random().nextInt(2),new Random().nextInt(2));
}

   
   
}
