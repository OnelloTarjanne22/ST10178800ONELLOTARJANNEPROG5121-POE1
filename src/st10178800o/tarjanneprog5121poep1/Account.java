
package st10178800o.tarjanneprog5121poep1;

import javax.swing.*;

/**
 *
 * @author Onello TARJANNE ST10178800 GRP4
 */
public class Account {

    String userName;
    String passWord;
    String firstName;
    String LastName;

    public Account() {

    }
    

    public Account(String userName, String passWord, String firstName, String Name) {
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.LastName = Name;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String ReguserName) {
        this.userName = ReguserName;
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        String msg = String.format("""
                                  Login Details
                                  -------------------------------------
                                   Username: %S
                                  Password:%S
                                  First Name:%S
                                  Last Name:%S""", userName, passWord, firstName, LastName + "\n-------------------------------------\n ");
        return msg;
    }

}
