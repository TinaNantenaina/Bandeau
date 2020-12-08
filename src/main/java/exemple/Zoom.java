
package exemple;
import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author Tina
 */
public class Zoom extends Effet{
    public Zoom (int nbrRepetition, Bandeau bandeau, String message){
        super(nbrRepetition, bandeau, message);
    }

    @Override
    public void faireEffet() {
       bandeau.setMessage(this.message);
       for (int r = 0; r<this.nombreRepetition; r++){
           for (int i=3; i<60; i+=3){
               bandeau.setFont(new Font("blabla", Font.BOLD, 3+i));
               bandeau.sleep(100);
           }
       }
    }
    
    
}
