package com.example.javaExamples.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindIndexOfLetter {
    public static void main(String[] args) {
        char[] c = {'a', 'G', 'f', 'o', 'G', 'X'};

        String str = "abc589AGH";

        // To find the index of small letter in the char
        System.out.println("To find the index of small letter in the char");

        new String(c).chars()
                        .filter(Character::isLowerCase)
                                .forEach(c1 -> System.out.println((char)c1 +" "+(c1 - 'a' +1)));


        System.out.println();
        System.out.println("To find the index of Big letter in the char");
         new String(c).chars()
                 .filter(Character::isUpperCase)
                         .forEach(c1 -> System.out.println((char)c1 +" "+(c1 - 'A' +1)));


        //print only small letter from string

        System.out.println("To find lower case from the string::");

        str.chars().filter(Character::isLowerCase)
                        .forEach(c1 -> System.out.println((char)c1));


        System.out.println();
        System.out.println("find digit from String");
        str.chars().filter(Character::isDigit)
                        .forEach(c1 -> System.out.println((char)c1));


        System.out.println();
        System.out.println("find upper case");
        str.chars().filter(Character::isUpperCase)
                        .forEach(c1 -> System.out.println((char)c1));


        System.out.println();
        System.out.println("To find the letters");
        str.chars().filter(Character::isLetter)
                        .forEach(c1 -> System.out.println((char)c1));


        System.out.println();
        System.out.println("To convert String into the char::");
        List<Character> stringToChar = str.chars()
                .mapToObj(c1 -> (char)c1)
                .collect(Collectors.toList());


        System.out.print(stringToChar);
        System.out.println();

        System.out.println("Stream over a List of Strings");
        List<String> names = List.of("John", "Mary", "David");
        names.stream().forEach(System.out::println);

        System.out.println("Convert all Strings to uppercase");
        List<String> name = List.of("John", "Mary", "David");
       List<String> upper =  name.stream().map(String::toUpperCase)
               .collect(Collectors.toList());


        System.out.println(upper);


        System.out.println("Filter Strings by length");
        List<String> names1 = List.of("Java", "Spring", "AI", "Docker");
        List<String> filterbyLength = names1.stream()
                .filter(val -> val.length()>5)
                .collect(Collectors.toList());

        System.out.println(filterbyLength);

        System.out.println("Flatten Strings into Characters");
        List<String> words = List.of("Java", "Stream");

        List<Character> flatten = words.stream()
                .flatMap(wo -> wo.chars()
                        .mapToObj(c1 -> (char)c1)).collect(Collectors.toList());


        System.out.println(flatten);

        System.out.println("parallel");
        IntStream.rangeClosed(1,10)
                        .parallel()
                                .forEach(System.out::println);


        System.out.println("parallelStream");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.parallelStream().forEach(System.out::println);


    }
}
