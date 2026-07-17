package com.example.javaExamples.stringreverse;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLetterInStr {

    public static void countLetter(String inp) {


        //count char using java8
    Map<Character,Long> map1 = inp.chars().mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        //display character and count
        map1.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        //display repeated character
        System.out.println("repeated character");
        map1.entrySet().stream()
                .filter(c2 -> c2.getValue() > 1)
                .forEach(c3 -> {
                    System.out.println(c3.getKey());
                });

        //display non-repeated character
        System.out.println("Display Non-repeated");
        map1.entrySet().stream()
                .filter(c2 -> c2.getValue() == 1)
                .forEach(c3 ->
                {
                    System.out.println(c3.getKey());
                });

    }

    public static void main(String arg[]) {
        System.out.println("Enter String::");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CountLetterInStr.countLetter(str);


    }
}
