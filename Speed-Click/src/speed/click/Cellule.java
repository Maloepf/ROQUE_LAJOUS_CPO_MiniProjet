/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speed.click;

/**
 *
 * @author daphn
 */
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
