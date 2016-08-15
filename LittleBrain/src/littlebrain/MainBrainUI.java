/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        // username and password controllers;
        controlUserFields = new JPanel();
        controlUserFields.setLayout(new BoxLayout(controlUserFields, BoxLayout.Y_AXIS));
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        
        initUsernameField();
        initPasswordField();
        initButtonField();
        
        controlMainView.add(controlUserFields);
        controlMainView.add(controlButton);
        controlMainView.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        
        // Add Icon
        ImageIcon icon = new ImageIcon("res/mainlogo.jpg");
        iconLabel = new JLabel(icon);
    }
    
    private void initUsernameField() {
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridLayout(1,2));
        userPanel.add(usernameLabel);
        userPanel.add(usernameField);
        
        controlUserFields.add(userPanel);
    }
    
    private void initPasswordField() {
        JPanel passField = new JPanel();
        passField.setLayout(new GridLayout(1,2));
        passField.add(passwordLabel);
        passField.add(passwordField);
        controlUserFields.add(passField);
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
    }
    
    private void addElementsToMainView() {
        mainFrame.add(greeting);
        mainFrame.add(iconLabel);
        mainFrame.add(controlMainView);
    }
}
