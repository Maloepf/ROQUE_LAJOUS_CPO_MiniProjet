
package speed.click;

public class Cellule {
    boolean EstAllume ; //attribut de la classe cellule
    
    
    public Cellule(){  //constructeur de la classe cellule -> initialise l'attribut
        EstAllume = false;
}
    
    
    public void allumer(){ // l'attribut prend la valeur true
        EstAllume = true;
    }
    
    public void eteindre(){ // l'attribut prend la valeur false
        EstAllume = false;
    }
    
    
}
