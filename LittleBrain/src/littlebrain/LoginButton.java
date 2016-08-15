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
public class LoginButton extends JButton implements ActionListener {
    public LoginButton() {
        this.setActionCommand(UserInterface.LOGIN);
        this.setText(UserInterface.LOGIN);
        this.addActionListener(this);
        this.setToolTipText(UserInterface.LOGINTOOLTIP);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
