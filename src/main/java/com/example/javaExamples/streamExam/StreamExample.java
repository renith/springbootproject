package com.example.javaExamples.streamExam;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
class Employee {
    private int id;
    private double salary;
    private String country;
    private String name;

}

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(3, 70000, "USA", "liya"),
                new Employee(1, 20000, "IN", "abi"),
                new Employee(2, 50000, "KL", "ren"),
                new Employee(4, 10000, "IN", "day"),
                new Employee(6, 2000, "SIG", "Anu")
        );

        System.out.println("Sorted by salary");

        //get names of employees with salary>5000
        System.out.println("get names of employees with salary>5000");
        List<String> name = list.stream().filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(name);


        //sorting based on salary ASC
        System.out.println("sortedASC");

        List<Employee> sortedASC = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedASC);

        //sorting based on salary DESC
        System.out.println("sortedDesc");
        List<Employee> sortedDesc = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(sortedDesc);

        //find higest salary with full object
        System.out.println("higest salary with full object");
        Optional<Employee> highestSalary = list.stream()
                .max(Comparator.comparing(Employee::getSalary));

        System.out.println(highestSalary);


        //find higest salary only
        System.out.println("highestSalary1");
        double highestSalary1 = list.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .orElse(0.0);

        System.out.println(highestSalary1);


        //find lowestsalary with object
        System.out.println("lowestSalary");
        Optional<Employee> lowestSalary = list.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println(lowestSalary);

        //find lowest salary
        System.out.println("lowest salary");
        double lowest = list.stream().min(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .orElse(0.0);

        System.out.println(lowest);


        //find Second Highest salary
        System.out.println("Second Highest salary");
        Optional<Employee> secongHighestSalary = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();

        System.out.println(secongHighestSalary);

        //grouping based on country
        System.out.println("grouping");
        Map<String, List<Employee>> grouping = list.stream().collect(Collectors.groupingBy(Employee::getCountry));


        System.out.println(grouping);


        //counting Employee by grouping country
        System.out.println("counting Employee by grouping country");
        Map<String, Long> groupinCountry = list.stream().collect(Collectors.groupingBy(Employee::getCountry, Collectors.counting()));

        System.out.println(groupinCountry);

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
