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
                String[] values = line.replaceAll("[^\\d,]", "").split(",");
                records.add(Arrays.asList(values));
            }
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

    public int getIntResult(int n1, int n2, SciCalcInt calc) {
        return calc.operation(n1, n2);
    }
    public double getDoubleResult(double value, SciCalcDouble calc) {
        return calc.operation(value);
    }
    public double[] getArrayResult(double value, SciCalcArray calc) {
        return calc.operation(value);
    }
    public double getResultFromList(List<Double> list, SciCalcList calc){
        return calc.operation(list);
    }
}
