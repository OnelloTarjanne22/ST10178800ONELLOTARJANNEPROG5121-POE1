
package st10178800o.tarjanneprog5121poep1;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Onello TARJANNE ST10178800 GRP4
 */
public class Login {

    String LogUsername;
    String LogPassword;
//CHECKS USERNAME
     public static boolean checkUsername(String userName) {
        boolean valid = true;

        int underscoreCount = 0;
        for (int i = 0; i < userName.length(); i++) {
            if (userName.charAt(i) == '_') {
                underscoreCount++;
            }
        }

        if (underscoreCount != 1 || userName.length() > 5) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        if (valid) {
            JOptionPane.showMessageDialog(null, "Username Successfully Captured");
        }

        return valid;
    }//CHECKS PASSWORD VALIDITY
         public static boolean checkPasswordComplexity(String passWord) {
        boolean valid = true;

        if (passWord.length() < 8) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Password must have a minimum of 8 characters ", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!passWord.matches(".*[!@#$%^&+=].*")) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Password must have at least one special character ", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!passWord.matches(".*\\d.*")) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Passwords must have at least one digit ", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else if (!passWord.matches(".*[A-Z].*")) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Passwords must have at least one capital letter ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        if (valid) {
            JOptionPane.showMessageDialog(null, "Password Successfully Captured");
        }

        return valid;
    }
         //CHECKS IF PASSWORD AND USERNAME ARE VALID
    public static boolean loginUser(String LogUsername, String LogPassword, ArrayList<String> Uname, ArrayList<String> passWo) {
        boolean valid = false;

//Searches arraylist for username and password
        for (int i = 0; i < Uname.size(); i++) {
            if (!LogUsername.equals(Uname.get(i))&&!LogPassword.equals(passWo.get(i))) {
                valid = true;
            }else{JOptionPane.showMessageDialog(null, "Details Invalid ");}
           
        }
        // shown when both Username and password are found
        return valid;

    }
    

    //Constructor
    public Login(String LogUsername, String LogPassword) {
        this.LogUsername = LogUsername;
        this.LogPassword= LogPassword;

    }

    public Login(String LogUsername) {
        this.LogUsername = LogUsername;
    }

    public String getUserName() {
        return LogUsername;
    }

    public void setUserName(String LogUsername) {
        this.LogUsername = LogUsername;
    }

    public String getPassWord() {
        return LogPassword;
    }

    public void setPassWord(String LogpassWord) {
        this.LogPassword = LogpassWord;
    }
    

    
    public String registerUser() {
        String statmsg = "Login Successful";
        return statmsg;
    }
//Welcome message shown when login is succesful

    @Override
    public String toString() {
        String logmsg = String.format("""
                                      Login Successful
                                  Welcome Back %S!!!!
                                  """, LogUsername + " ");
        return logmsg;
    }

}
