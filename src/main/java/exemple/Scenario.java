/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author Tina
 */
public class Scenario {
    public static void main(String[] arg){
        new Scenario().scenario1();
    }
    public void scenario1(){
        Bandeau bandeau1 = new Bandeau();
        bandeau1.setMessage("zoom...");
            for (int i = 5; i<60; i++){
                bandeau1.setFont(new Font("Try", Font.BOLD, 5+i));
            }
        bandeau1.sleep(1000);
        bandeau1.close();
    }   
}
