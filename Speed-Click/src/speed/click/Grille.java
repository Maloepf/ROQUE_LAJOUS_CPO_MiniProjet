/*
    Classe Grille
    Mini-Projet : Speed-Click
    ROQUE Daphné & LAJOUS Malô
    Décembre 2021
*/
package speed.click;


public class Grille {
    Cellule [][] CellulesJeu; //attribut de grille -> tableau de cellules
    
    
    public Grille(int t){ //constructeur de la classe grille -> creation de ma cellule
        CellulesJeu=new Cellule [t][t];
        for (int l = 0 ; l<t ; l++){
            for(int c=0 ; c<t ; c++){ //creation de la grille (il n'y a pas de valeurs pour pouvoir adapter en fonction de la taille de la grille
                                      //que l'on souhaite
                CellulesJeu[l][c]= new Cellule();
            }
        }
    }




    
    public void allumerCellule (int x, int y){
        CellulesJeu[x][y].allumer(); // grâce à la méthode allumer, on allume une cellule de coordonées x,y
    }
    
    public void eteindreCellule (int x, int y){
        CellulesJeu[x][y].eteindre(); //grâce à la méthode éteindre, on éteint une cellule de coordées x, y
    }
}
