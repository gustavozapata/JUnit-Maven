/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

//JUnit 5
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;

//JUnit 4.11
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author k1715308
 */
public class SciCalcDoubleTest {
    
    Calculator calculator;
    
    public SciCalcDoubleTest() {
        calculator = new Calculator();
    }
    
    //Parameterized datasets
    private static Stream<Arguments> dataTestRadiansToDegrees() {
        return Stream.of(
                arguments(90, 5156.62),
                arguments(5, 286.47),
                arguments(45, 2578.31)
        );
    }
    private static Stream<Arguments> dataTestDegreesToRadians() {
        return Stream.of(
                arguments(90, 1.57),
                arguments(180, 3.14),
                arguments(360, 6.28)
        );
    }
    
    /**
     * Test of operation method, of class SciCalcDouble.
     */
    @ParameterizedTest
    @MethodSource("dataTestRadiansToDegrees")
    public void testRadiansToDegrees(double angleRadian, double expResult) {
        System.out.println("*** Test Parameterized Radians to Degrees ***");
      
        //The last argument is called Delta and it's used when comparing double values
        //It's the maximum delta between expected and actual for which both numbers are still considered equal.
        assertEquals(expResult, calculator.getDoubleResult(angleRadian, calculator.radiansToDegrees), 0.05);
    }
    
    @ParameterizedTest
    @MethodSource("dataTestDegreesToRadians")
    public void testDegreesToRadians(double angleDegree, double expResult) {
        System.out.println("*** Test Parameterized Degrees to Radians ***");
        assertEquals(expResult, calculator.getDoubleResult(angleDegree, calculator.degreesToRadians), 0.05);
    }
}
