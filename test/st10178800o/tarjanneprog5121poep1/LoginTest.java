/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10178800o.tarjanneprog5121poep1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Onello
 */
public class LoginTest {
    
    
    public LoginTest() {
    }

    @Test
    public void testGetUserName() {
    }

    @Test
    public void testSetUserName() {
    }

    @Test
    public void testGetPassWord() {
    }

    @Test
    public void testSetPassWord() {
    }

    @Test
    public void testToString() {
    }

      @Test
    public void testCheckPasswordComplexitySuccess() {
        System.out.println("checkPasswordComplexity");
        String x = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Login.checkPasswordComplexity(x);
        assertEquals(expResult, result);
        System.out.println("Password succesfuly captured");

    }
    
    @Test
    public void testCheckPasswordComplexityFail() {
        System.out.println("checkPasswordComplexity");
        String x = "password";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(x);
        assertEquals(expResult, result);
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");

    }
    

    /**
     * Test of checkUserName method, of class Login
     */
    @Test
    public void testCheckUserNameSuccess() {
        System.out.println("checkUserName");
        String x = "kyl_1";
        boolean expResult = true;
        boolean result = Login.checkUsername(x);
        assertEquals(expResult, result);
        System.out.println("Username succesfuly captured");

    }

    @Test
    public void testCheckUsernameFail() {
        System.out.println("checkUserName");
        String x = "kyle_!!!!!!!";
        boolean expResult = false;
        boolean result = Login.checkUsername(x);
        assertEquals(expResult, result);
       System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");

    }
  @Test
  public void TestLoginUser() {  
      
  ArrayList<String> Uname = new ArrayList<>();
  ArrayList<String> passWo = new ArrayList<>();
  
        Uname.add("TOM_T");
        Uname.add("MARK_");
        Uname.add("NELO_");
        
    passWo.add("R3@LTOUGHMAN");
        passWo.add("MOTHCHAS#R321");
        passWo.add("UNIV3RSES@L");
        String element1 = "MARK_";
        
    int expectedIndex1 = 1;
    int actualIndex1 = Uname.indexOf(element1);
    assertEquals(expectedIndex1, actualIndex1);
     System.out.println("Username is Valid");
    
    String element2 = "MOTHCHAS#R321";
    int expectedIndex2 = 1;
    int actualIndex2 = passWo.indexOf(element2);
    assertEquals(expectedIndex2, actualIndex2);
     System.out.println("Password is Valid");
  }
@Test
  public void TestLoginUserfail() {  
      
  ArrayList<String> Uname = new ArrayList<>();
  ArrayList<String> passWo = new ArrayList<>();
  
        Uname.add("TOM_T");
        Uname.add("MARK_");
        Uname.add("NELO_");
        
    passWo.add("R3@LTOUGHMAN");
        passWo.add("MOTHCHAS#R321");
        passWo.add("UNIV3RSES@L");
        String element1 = "MATT_";
        
    int expectedIndex1 =- 1;
    int actualIndex1 = Uname.indexOf(element1);
    assertEquals(expectedIndex1, actualIndex1);
     System.out.println("Username is inValid");
    
    String element2 = "MATTY#R321";
    int expectedIndex2 =- 1;
    int actualIndex2 = passWo.indexOf(element2);
    assertEquals(expectedIndex2, actualIndex2);
     System.out.println("Password is inValid");
  }

}
