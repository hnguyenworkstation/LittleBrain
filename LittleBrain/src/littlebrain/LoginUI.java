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
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author quang
 */
public class LoginUI {
    
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
    
    public LoginUI() {
        initElements();
        addElementsToMainView();
        mainFrame.pack();
    }
    
    public void show() {
        mainFrame.setVisible(true);
    }
    
    public void dismiss() {
        mainFrame.setVisible(false);
    }
    
    private void initElements() {
        mainFrame = new JFrame("Little Brain");
        mainFrame.setPreferredSize(new Dimension(
                UserInterface.WINDOW_WIDTH,UserInterface.WINDOW_HEIGHT));
        
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
        controlMainView.setLayout(new GridLayout(4,0));
        controlMainView.add(greeting);
        
        // username and password controllers;
        controlUserFields = new JPanel();
        controlUserFields.setLayout(new GridLayout(2,0));
        
        initUsernameField();
        initPasswordField();
        initButtonField();
        
        controlMainView.add(controlUserFields);
        controlMainView.add(controlButton);
        
        // Add Icon
        ImageIcon icon = new ImageIcon("res/mainlogo.jpg");
        iconLabel = new JLabel(icon);
    }
    
    private void initUsernameField() {
        usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();
        
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridLayout(2,0));
        userPanel.add(usernameLabel);
        userPanel.add(usernameField);
        
        controlUserFields.add(userPanel);
    }
    
    private void initPasswordField() {
        passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();
        
        JPanel passField = new JPanel();
        passField.setLayout(new GridLayout(2,0));
        passField.add(passwordLabel);
        passField.add(passwordField);
        controlUserFields.add(passField);
    }
    
    private void initButtonField() {
        controlButton = new JPanel();
        
        loginBtn = new UIButton(UserInterface.LOGIN);
        registerBtn = new UIButton(UserInterface.REGISTER_UI);
        
        controlButton.add(loginBtn);
        controlButton.add(registerBtn);
    }
    
    private void addElementsToMainView() {
        mainFrame.add(controlMainView);
    }
    
    public Point getLocation() {
        return mainFrame.getLocationOnScreen();
    }
    
    public void setLocation(Point p) {
        mainFrame.setLocation(p);
    }
}