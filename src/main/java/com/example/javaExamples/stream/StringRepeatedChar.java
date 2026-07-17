package com.example.javaExamples.stream;

import javax.persistence.criteria.CriteriaBuilder;
import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringRepeatedChar {
    public static void main(String[] args) {

        String s = "aabcabcrg";

        //count th e character
        Map<Character, Long> map = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        // map entrySet iteration
        map.entrySet().stream().forEach(val -> System.out.println(val.getKey() + " " + val.getValue()));


        System.out.println("forEach iteration");
//map only forEach iteration
   /*     map.forEach((key,value) -> {
            System.out.println(key +" "+value);
        });
*/


        // repeated character
        System.out.println("Repeted Char");
        map.entrySet().stream().filter(val -> val.getValue() > 1).forEach(System.out::println);


        //non repeate char
        System.out.println("Non- Repeated Char");
        map.entrySet().stream().filter(val -> val.getValue() == 1)
                .forEach(System.out::println);


        // find first non-repeated char

        System.out.println();
        System.out.println("firstNonRepeatedChar");
        char firstNonRepeatedChar = map.entrySet().stream()
                .filter(val -> val.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(' ');


        System.out.println(firstNonRepeatedChar);

        System.out.println("anyMatch");

        boolean anyMatch = map.entrySet().stream().anyMatch(val -> val.getValue().equals(map.values().iterator().next()));

        System.out.println(anyMatch);

//to find max letter

        System.out.println("TO find max letter from the string::");
        String stri = "programmiom";

        Map<Character, Long> map1 = stri.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(cha -> cha, Collectors.counting()));

        Optional<Character> max = map1.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

        System.out.println(max);


        //To find indexOfLetter
        char[] c = {'a', 'G', 'f', 'o', 'G', 'F', 'X'};

        System.out.println("To find index of small letter");
        new String(c).chars()
                .filter(Character::isLowerCase)
                        .forEach(c1 -> System.out.println((char)c1 +" "+(c1 - 'a' +1)));


        System.out.println("To find index of capital letter");
        new String(c).chars()
                .filter(Character::isUpperCase)
                        .forEach(c1 -> System.out.println((char)c1 + "" +(c1 - 'A' +1)));


        //how to find missing alphabets

        System.out.println("Missing character ");
        char[] c1 = {'c', 'd', 'e'};

        Set<Integer> present = new String(c1).chars().boxed().collect(Collectors.toSet());

        IntStream.rangeClosed('a','z')
                .filter(c2 -> !present.contains(c2))
                .forEach(c2 -> System.out.println((char)c2));


        //or

    }
}
