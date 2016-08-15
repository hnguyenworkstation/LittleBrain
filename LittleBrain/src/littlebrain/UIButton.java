/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author quang
 */
public class UIButton extends JButton implements ActionListener {
    public UIButton(String command) {
        if (command.equals(UserInterface.REGISTER_UI)) {
            this.setActionCommand(UserInterface.REGISTER_UI);
            this.setToolTipText(UserInterface.REGISTER_UI_TOOLTIP);
            this.setText(UserInterface.REGISTER);
        } else if (command.equals(UserInterface.REGISTER)) {
            this.setActionCommand(UserInterface.REGISTER);
            this.setToolTipText(UserInterface.REGISTER_TOOLTIP);
            this.setText(UserInterface.REGISTER);
        } else if (command.equals(UserInterface.CANCEL)){
            this.setActionCommand(UserInterface.CANCEL);
            this.setToolTipText(UserInterface.CANCEL_TOOLTIP);
            this.setText(UserInterface.CANCEL);
        } else if (command.equals(UserInterface.LOGIN)) {
            this.setText(UserInterface.LOGIN);
            this.addActionListener(this);
            this.setToolTipText(UserInterface.LOGIN_TOOLTIP);
        }
        this.addActionListener(this);
        this.setPreferredSize(new Dimension(120,30));
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        
        if (command.equals(UserInterface.REGISTER_UI)) {
            Point currentLoc = UserInterface.mainBrain.getLocation();
            UserInterface.registerBrain.setLocation(currentLoc);
            UserInterface.mainBrain.dismiss();
            UserInterface.registerBrain.show();
        } else if (command.equals(UserInterface.REGISTER)){
            
        } else if (command.equals(UserInterface.CANCEL)){
            Point currentLoc = UserInterface.registerBrain.getLocation();
            UserInterface.mainBrain.setLocation(currentLoc);
            UserInterface.mainBrain.show();
            UserInterface.registerBrain.dismiss();
        }
    }
}
