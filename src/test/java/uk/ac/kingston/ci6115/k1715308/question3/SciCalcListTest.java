/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

import java.util.List;
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
public class SciCalcListTest {
    
    Calculator calculator;
    List<Double> NumberList;
    
    public SciCalcListTest() {
        calculator = new Calculator();
        NumberList = calculator.readDataFromFile();
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
     * Test of operation method, of class SciCalcList.
     */
    @Test
    public void testMean() {
        System.out.println("*** Test Mean operation ***");
        double expResult = 106.4;
        double result = calculator.getResultFromList(NumberList, calculator.mean);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStandardDeviation() {
        System.out.println("*** Test Standard Deviation operation ***");
        double expResult = 169.75582464234;
        double result = calculator.getResultFromList(NumberList, calculator.standardDeviation);
        assertEquals(expResult, result, 0.005);
    }
}
