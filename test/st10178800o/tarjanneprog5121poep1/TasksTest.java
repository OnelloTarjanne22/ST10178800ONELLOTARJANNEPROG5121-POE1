/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10178800o.tarjanneprog5121poep1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Onello
 */
public class TasksTest {
    
    public TasksTest() {
    }

    /**
     * Test of checktaskDesc method, of class Tasks.
     */
   @Test
    public void testChecktaskDescSuccess() {
        System.out.println("ChecktaskDesc");
        String x = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Tasks.checktaskDesc(x);
        assertEquals(expResult, result);
        System.out.println("Task Description Successfully Captured");

    }
    
    @Test
    public void testChecktaskDescFail() {
        System.out.println("ChecktaskDescFail");
        String x = "TPDbXb06eA1OGBaeLfx7R2iNFxWKvpb2z9oOJGjwJSn1w1zDZ3qMRRsxFl";
        boolean expResult = false;
        boolean result = Tasks.checktaskDesc(x);
        assertEquals(expResult, result);
        System.out.println( "Task Description must have a minimum of 50 characters ");

    }
    /**
     * Test of getTaskName method, of class Tasks.
     */
    @Test
    public void testGetTaskName() {
    }

    /**
     * Test of setTaskName method, of class Tasks.
     */
    @Test
    public void testSetTaskName() {
    }

    /**
     * Test of getTaskDesc method, of class Tasks.
     */
    @Test
    public void testGetTaskDesc() {
    }

    /**
     * Test of setTaskDesc method, of class Tasks.
     */
    @Test
    public void testSetTaskDesc() {
    }

    /**
     * Test of getDevName method, of class Tasks.
     */
    @Test
    public void testGetDevName() {
    }

    /**
     * Test of setDevName method, of class Tasks.
     */
    @Test
    public void testSetDevName() {
    }

    /**
     * Test of getNumberHrs method, of class Tasks.
     */
    @Test
    public void testGetNumberHrs() {
    }

    /**
     * Test of setNumberHrs method, of class Tasks.
     */
    @Test
    public void testSetNumberHrs() {
    }
@Test
    public void testreturntotalHoursSuccess() {
         Tasks[] taskList = new Tasks[4];
        taskList[0] = new Tasks("MY NICE TASK", "TASK TO COMPLIMENT ", "George Howard", 3, "DOING","MY:1:ARD",1);
        taskList[1] = new Tasks("CHARACTER CHECKING", "CHECKS CHARACTERS", "Luke Hall", 5, "TO DO","CH:2:ALL",2);
        taskList[2] = new Tasks("LOG USER FEATURE", "ADDS A LOGIN FEATURE", "Ambah Singh", 8, "DONE","LO:3:NGH",3);

        int expectedTotalHours = 16;

        int actualTotalHours = 0;
        for (Tasks task : taskList) {
            actualTotalHours += task.getNumberHrs();
        }

      
        Assertions.assertEquals(expectedTotalHours, actualTotalHours);

      
        System.out.println("Total hours spent on tasks: " + actualTotalHours);
    }
    @Test
    public void testGenerateTaskIDSuccess() {
        Tasks[] taskList = new Tasks[4];
        taskList[0] = new Tasks("MY NICE TASK", "TASK TO COMPLIMENT ", "George Howard", 3, "DOING","MY:1:ARD",1);
        taskList[1] = new Tasks("CHARACTER CHECKING", "CHECKS CHARACTERS", "Luke Hall", 23, "TO DO","CH:2:ALL",2);
        taskList[2] = new Tasks("LOG USER FEATURE", "ADDS A LOGIN FEATURE", "Ambah Singh", 30, "DONE","LO:3:NGH",3);

        taskList[3] = new Tasks("SAMPLE TASK", "SAMPLE DESCRIPTION", "John Doe", 5, "TO DO","",0);

        String[] expectedIDs = {"MY:1:ARD", "CH:2:ALL", "LO:3:NGH", "SA:4:DOE"};
        String[] actualIDs = new String[taskList.length];

        for (int i = 0; i < taskList.length; i++) {
            StringBuilder capitals = new StringBuilder();
            String lastThreeLetters = taskList[i].getTaskName().substring(taskList[i].getDevName().length() - 3).toUpperCase();

            for (int t = 0; t < taskList[i].getDevName().length(); t++) {
                char c = taskList[i].getDevName().charAt(t);
                if (Character.isUpperCase(c)) {
                    capitals.append(c);
                }
            }
            

            String capitalizedLetters = capitals.toString();
            actualIDs[i] = capitalizedLetters + ":" + (i + 1) + ":" + lastThreeLetters;

            // Print the generated ID for each task
            System.out.println("Task ID: " + actualIDs[i]);
            System.out.println("Task Number: " + (i + 1) + " " + taskList[i]);
        }

        // Compare the expected and actual IDs
        Assertions.assertArrayEquals(expectedIDs, actualIDs);
    }
    /**
     * Test of getTaskStatus method, of class Tasks.
     */
    @Test
    public void testGetTaskStatus() {
    }

    /**
     * Test of setTaskStatus method, of class Tasks.
     */
    @Test
    public void testSetTaskStatus() {
    }

    /**
     * Test of toString method, of class Tasks.
     */
    @Test
    public void testToString() {
    }
    
}
