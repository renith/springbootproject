package com.example.javaExamples.stream;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleWithString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "Spring", "Boot", "API");

        List<List<String>> flapMap = Arrays.asList(Arrays.asList("g", "a"),
                Arrays.asList("r", "u"),
                Arrays.asList("t", "p"));

//to collect flatmap into list of integer

        List<String> lis = flapMap.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());


        System.out.println(lis);

        // convert list to string using ,
        System.out.println("joining");

        String stringJoining = list.stream().collect(Collectors.joining(" "));

        System.out.println(stringJoining);


        //Sorting ASC
        System.out.println("SortedASC ");
        List<String> sortedASC = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedASC);
        //Sorded DESC
        System.out.println("SortedDesc");
        List<String> sortedDesc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDesc);


        // list to map
        System.out.println("list to map");
        Map<String, Integer> listToMap = list.stream()
                .collect(Collectors.toMap(str -> str, str -> str.length()));

        System.out.println(listToMap);

        //convert list of string to uppercase
        System.out.println("List of String to uppercase");
        List<String> upper = list.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);


        // filter start with j

        List<String> filter = list.stream().filter(val -> val.startsWith("j")).collect(Collectors.toList());
        System.out.println(filter);


    }
}
