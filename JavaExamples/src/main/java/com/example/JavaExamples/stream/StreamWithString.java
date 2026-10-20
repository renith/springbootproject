package com.example.JavaExamples.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWithString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "Spring", "Boot", "API", "Phytho", "java1");
        List<List<String>> flapMap = Arrays.asList(Arrays.asList("g", "a"),
                Arrays.asList("r", "u"),
                Arrays.asList("t", "p")
        );

        //To collect flatmap into list of integer
        System.out.println("FlatMap to list");
        List<String> flatToList = flapMap.stream().flatMap(List::stream).toList();
        System.out.println(flatToList);


        System.out.println("Flatten Strings into Characters");
        List<String> wordss = List.of("Java", "Stream");
        List<Character> flatMapRes = wordss.stream()
                .flatMap(x -> x.chars().mapToObj(c -> (char) c)).toList();
        System.out.println(flatMapRes);


        System.out.println("Filter Strings by length");
        List<String> names1 = List.of("Java", "Spring", "AI", "Docker");
        List<String> filteredByLength = names1.stream()
                .filter(x -> x.length() > 5)
                .toList();

        System.out.println(filteredByLength);

        //Convert list to string or concatenate String
        System.out.println("joining");
        String joining = names1.stream().collect(Collectors.joining(" "));

        System.out.println(joining);

        //max string from the list of string
        System.out.println("Max list of String");
        Optional<String> max = names1.stream().max(Comparator.comparing(String::length));
        System.out.println(max);

        //sortingASC
        System.out.println("sortingASC");
        List<String> sortedASC = names1.stream().sorted().toList();

        System.out.println(sortedASC);


        //sortingDESC
        System.out.println("sortingDESC");
        List<String> sortingDESC = names1.stream()
                .sorted(Comparator.reverseOrder())
                .toList();


        System.out.println(sortingDESC);

        //list to map
        System.out.println("listToMap");
        Map<String, Integer> listToMap = names1.stream().collect(Collectors.toMap(
                val -> val,
                val -> val.length()
        ));
        System.out.println(listToMap);


        // convert list of string to uppercase
        System.out.println("UpperCase");
        List<String> uppercase = names1.stream()
                .map(x -> x.toLowerCase()).toList();

        System.out.println(uppercase);

        //filter start with j
        System.out.println("filter start with j ");
        List<String> filterByJ = names1.stream().filter(x -> x.startsWith("J"))
                .toList();

        System.out.println(filterByJ);

        //count  string with specificprefix
        System.out.println("count  string with specificprefix");
        long count = names1.stream().filter(x -> x.startsWith("j"))
                        .count();
        System.out.println(count);

        //Check if Any Matches a condition

        //Group String by Length
        System.out.println("GroupingByLength");
        Map<Integer,List<String>> groupingByLength = names1.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupingByLength);


        //Find Longest String
        System.out.println("Longest String");
        Optional<String> longestString = names1.stream()
                .max(Comparator.comparing(String::length));

        System.out.println(longestString);


    }
}
