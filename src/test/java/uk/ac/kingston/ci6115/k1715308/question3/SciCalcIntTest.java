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
public class SciCalcIntTest {
    
    Calculator calculator;
    
    public SciCalcIntTest() {
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
     * Test of operation method, of class SciCalcInt.
     */
    @Test
    public void testAdd() {
        System.out.println("*** Test Add operation ***");
        int expResult = 30;
        int result = calculator.getIntResult(10, 20, calculator.add);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSubtract() {
        System.out.println("*** Test Subtract operation ***");
        int expResult = 7;
        int result = calculator.getIntResult(13, 6, calculator.subtract);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiply() {
        System.out.println("*** Test Multiply operation ***");
        int expResult = 25;
        int result = calculator.getIntResult(5, 5, calculator.multiply);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivide() {
        System.out.println("*** Test Divide operation ***");
        int expResult = 24;
        int result = calculator.getIntResult(48, 2, calculator.divide);
        assertEquals(expResult, result);
    }
}
