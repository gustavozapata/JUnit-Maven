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
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

//JUnit 4.11
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author k1715308
 */
public class SciCalcArrayTest {
    
    Calculator calculator;
    
    public SciCalcArrayTest() {
        calculator = new Calculator();
    }
    
    //Parameterized datasets
    private static Stream<Arguments> dataTestRadiansSinCosTan() {
        return Stream.of(
                arguments(5, new double[]{-0.95892, 0.28366, -3.38051}),
                arguments(6.28, new double[]{-0.0031, 0.9999, -0.0031}),
                arguments(45, new double[]{0.8509, 0.5253, 1.6197})
        );
    }

    /**
     * Test of operation method, of class SciCalcArray.
     */
    @ParameterizedTest
    @MethodSource("dataTestRadiansSinCosTan")
    public void testRadiansSinCosTan(double angleRadian, double[] expResult) {
        System.out.println("*** Test Parameterized Sin, Cos, Tan from Radian ***");
        assertArrayEquals(expResult, calculator.getArrayResult(angleRadian, calculator.radiansSinCosTan), 0.05);
    }
}
