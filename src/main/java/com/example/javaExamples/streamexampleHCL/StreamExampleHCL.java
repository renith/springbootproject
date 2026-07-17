package com.example.javaExamples.streamexampleHCL;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employeee {
    private int id;
    private double salary;
    private String skill;
    private String name;

}

public class StreamExampleHCL {

    public static void main(String[] args) {

        List<Employeee> list = Arrays.asList(new Employeee(1, 20000, "c++", "liya"),
                new Employeee(2, 70000, "Java", "Renith"),
                new Employeee(3, 40000, "Spring Boot", "dayana"),
                new Employeee(4, 60000, "Microservices", "ganesh"),
                new Employeee(4, 80000, "Microservices", "liya"),
                new Employeee(4, 50000, "Microservices", "liya"));


        // top 2 salary based on below skill
        List<String> skillSet = Arrays.asList("Java", "C++", "Spring Boot");
        List<Employeee> emps = list.stream()
                        .filter(s -> skillSet.contains(s.getSkill()))
                                .sorted(Comparator.comparing(Employeee::getSalary).reversed())
                                        .limit(2)
                                                .collect(Collectors.toList());


       System.out.println("top 2 salary based on below skill");
       System.out.println(emps);



    /*  group.entrySet().stream().forEach(val -> {
          System.out.println(val.getKey());
          val.getValue().forEach(System.out::println);
      });*/
    }
}
