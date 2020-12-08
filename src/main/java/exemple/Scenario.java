/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author Tina
 */

public class Scenario {
   private ArrayList<Effet> listeEffets;
   private Bandeau bandeau;
    
   public static void main (String[] args ){
       Bandeau bandeau = new Bandeau();
       Scenario scenario = new Scenario(bandeau);
       scenario.ajouteEffet(new Rotation(4, bandeau, "Je tourne"));
       scenario.ajouteEffet(new Blink(4, bandeau, "Je clignote"));
       scenario.ajouteEffet(new Colori(4, bandeau, "je change de couleur"));
       scenario.ajouteEffet(new Zoom(4, bandeau, "plus grand"));
       
       
       
       scenario.playEffet();
       
       
}
    public Scenario(Bandeau b){
    this.listeEffets = new ArrayList<>();
    this.bandeau = b;
    }
    
    public void playEffet(){
        for(Effet e : listeEffets){
            e.faireEffet();
            bandeau.sleep(500);
        }
    }
    
    public void ajouteEffet(Effet effet){
        this.listeEffets.add(effet);
    }

}
