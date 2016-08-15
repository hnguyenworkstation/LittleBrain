/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlebrain;


/**
 *
 * @author quang
 */
public interface UserInterface {
    
    public static LoginUI mainBrain = new LoginUI();
    public static RegisterUI registerBrain = new RegisterUI();
    
    public static int WINDOW_WIDTH = 350;
    public static int WINDOW_HEIGHT = 600;
    
    public static String LOGIN = "Login";
    public static String REGISTER = "Register";
    public static String REGISTER_UI = "RegisterUI";
    public static String CANCEL = "Cancel";
    public static String CANCEL_TOOLTIP = "Go back!";
    public static String LOGIN_TOOLTIP = "Click to Login!";
    public static String REGISTER_TOOLTIP = "Register an account with us!";
    public static String REGISTER_UI_TOOLTIP = "Transform to Register Form!";
    public static String USERNAME = "";
            
}
