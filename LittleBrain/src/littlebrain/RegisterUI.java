/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author quang
 */
public class RegisterUI {
    
    private JFrame regFrame;
    
    private JPanel regPanel;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    
    private JLabel regLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel repassLabel;
    
    private JTextField userField;
    private JPasswordField passField;
    private JPasswordField repassField;
    
    private JButton registerBtn;
    private JButton cancelBtn;
    
    public RegisterUI() {
        initRegView();
    }
    
    public void show() {
        regFrame.setVisible(true);
    }
    
    public void dismiss() {
        regFrame.setVisible(false);
    }
    
    private void initRegView() {
        regFrame = new JFrame(UserInterface.REGISTER);
        regFrame.setPreferredSize(new Dimension(
                UserInterface.WINDOW_WIDTH, UserInterface.WINDOW_HEIGHT));
        regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        regPanel = new JPanel(new GridLayout(3,0));
        
        addTitle();
        addInputFields();
        initButtons();
                
        regFrame.add(regPanel);
        regFrame.pack();
    }
    
    private void addTitle() {
        regLabel = new JLabel();
        regLabel.setText(UserInterface.REGISTER);
        regLabel.setForeground(Color.red);
        
        regFrame.add(regLabel);
    }
    
    private void addInputFields() {
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        repassLabel = new JLabel("Re-Enter: ");
        
        userField = new JTextField(20);
        passField = new JPasswordField(20);
        repassField = new JPasswordField(20);
        
        inputPanel = new JPanel(new GridLayout(3,0));
        
        JPanel userP = new JPanel(new GridLayout(2,0));
        userP.add(usernameLabel);
        userP.add(userField);
        
        JPanel passP = new JPanel(new GridLayout(2,0));
        passP.add(passwordLabel);
        passP.add(passField);
        
        JPanel repassP = new JPanel(new GridLayout(2,0));
        repassP.add(repassLabel);
        repassP.add(repassField);
        
        inputPanel.add(userP);
        inputPanel.add(passP);
        inputPanel.add(repassP);
        regPanel.add(inputPanel);
    }
    
    private void initButtons() {
        buttonPanel = new JPanel();
        registerBtn = new UIButton(UserInterface.REGISTER);
        cancelBtn = new UIButton(UserInterface.CANCEL);
        buttonPanel.add(registerBtn);
        buttonPanel.add(cancelBtn);
        
        regPanel.add(buttonPanel);
    }
    
    public void setLocation(Point location) {
        regFrame.setLocation(location);
    }
    
    public Point getLocation() {
        return regFrame.getLocation();
    }
}
