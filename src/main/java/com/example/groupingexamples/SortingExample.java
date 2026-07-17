package com.example.groupingexamples;

import com.example.modelemployee.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class SortingExample {
    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(new Employee("renith", "CSE", 70000),
                new Employee("renith", "CSE", 20000),
                new Employee("renith", "EEE", 30000),
                new Employee("renith", "ECE", 80000),
                new Employee("renith", "ECE", 10000)

        );
// grouping by department and sorting by salary

        System.out.println("one option::");
        Map<String,List<Employee>> map = employee.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        LinkedHashMap::new,
                        Collectors.toList()
                        ));

        System.out.println(map);

        System.out.println("secon option::");

        Map<String,List<Employee>> map1 = employee.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList()
                )
        ));


        System.out.println(map1);


        //sorted employee by salary if salary is greater than 50k - sort by asc. less than 50k desc
        System.out.println("Interview");
        Map<String,Map<String, List<Employee>>> groupedAndSorted = employee.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> Map.of(
                                "ASC",
                                list.stream().filter(emp -> emp.getSalary()>50000)
                                        .sorted(Comparator.comparing(Employee::getSalary)).toList(),


                                "DESC",
                                list.stream().filter(emp -> emp.getSalary()<50000)
                                        .sorted(Comparator.comparing(Employee::getSalary))
                                        .toList()
                        )
                )
        ));

        System.out.println(groupedAndSorted);

    }
}
