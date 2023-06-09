
package st10178800o.tarjanneprog5121poep1;

import javax.swing.JOptionPane;

/**
 *
 * @author Onello  Tarjanne ST10178800
 */
public class Tasks {
    
    String taskName;
    String taskDesc;
    String devName;
     int numberHrs;
   String taskStatus;
   int returntotalHours = 0;
   String taskID;
        int taskNum;
   
     public static boolean checktaskDesc(String taskDesc) {
         
        boolean valid = true;
		  if (taskDesc.length() >50) {
            valid = false;
            JOptionPane.showMessageDialog(null, "Task Description must Not exceed of 50 characters ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
                  
                  if (valid) {
            JOptionPane.showMessageDialog(null, "Task Description Successfully Captured");
        }

                  
                  return valid;
}

     public Tasks(String taskName, String taskDesc, String devName, int numberHrs, String taskStatus, String taskID, int taskNum) {
        this.taskID = null;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.devName = devName;
        this.numberHrs = numberHrs;
        this.taskStatus = taskStatus;
        this.taskID = taskID;
        this.taskNum = taskNum;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public int getNumberHrs() {
        return numberHrs;
    }

    public void setNumberHrs(int numberHrs) {
        this.numberHrs = numberHrs;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }


    @Override
    public String toString() {
        String taskmsg = String.format("""
            Task Status: %S
            Developer Name: %S
            Task Number: %S
            Task Name: %S
            Task Description: %S
            TASK ID: %S
            Task Duration: %S""", taskStatus, devName, taskNum, taskName, taskDesc, taskID, numberHrs + "\n-------------------------------------\n ");
        return taskmsg;
    }
}
