/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

//JUnit 5
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

//JUnit 4.11
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author k1715308
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    SciCalcIntTest.class,
    SciCalcDoubleTest.class,
    SciCalcArrayTest.class,
    SciCalcListTest.class
})
public class SciCalcTest {
    // the class remains empty
    // used only as a holder for the above annotations
}
