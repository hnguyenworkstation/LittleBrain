/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import javax.swing.SwingUtilities;

/**
 *
 * @author quang
 */
public class LittleBrain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                UserInterface.mainBrain.show();
            }
        });
    }
    
}
