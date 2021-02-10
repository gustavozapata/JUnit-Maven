/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci6115.k1715308.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author k1715308
 */
public class Calculator {
    
    //a) Basic Calculations
    SciCalcInt add = (n1, n2) -> n1 + n2;
    SciCalcInt subtract = (n1, n2) -> n1 - n2;
    SciCalcInt multiply = (n1, n2) -> n1 * n2;
    SciCalcInt divide = (n1, n2) -> n1 / n2;
    
    //b) Scientific Calculations
    SciCalcDouble radiansToDegrees = (angleRad) -> (angleRad * 180) / Math.PI;
    SciCalcDouble degreesToRadians = (angleDeg) -> (angleDeg * Math.PI) / 180;
    SciCalcArray radiansSinCosTan = (angleRad) -> new double[] {Math.sin(angleRad), Math.cos(angleRad), Math.tan(angleRad)};
    
    //c) Java Streams - Mean and Standard Deviation
    SciCalcList mean = (list) -> list.stream().mapToDouble(num -> num).average().orElse(0.0);
    SciCalcList standardDeviation = (list) -> Math.sqrt(list.stream().map(num -> num - getResultFromList(list, mean)).map(num -> num*num).mapToDouble(num -> num).average().orElse(0.0));

    //read the data from the csv file
    public List<Double> readDataFromFile() {
        List<List<String>> records = new ArrayList<>();
        List<Double> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                //regex that cleans up the values (leaves only digits and commas)
                String[] values = line.replaceAll("[^\\d,]", "").split(",");
                records.add(Arrays.asList(values));
            }
            //flatten the list<list<string>> to a single dimensional list
            records.forEach((number) -> {
                number.forEach((num) -> {
                    numbers.add(Double.parseDouble(num));
                });
            });
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return numbers;
    }

//    public static void main(String[] args) {
//        List<Double> NumberList = readDataFromFile();

        //a) Basic Calculations
//        getSciCalcIntResult(3, 7, add);//10
//        getSciCalcIntResult(6, 3, subtract);//3
//        getSciCalcIntResult(2, 8, multiply);//16
//        getSciCalcIntResult(80, 4, divide);//20
        
        //b) Scientific Calculations
//        getSciCalcDoubleResult(80, radiansToDegrees); //4583.6623610
//        getSciCalcDoubleResult(20, degreesToRadians); //0.34906585
//        getSciCalcArrayResult(5, radiansSinCosTan); //[-0.95892, 0.28366, -3.380515]
        
        //c) Java Streams - Mean and Standard Deviation
//        getSciCalcListResult(NumberList, meanFromList);
//        getSciCalcDoubleResult(getSciCalcListResult(NumberList, varianceFromList), standardDeviation);
//    }

    public int getIntResult(int n1, int n2, SciCalcInt calc) {
        return calc.operation(n1, n2);
    }
    public double getDoubleResult(double value, SciCalcDouble calc) {
        return calc.operation(value);
    }
    public double[] getArrayResult(double values, SciCalcArray calc) {
        return calc.operation(values);
    }
    public double getResultFromList(List<Double> list, SciCalcList calc){
        return calc.operation(list);
    }
}
