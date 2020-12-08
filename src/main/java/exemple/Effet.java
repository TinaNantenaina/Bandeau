/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;

/**
 *
 * @author Tina
 */
public abstract class Effet {
    
    public int nombreRepetition;
    public String message;
    Bandeau bandeau;
    
    public Effet(int nbrRepetition, Bandeau bandeau, String message){
       this.nombreRepetition = nbrRepetition;
       this.message = message;
       this.bandeau = bandeau;
    }
    
    public abstract void faireEffet();
}
