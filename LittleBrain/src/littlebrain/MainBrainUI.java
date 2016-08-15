/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author quang
 */
public class MainBrainUI {
    
    private JFrame mainFrame;
    
    private JLabel greeting;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel iconLabel;
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    private JButton loginBtn;
    private JButton registerBtn;
    
    private JPanel controlMainView;
    private JPanel controlUserFields;
    private JPanel controlButton;
    
    public MainBrainUI() {
        initElements();
        addElementsToMainView();
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
    private void initElements() {
        mainFrame = new JFrame("Little Brain");
        mainFrame.setPreferredSize(new Dimension(400,600));
        mainFrame.setLayout(new GridLayout(5,0));
        
        // adding labels
        greeting = new JLabel("Little Brain", JLabel.CENTER);
        greeting.setSize(350,100);
        
        mainFrame.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        controlMainView = new JPanel();
        controlMainView.setLayout(new BoxLayout(controlMainView, BoxLayout.Y_AXIS));

        initUsernameField();
        initPasswordField();
        initButtonField();
    }
    
    private void initUsernameField() {                
        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(20);
        
        JPanel userPanel = new JPanel();
        userPanel.add(usernameLabel);
        userPanel.add(usernameField);
        
        controlMainView.add(userPanel);
    }
    
    private void initPasswordField() {
        
        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        
        JPanel passField = new JPanel();
        passField.add(passwordLabel);
        passField.add(passwordField);
        
        controlMainView.add(passField);
    }
    
    private void initButtonField() {
        controlButton = new JPanel();
        controlButton.setLayout(new FlowLayout());
        
        loginBtn = new LoginButton();
        loginBtn.setPreferredSize(new Dimension(120,30));
        registerBtn = new RegisterButton();
        registerBtn.setPreferredSize(new Dimension(120,30));
        
        controlButton.add(loginBtn);
        controlButton.add(registerBtn);
        controlMainView.add(controlButton);
    }
    
    private void addElementsToMainView() {
        mainFrame.add(greeting);
        mainFrame.add(controlMainView);
    }
}
