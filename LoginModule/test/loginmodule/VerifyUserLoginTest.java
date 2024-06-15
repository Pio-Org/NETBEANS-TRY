/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmodule;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pc
 */
public class VerifyUserLoginTest {
    
    public VerifyUserLoginTest() {    
    }
    
    @Test
    public void testVerifyCorrectCredentials() {
        VerifyUserLogin login = new VerifyUserLogin();
        String username = "testuser";
        String password = "password";
        boolean expectedResult = true;
        boolean actualResult = login.verifyLogin(username, password);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testVerifyIncorrectCredentials() {
        VerifyUserLogin login = new VerifyUserLogin();
        String username = "testuser";
        String password = "wrongpassword";
        boolean expectedResult = false;
        boolean actualResult = login.verifyLogin(username, password);
        assertEquals(expectedResult, actualResult);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
