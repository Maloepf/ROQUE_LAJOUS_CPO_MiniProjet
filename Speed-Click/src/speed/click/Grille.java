/*
    Classe Grille
    Mini-Projet : Speed-Click
    ROQUE Daphné & LAJOUS Malô
    Décembre 2021
*/
package speed.click;


public class Grille {
    Cellule [][] CellulesJeu;
    
    public void Grille(int t){
        CellulesJeu=new Cellule[t][t];
        for (int l = 0 ; l<t ; l++){
            for(int c=0 ; c<t ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
    }
    
    public void allumerCellule (int x, int y){
        CellulesJeu[x][y].allumer();
    }
    
    public void eteindreCellule (int x, int y){
        CellulesJeu[x][y].eteindre();
    }
}
