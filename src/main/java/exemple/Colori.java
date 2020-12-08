
package exemple;
import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author Tina
 */
public class Colori extends Effet{
    public Colori (int nbrRepetition, Bandeau bandeau, String message){
        super(nbrRepetition, bandeau, message);
    }

    @Override
    public void faireEffet() {
        bandeau.setMessage(this.message);
        bandeau.sleep(500);
        bandeau.setBackground(Color.DARK_GRAY);
        bandeau.sleep(500);
        bandeau.setBackground(Color.PINK);
        bandeau.sleep(500);
        
    }
   
    
}
