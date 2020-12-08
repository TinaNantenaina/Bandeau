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
public class Rotation extends Effet{
    
    public Rotation (int nbrRepetition, Bandeau bandeau, String message){
        super(nbrRepetition, bandeau, message);
    }

    @Override
    public void faireEffet() {
         bandeau.setMessage(this.message);
         for (int r = 0; r < this.nombreRepetition; r++){
             for (int i = 0; i<=100; i++)
             {
                 bandeau.setRotation(4*Math.PI*i /100);
                 bandeau.sleep(50);
             }
         }
    }
    
}
