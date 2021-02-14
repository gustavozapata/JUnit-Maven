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
public class SciCalcArrayTest {
    
    Calculator calculator;
    
    public SciCalcArrayTest() {
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
     * Test of operation method, of class SciCalcArray.
     */
    @Test
    public void testRadiansSinCosTan() {
        System.out.println("*** Test Sin, Cos, Tan from Radian ***");
        double[] expResult = new double[]{-0.95892, 0.28366, -3.38051};
        double[] result = calculator.getArrayResult(5, calculator.radiansSinCosTan);
        assertArrayEquals(expResult, result, 0.05);
    }
}
