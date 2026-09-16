package com.example.JavaExamples.stream;


import com.example.JavaExamples.model.*;

import java.util.*;



public class ConcurrentModificationException {
    public static void main(String args[]) {


        List<Employee1> emp = Arrays.asList(new Employee1(1, "jestin", "saligrammam", 50000),
                new Employee1(2,"renith", "anna street",60000),
                new Employee1(3,"liya", "Anant street",10000));
        // populate name above 2000
        List<String> result = emp.stream()
                .filter(e -> e.getSalary() > 2000)
                .map(Employee1::getName)
                .toList();

        System.out.println(result);

        // only max of salary using stream Api
        System.out.println("onlyMaxValue::");
        long onlyMaxValues = emp.stream().max(Comparator.comparing(Employee1::getSalary))
                .map(Employee1::getSalary).orElse(0L);


        System.out.println(onlyMaxValues);

        //fetch object based on max salary
        System.out.println("maxObject");

        Optional<Employee1> maxObject = emp.stream().max(Comparator.comparing(Employee1::getSalary));

        System.out.println(maxObject);


        //min using stream Api

        System.out.println("MinValue");
        long minValue = emp.stream().min(Comparator.comparing(Employee1::getSalary)).map(Employee1::getSalary).orElse(0L);
        System.out.println(minValue);


        System.out.println("MinObject");
        Optional<Employee1> minObject = emp.stream().min(Comparator.comparing(Employee1::getSalary));
        System.out.println(minObject);
    }

}
