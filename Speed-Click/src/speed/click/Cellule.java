
package speed.click;

public class Cellule {
    boolean EstAllume ; 
    
    
    public Cellule(){
        EstAllume = false;
}
    
    
    public void allumer(){
        EstAllume = true;
    }
    
    public void eteindre(){
        EstAllume = false;
    }
    
    
}
