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
public class PayrollCalculatorTest {
    
    public PayrollCalculatorTest() {
    }
    
    @Test
    public void testCalculateGrossPay() {
        PayrollCalculator calculator = new PayrollCalculator();
        double hoursWorked = 40;
        double hourlyRate = 15.00;
        double expectedGrossPay = 600.00;
        double actualGrossPay = calculator.calculateGrossPay(hoursWorked, hourlyRate);
        assertEquals(expectedGrossPay, actualGrossPay, 0);
    }

    @Test
    public void testCalculateNetPay() {
        PayrollCalculator calculator = new PayrollCalculator();
        double grossPay = 600.00;
        double taxRate = 0.20;
        double expectedNetPay = 480.00;
        double actualNetPay = calculator.calculateNetPay(grossPay, taxRate);
        assertEquals(expectedNetPay, actualNetPay, 0);
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
