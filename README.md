# Solution to Question 3 - JUnit testing using Maven

### Testing framework
* JUnit 5.3.1

### Parameterized tests
These test files use the Parameterized test runner
* SciCalcIntTest.java
* SciCalcDoubleTest.java
* SciCalcArrayTest.java

The @ParameterizedTest and @MethodSource annotations allowed each test method to have its own dataset


### Timeout
This test file uses the assertTimeout() to test if certain tasks are executed within a timespan
* SciCalcListTest.java

This is the equivalent to @Test(timeout = 2000) in JUnit 4


### Throws Exception
This test file used the assertThrows() to test if a method throws the correct exception if this occurs
* SciCalcListTest.java

This is the equivalent to @Test(expected = Exception.class) in JUnit 4


### Issues
When using @ParameterizedTest runner annotation from JUnit 5, there is an error with the maven-surefire-plugin.  
This was fixed by adding another version of this package in the pom.xml file
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M3</version>
</plugin>
```
