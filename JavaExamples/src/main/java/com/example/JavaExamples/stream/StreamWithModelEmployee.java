package com.example.JavaExamples.stream;

import com.example.JavaExamples.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithModelEmployee {

    private static final Logger log =
            LoggerFactory.getLogger(StreamWithNumber.class);

    public static void main(String[] args) {

        List<Employee> emp = (Arrays.asList(new Employee(1, "Reni", "CSC", 50000.0),
                new Employee(2, "anu", "ECE", 70000.0),
                new Employee(3, "abi", "EEE", 60000.0),
                new Employee(3, "abi I", "EEE", 80000.0),
                new Employee(4, "revathy", "CSC", 20000.0),
                new Employee(4, "revathy R", "CSC", 60000.0),
                new Employee(4, "Reni R", "CSC", 90000.0),
                new Employee(4, "sara I", "CSC", 30000.0),
                new Employee(4, "Anu R", "CSC", 40000.0)));


        //grouping dept and if salary is above 50000 order by ASC, salary is below 50000 order by DESC
        System.out.println("Example 11");
        Map<String, Map<String, List<Employee>>> result = emp.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> Map.of(
                                "ASC",
                                list.stream().filter(empl -> empl.getSalary() > 50000)
                                        .sorted(Comparator.comparing(Employee::getSalary))
                                        .toList(),

                                "DESC",
                                list.stream().filter(empl -> empl.getSalary() < 50000)
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .toList()
                        )
                )));

        System.out.println(result);


        //grouping by dept and sorting by ASC based on salary
        System.out.println("Example 22");
        Map<String, List<Employee>> result1 = emp.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList()
                )));
        System.out.println(result1);

        //sorting ASC by salary
        System.out.println("sortedASC");
        List<Employee> sortedASC = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(sortedASC);

        //sorting DSC by salary
        System.out.println("sortedDESC");
        List<Employee> sortedDESC = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(sortedDESC);


        //max salary with full object
        System.out.println("max");
        Optional<Employee> max = emp.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(max);

        //max salary with only value
        System.out.println("maxSalary");
        double maxSalary = emp.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .orElse(0.0);
        System.out.println(maxSalary);

        //min salary with full object
        System.out.println("min");
        Optional<Employee> min = emp.stream()
                .min(Comparator.comparing(Employee::getSalary));
        System.out.println(min);


        //min salary with only value
        System.out.println("minSalary");
        double minSalary = emp.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .orElse(0.0);

        System.out.println(minSalary);

        //second Highest salary
        System.out.println("Second Highest Salary with Object");
        Optional<Employee> secondHighestSalary = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestSalary);

        System.out.println("Second Highest salary");
        Optional<Double> secondHighSalary = emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .skip(1)
                .findFirst();
        System.out.println(secondHighSalary);


        //groupingBy based on Dept
        System.out.println("Group By dept");
        Map<String, List<Employee>>  groupByDept = emp.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(groupByDept);


        //counting Employee by grouping country
        System.out.println("counting Employee by grouping country");
        Map<String,Long> groupingByCountry = emp.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        System.out.println(groupingByCountry);




        emp.stream()
                .peek(empl -> log.info("Processing emp {}", empl.getDept()))
                .collect(Collectors.toList());

        System.out.println("Using Stream");
        Stream<Integer> list2 = Stream.of(1, 2, 3);
        list2.forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println("using peek");
        numbers.stream().peek(p -> System.out.println("Peek Num::" + p))
                .forEach(System.out::println);

        //parallel()
        System.out.println("parallel()");
        IntStream.rangeClosed(1,50)
                .parallel()
                .forEach(System.out::println);

        System.out.println("parallelStream()");
        List<Integer> listt = Arrays.asList(3,4,5,8,9,1,2,4,6,8,12,4,5,67,89,64,34,68,343,543,4545);
        listt.parallelStream().forEach(System.out::println);
    }

}
