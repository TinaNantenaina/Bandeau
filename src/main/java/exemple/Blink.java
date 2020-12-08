/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author Tina
 */
public class Blink extends Effet{
    public Blink (int nbrRepetition, Bandeau bandeau, String message){
            super(nbrRepetition, bandeau, message);
}
    @Override
    public void faireEffet(){
        bandeau.setMessage(this.message);
        for(int r = 0; r<this.nombreRepetition; r++){
            for(int i = 0; i<=10; i++){
                bandeau.setForeground(bandeau.getBackground());
                bandeau.sleep(200);
                bandeau.setForeground(Color.BLACK);
                bandeau.sleep(200);
            }
        }
    }
}

