package com.example.JavaExamples.stream;

import java.awt.desktop.OpenFilesEvent;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleWithMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(6, "Gan");
        map.put(3, "renith");
        map.put(5, "abii");
        map.put(1, "abi");
        map.put(3, "liya");


        //Print all entries
        System.out.println("Print all entries");
        map.entrySet().stream().forEach(System.out::println);

        //or
        System.out.println("or");
        map.forEach((key, value) -> System.out.println(key + " " + value));

        //Print only keys
        System.out.println("Print only keys");
        map.keySet().stream().forEach(System.out::println);

        //Print only values
        System.out.println("Print only values");
        map.values().stream().forEach(System.out::println);

        //Filter by key
        System.out.println("Filter by key");
        map.entrySet().stream().filter(val -> val.getKey() > 3)
                .forEach(System.out::println);


        //Filter by value
        System.out.print("Filter by value");
        map.entrySet().stream()
                .filter(val -> val.getValue().startsWith("abi"))
                .forEach(System.out::println);

        //Convert values to uppercase using map()
        System.out.println("Convert values to uppercase using map()");
        Map<Integer, String> valuesUpperCase = map.entrySet().stream().collect(Collectors.toMap(val -> val.getKey(),
                val -> val.getValue().toUpperCase()));

        System.out.println(valuesUpperCase);

        //Get only keys as a list
        System.out.println("Get only keys as a list");
        List<Integer> keyList = map.keySet().stream().toList();

        System.out.println(keyList);


        //Find first entry
        System.out.println("Find first entry");
        Optional<Map.Entry<Integer, String>> firstEntry = map.entrySet().stream().findFirst();
        System.out.println(firstEntry);

    }
}
