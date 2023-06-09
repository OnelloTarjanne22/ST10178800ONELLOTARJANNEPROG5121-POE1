
package st10178800o.tarjanneprog5121poep1;

/**
 *
 * @author Onello TARJANNE ST10178800 GRP4 -
 * ALL THE WORK PROVIDED HAS BEEN CODED
 * BY MYSELF AND ALL THE SOURCES HAVE BEEN REFERENCED IN THE REFERENCED
 */
import java.util.ArrayList;
import javax.swing.*;
import static st10178800o.tarjanneprog5121poep1.Login.checkPasswordComplexity;
import static st10178800o.tarjanneprog5121poep1.Login.checkUsername;
import static st10178800o.tarjanneprog5121poep1.Tasks.checktaskDesc;

public class Runlogin {

    public static void main(String[] args) {
        boolean continueProgram = true;
        boolean loggedIn = false;
        int attempts = 0;
               int returntotalHours = 0;
              int taskNum = 0;
              
         String NUMmenu = """
                          Select an option:
                          1. Add Tasks
                          2. Show Report
                          3. QUIT""";

        boolean exit = false;
 
        String userName;
        String passWord;
        String firstName;
        String lastName;
        String LogUsername;
        String LogPassword;
        String taskDesc;
        String taskName ;
        String devName;
        String  taskHours;
        String taskStatus = null;
        String taskID;
        
         
//              int returnTotalhrs=0;
      
//        /////////AL1
        ArrayList<String> Uname = new ArrayList<>();
        Uname.add("TOM_T");
        Uname.add("MARK_");
        Uname.add("NELO_");
/////////////////////////////////////////AL2
        ArrayList<String> passWo = new ArrayList<>();
        passWo.add("R3@LTOUGHMAN");
        passWo.add("MOTHCHAS#R321");
        passWo.add("UNIV3RSES@L");
        //Now comes the user input EG PASSWO.ADD.(USER)

    

        //Register User
        JOptionPane.showMessageDialog(null, "Welcome to My HomePage");
        while (continueProgram) {
            //////MENU
            String[] options = {"Register", "Login", "Cancel"};
            int selection = JOptionPane.showOptionDialog(null, "Select option:", "Message",
                    0, 3, null, options, options[0]);

            switch (selection) {
                //REGISTER
                case 0 -> {
                    userName = JOptionPane.showInputDialog("Please enter A username");
                    Uname.add(userName); ////ADD USERNAME TO AL1
                    if (!checkUsername(userName)) {
                        continue;

                    }
                    passWord = JOptionPane.showInputDialog(null, "Please enter your password");
                    passWo.add(passWord);////ADD USERNAME TO AL2
                    if (!checkPasswordComplexity(passWord)) {

                        continue;
                    }
                    firstName = JOptionPane.showInputDialog(null, "Please enter your First Name");
                    lastName = JOptionPane.showInputDialog(null, "Please enter your Last Name");
                    Account regmes = new Account(userName, passWord, firstName, lastName);
                    JOptionPane.showMessageDialog(null, regmes);
                    continueProgram = true;
                }

                case 1 -> {
                    //////////LOGIN
                    while (!loggedIn && attempts < 3) {

                        LogUsername = JOptionPane.showInputDialog("Please enter your username");
                        if (!Uname.contains(LogUsername)) {
                            JOptionPane.showMessageDialog(null, "Username is invalid ", "ERROR", JOptionPane.WARNING_MESSAGE);

                            continue;

                        } else {
                            JOptionPane.showMessageDialog(null, "User is valid ");

                        }

                        LogPassword = JOptionPane.showInputDialog(null, "Please enter your password");
                        if (!passWo.contains(LogPassword)) {
                            JOptionPane.showMessageDialog(null, "Password is invalid ", "ERROR", JOptionPane.WARNING_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "Password is valid ");

                        }
                        if (Uname.contains(LogUsername) && passWo.contains(LogPassword)) {
                            loggedIn = true;
                            Login logmsg = new Login(LogUsername);
                            JOptionPane.showMessageDialog(null, logmsg);
                        } else {
                            attempts++;
                            int remainingAttempts = 3 - attempts;
                            JOptionPane.showMessageDialog(null, "Invalid login credentials. You have " + remainingAttempts + " attempt(s) remaining.");
                        }
                    }
                    if (!loggedIn) {
                        JOptionPane.showMessageDialog(null, "Login failed.Closing program");
                        continueProgram = false;
                      
                    }
                     JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                    //MENU 2
                     while (!exit) {
            String input = JOptionPane.showInputDialog(null, NUMmenu);
            
            if (input == null) {
               
                exit = true;
            } else {
                try {
                    int choice = Integer.parseInt(input);
                    switch (choice) {
                        case 1 -> {
                         Tasks[] taskList = new Tasks[4];
        taskList[0] = new Tasks("MY NICE TASK", "TASK TO COMPLIMENT ", "George Howard", 3,"DOING","MY:1:ARD",1);
        taskList[1] = new Tasks("CHARACTER CHECKING", "CHECKS CHARACTERS", "Luke Hall", 23,"TO DO"," CH:2:ALL",2);
        taskList[2] = new Tasks("LOG USER FEATURE", "ADDS A LOGIN FEATURE", "Ambah Singh", 30,"DONE","LO:3:NGH",3);
         taskName = JOptionPane.showInputDialog("Please enter your task name");
      taskHours = JOptionPane.showInputDialog("Please enter the hours spent on the task");
        int numberHrs = Integer.parseInt(taskHours);
         devName = JOptionPane.showInputDialog("Please enter the developer's first and last name");
        taskDesc = JOptionPane.showInputDialog("Please enter a task description");
        String[] stat = {"To-do", "Done", "Doing"};
        
         if (!checktaskDesc(taskDesc)) {
            continue;
        } 
             String select = (String) JOptionPane.showInputDialog(null, "Choose now...",
        "The Choice of a Status", JOptionPane.QUESTION_MESSAGE, null, stat, 
        stat[0]);
   taskStatus =select;
    for (int i = 0; i < taskList.length; i++) {
   taskNum=(i+1);
   
}
   taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNum + ":" + devName.substring(Math.max(devName.length() - 3, 0)).toUpperCase();
        //Display  all the task details
        taskList[3] = new Tasks(taskName, taskDesc, devName, numberHrs,taskStatus,taskID,taskNum);
               

        //Displays The Tasks
	     StringBuilder tmess= new StringBuilder("Tasks:\n");
                        for (Tasks taskList1 : taskList) {
                              tmess.append(taskList1.toString()).append("\n");
                            returntotalHours += taskList1.getNumberHrs();
                          
                        }
      tmess.append("Total hours for all tasks:").append(returntotalHours);
					 JOptionPane.showMessageDialog(null,tmess.toString());
        
    }
                        
//Option 2
                        case 2 -> JOptionPane.showMessageDialog(null, "COMING SOON!");
                       //Quit option  
                        case 3 -> {exit = true ;continueProgram = false;}
                        default -> JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                }
            }
        }
                    
                    

                }

                case 2 ->
//CANCEL OPTION TO END PROGRAM
                    continueProgram = false;
                default -> {
                    JOptionPane.showMessageDialog(null, "GOODBYE!!");
                    continueProgram = false;
                }
            }
        }
    }
}
