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
    
    public SciCalcArrayTest() {
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
    public void testOperation() {
        System.out.println("operation");
        double values = 0.0;
        SciCalcArray instance = new SciCalcArrayImpl();
        double[] expResult = null;
        double[] result = instance.operation(values);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SciCalcArrayImpl implements SciCalcArray {

        public double[] operation(double values) {
            return null;
        }
    }
    
}
