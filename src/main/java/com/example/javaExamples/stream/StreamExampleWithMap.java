package com.example.javaExamples.stream;

import java.util.*;
import java.util.stream.*;

public class StreamExampleWithMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "renith");
        map.put(5, "abii");
        map.put(1, "abi");
        map.put(3, "liya");


        //Print all entries
        System.out.println("Print all entries");
        map.entrySet().stream().forEach(val -> System.out.println(val.getKey() +" "+val.getValue()));



        //Print only keys
        System.out.println("Print only keys");
        map.keySet().stream().forEach(System.out::println);


        //Print only values
        System.out.println("Print only values");
        map.values().stream().forEach(System.out::println);


        //Filter by key
        System.out.println("Filter by key");
        Map<Integer,String> filteredMap = map.entrySet().stream().filter(val -> val.getKey()>2)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                                ));


        System.out.println(filteredMap);


        //Filter by value
        System.out.print("Filter by value");
        Map<Integer,String> filtered = map.entrySet().stream().filter(val -> val.getValue().startsWith("a"))
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue));

               System.out.println(filtered);

        //Convert values to uppercase using map()
        System.out.println("Convert values to uppercase using map()");
        Map<Integer,String> upperCaseValue = map.entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                val -> val.getValue().toUpperCase()));

        System.out.println(upperCaseValue);


        //Get only keys as a list
        System.out.println("Get only keys as a list");
List<Integer> keysList = map.keySet().stream().collect(Collectors.toList());
        System.out.print(keysList);


        //or
        List<Integer> keyList = map.entrySet().stream().map(Map.Entry::getKey).toList();

        System.out.println(keyList);


        //Sort by key
        System.out.println("Sort by key");
        Map<Integer,String> sortedByKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        ));

        System.out.println(sortedByKey);


        //Sort by value
        System.out.println("Sort by value");
        Map<Integer,String> sortedByValue = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1,e2 ) -> e1,
                                        LinkedHashMap::new
                                ));

       System.out.println(sortedByValue);


        //Find first entry
        System.out.println("Find first entry");
        Optional<Map.Entry<Integer, String>> firstMapEntry = map.entrySet().stream().findFirst();
        System.out.print(firstMapEntry);


    }
}
