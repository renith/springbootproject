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
        List<String> flatToList = flapMap.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatToList);


        System.out.println("Flatten Strings into Characters");
        List<String> wordss = List.of("Java", "Stream");
        List<Character> flatMapRes = wordss.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char)c))
                        .toList();
        System.out.println(flatMapRes);


        System.out.println("Filter Strings by length");
        List<String> names1 = List.of("Java", "Spring", "AI", "Docker");
        List<String> filteredByLength = names1.stream().filter(val -> val.length()>5)
                .toList();
        System.out.println(filteredByLength);

        //Convert list to string or concatenate String
        System.out.println("joining");
        String joining = list.stream()
                .collect(Collectors.joining(" "));
        System.out.println(joining);

        //max string from the list of string
        System.out.println("Max list of String");
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println(max);

        //sortingASC
        System.out.println("sortingASC");
        List<String> sortedASC = list.stream()
                .sorted()
                .toList();
        System.out.println(sortedASC);


        //sortingDESC
        System.out.println("sortingDESC");
        List<String> sortingDESC = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortingDESC);

        //list to map
        System.out.println("listToMap");
        Map<String, Integer> listToMap = list.stream()
                .collect(Collectors.toMap(str -> str, str -> str.length()));
        System.out.println(listToMap);

        // convert list of string to uppercase
        System.out.println("UpperCase");
        List<String> uppercase = list.stream().map(String::toUpperCase).toList();
        System.out.println(uppercase);

        //filter start with j
        System.out.println("filter start with j ");
        List<String> filterByJ = list.stream()
                .filter(str -> str.startsWith("j"))
                .toList();
        System.out.println(filterByJ);

        //count  string with specificprefix
        System.out.println("count  string with specificprefix");
        long count = list.stream().filter(word -> word.startsWith("j")).count();
        System.out.println(count);

        //Check if Any Matches a condition

        //Group String by Length
        System.out.println("GroupingByLength");
        Map<Integer, List<String>> groupingByLength = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupingByLength);


        //Find Longest String
        System.out.println("Longest String");
        Optional<String> longestString = list.stream()
                .max(Comparator.comparing(String::length));

        System.out.println(longestString);

        //palindrome the list of string

        System.out.println("palindrome list");
        List<String> list3 = List.of("madam", "hello", "level", "java", "radar");
        List<String> plandrome = list3.stream()
                .filter(word -> word.equals(new StringBuffer(word).reverse().toString()))
                .toList();
        System.out.println(plandrome);

        System.out.println("reversed list of string");
        List<String> reverseList = list3.stream().map(word -> new StringBuffer(word).reverse().toString())
                .toList();
        System.out.println(reverseList);

       //reverse by character
        System.out.println("reverse by character");
        String str = "Hello world";
       String reversedByChar =  IntStream.range(0,str.length())
                       .mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 - i)))
                               .collect(Collectors.joining());
       System.out.println(reversedByChar);



        System.out.println("Reverse Word");
        String stri = "I'm in an interview now ----";
        // reverse by word . Ex: world hello

        String[] words = stri.split(" ");
        String reverseWord = IntStream.range(0, words.length)
                .mapToObj(i -> words[words.length - 1 - i])
                .collect(Collectors.joining(" "));
        System.out.println(reverseWord);

        //duplicate letter in the word. Example done well. Output is well

        System.out.println("duplicate letter in the word");
        String input = "done well";
        String[] string = input.split(" ");
        List<String> list2 = Arrays.stream(string).toList();

        list2.stream()
                .filter(word -> word.chars().distinct().count() < word.length())
                .forEach(System.out::println);

        //remove the word along with number
        System.out.println("remove the word along with number");
        String s2 = "I23 had c75 ver3y beautiful morning";
        String[] split = s2.split(" ");
        List<String> splitedList = Arrays.stream(split).toList();

        List<String> list4 = splitedList.stream()
                .filter(word -> !word.matches(".*\\d.*"))
                .toList();
        System.out.println(list4);


        //remove the word along with number and print the max word
        System.out.println("remove the word along with number and print the max word");

        Optional<String> maxWord = splitedList.stream()
                .filter(word -> !word.matches(".*\\d.*"))
                .max(Comparator.comparing(String::length));

        System.out.println(maxWord);



        System.out.println("Remove null values from a list using filter");
        List<String> wordsList = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> responseList = wordsList.stream()
                        .filter(Objects::nonNull)
                                .toList();
        System.out.println(responseList);


        System.out.println("print the vowels in a string");
        String str1 = "Hello World";

        str1.chars().filter(cha -> "aeiou".indexOf(cha) !=-1)
                        .forEach(cha -> System.out.println((char)cha));


        System.out.println("count the number of vowels in a string");
       long count1 =  str1.chars().filter(cha -> "aeiou".indexOf(cha) != -1).count();
       System.out.println(count1);


    }
}
