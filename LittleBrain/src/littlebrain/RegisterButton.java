/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author quang
 */
public class RegisterButton extends JButton implements ActionListener {
    public RegisterButton() {
        this.setActionCommand(UserInterface.REGISTER);
        this.setToolTipText(UserInterface.REGISTERTOOLTIP);
        this.setText(UserInterface.REGISTER);
        this.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
