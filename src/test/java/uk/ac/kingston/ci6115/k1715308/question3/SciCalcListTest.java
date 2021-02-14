/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//JUnit 5.3
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import static org.junit.jupiter.api.Assertions.*;

//JUnit 4.11
import org.junit.Test;
import static org.junit.Assert.*;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;

/**
 *
 * @author k1715308
 */
public class SciCalcListTest {
    
    private static final int DEFAULT_TIMEOUT = 2000;
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
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testStandardDeviation() {
        System.out.println("*** Test Standard Deviation operation ***");
        double expResult = 169.75582464234;
        double result = calculator.getResultFromList(NumberList, calculator.standardDeviation);
        assertEquals(expResult, result, 0.005);
    }
    
    @Test(timeout = DEFAULT_TIMEOUT)
    public void testReadDataFromFile(){
        System.out.println("*** Test Read Data from File ***");
        List<Double> expResult = new ArrayList<>(Arrays.asList(1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0, 21.0, 34.0, 55.0, 89.0, 144.0, 233.0, 377.0, 610.0));
        List<Double> result = calculator.readDataFromFile();
        assertEquals("Test for reading data from file", expResult, result);
    }
}
