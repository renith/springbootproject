package com.example.JavaExamples.streamexampleHCL;


import com.example.JavaExamples.model.Employe;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
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
        System.out.println("top 2 salary based on below skill");
        List<Employeee> emps = list.stream().filter(x -> skillSet.contains(x.getSkill()))
                        .sorted(Comparator.comparing(Employeee::getSalary).reversed())
                                .limit(2)
                                        .toList();

                System.out.println(emps);


        //groupby email based on first character
        Map<Character, List<Employeee>> group = list.stream()
                .collect(Collectors.groupingBy(x ->Character.toLowerCase(x.getSkill().charAt(0))));
        System.out.println(group);


    /*  group.entrySet().stream().forEach(val -> {
          System.out.println(val.getKey());
          val.getValue().forEach(System.out::println);
      });*/
    }
}
