/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

//JUnit 5.3
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

//JUnit 4.11
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author k1715308
 */
public class SciCalcIntTest {
    
    Calculator calculator;
    
    public SciCalcIntTest() {
        calculator = new Calculator();
    }
    
    //Parameterized datasets
    private static Stream<Arguments> dataTestAdd() {
        return Stream.of(
                arguments(10, 20, 30),
                arguments(5, 7, 12),
                arguments(12, 12, 24)
        );
    }
    private static Stream<Arguments> dataTestSubtract() {
        return Stream.of(
                arguments(50, 5, 45),
                arguments(15, 8, 7),
                arguments(999, 99, 900)
        );
    }
    private static Stream<Arguments> dataTestMultiply() {
        return Stream.of(
                arguments(3, 3, 9),
                arguments(5, 5, 25),
                arguments(2, 64, 128)
        );
    }
    private static Stream<Arguments> dataTestDivide() {
        return Stream.of(
                arguments(81, 9, 9),
                arguments(16, 4, 4),
                arguments(1024, 4, 256)
        );
    }

    /**
     * Test of operation method, of class SciCalcInt.
     */
    @ParameterizedTest
    @MethodSource("dataTestAdd")
    public void testAdd(int num1, int num2, int expResult) {
        System.out.println("*** Test Add Parameterized operation ***");
        assertEquals(expResult, calculator.getIntResult(num1, num2, calculator.add));
    }
    
    @ParameterizedTest
    @MethodSource("dataTestSubtract")
    public void testSubtract(int num1, int num2, int expResult) {
        System.out.println("*** Test Subtract Parameterized operation ***");
        assertEquals(expResult, calculator.getIntResult(num1, num2, calculator.subtract));
    }
    
    @ParameterizedTest
    @MethodSource("dataTestMultiply")
    public void testMultiply(int num1, int num2, int expResult) {
        System.out.println("*** Test Multiply Parameterized operation ***");
        assertEquals(expResult, calculator.getIntResult(num1, num2, calculator.multiply));
    }
    
    @ParameterizedTest
    @MethodSource("dataTestDivide")
    public void testDivide(int num1, int num2, int expResult) {
        System.out.println("*** Test Divide Parameterized operation ***");
        assertEquals(expResult, calculator.getIntResult(num1, num2, calculator.divide));
    }
}
