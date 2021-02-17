/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

import java.io.FileNotFoundException;
import java.io.IOException;
import static java.time.Duration.ofMillis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//JUnit 5.3
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//JUnit 4.11
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author k1715308
 */
public class SciCalcListTest {
    
    private static final int DEFAULT_TIMEOUT = 1000;
    Calculator calculator;
    List<Double> NumberList;
    
    
    public SciCalcListTest() throws IOException {
        calculator = new Calculator();
        NumberList = calculator.readDataFromFile("data.csv");
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
    
    @Test
    public void testReadDataFromFile() throws IOException {
        System.out.println("*** Test Read Data from File ***");
        List<Double> expResult = new ArrayList<>(Arrays.asList(1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0, 21.0, 34.0, 55.0, 89.0, 144.0, 233.0, 377.0, 610.0));
        List<Double> result = calculator.readDataFromFile("data.csv");
        assertEquals(expResult, result, "Test for reading data from file");
    }
    
    @Test
    public void testReadDataFromFileTimeout() throws IOException {
        System.out.println("*** Test Read Data from File Timeout ***");
        String result = assertTimeout(ofMillis(DEFAULT_TIMEOUT), () -> {
            // Perform task that takes less than 1000 miliseconds (1 second)
            calculator.readDataFromFile("data.csv");
            return "It took less than " + DEFAULT_TIMEOUT;
        });
        assertEquals("It took less than " + DEFAULT_TIMEOUT, result);
    }
    
    @Test
    public void testReadDataFromFileException() {
        System.out.println("*** Test Read Data from File Exception ***");
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            NumberList = calculator.readDataFromFile("dataset.cvs");
        });
        assertTrue(exception.getMessage().contains("The system cannot find the file specified"));
    }
}
