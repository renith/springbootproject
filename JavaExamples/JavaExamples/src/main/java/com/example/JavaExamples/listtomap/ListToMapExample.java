package com.example.JavaExamples.listtomap;

import com.example.JavaExamples.model.Employe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ListToMapExample {

    public static void main(String[] args) {

        List<Employe> list = Arrays.asList(new Employe("renith", 22, "java", "chennai"),
                new Employe("Liya", 3, "React", "pune"));

        Map<String, String > map = list.stream().collect(Collectors.toMap(
                str -> str.getLocation(),
                str -> str.getSkill()
        ));
        map.entrySet().stream().forEach(val -> System.out.println(val.getKey() +" "+ val.getValue()));
    }
}
