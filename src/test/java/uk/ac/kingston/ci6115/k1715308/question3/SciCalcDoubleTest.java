/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author k1715308
 */
public class SciCalcDoubleTest {
    
    Calculator calculator;
    
    public SciCalcDoubleTest() {
        calculator = new Calculator();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of operation method, of class SciCalcDouble.
     */
    @Test
    public void testRadiansToDegrees() {
        System.out.println("*** Test Radians to Degrees ***");
        double expResult = 5156.62;
        double result = calculator.getDoubleResult(90, calculator.radiansToDegrees);
      
        //The last argument is called Delta and it's used when comparing double values
        //It's the maximum delta between expected and actual for which both numbers are still considered equal.
        assertEquals(expResult, result, 0.05); 
    }
    
    @Test
    public void testDegreesToRadians() {
        System.out.println("*** Test Degrees to Radians ***");
        double expResult = 1.57;
        double result = calculator.getDoubleResult(90, calculator.degreesToRadians);
        assertEquals(expResult, result, 0.05);
    }
}
