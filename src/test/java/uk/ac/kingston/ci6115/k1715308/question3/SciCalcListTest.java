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
    
    public SciCalcListTest() {
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
    public void testOperation() {
        System.out.println("operation");
        List<Double> list = null;
        SciCalcList instance = new SciCalcListImpl();
        double expResult = 0.0;
        double result = instance.operation(list);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SciCalcListImpl implements SciCalcList {

        public double operation(List<Double> list) {
            return 0.0;
        }
    }
    
}
