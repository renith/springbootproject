package com.example.JavaExamples.stream;


import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWithCharacter {

    public static void main(String[] args) {
        String str = "aabcabcrg";

        //count the character
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println("map iteration");
        System.out.println(map);
        //map entrySet Iteration
        System.out.println("map entrySet Iteration");
        map.entrySet().stream().forEach(val -> System.out.println(val.getKey()+" "+val.getValue()));

        //map only forEach Iteration
        System.out.println("map only forEach Iteration");
        map.forEach((key,values) -> System.out.println(key +" "+values));


        //repeated Character
        System.out.println("repeated-character::");
        map.entrySet().stream().filter(val -> val.getValue() >1).forEach(System.out::println);

        //non-repeated character
        System.out.println("non-repeated-character");
        map.entrySet().stream().filter(val -> val.getValue() == 1).forEach(System.out::println);


        //find first non-repeated character
        System.out.println("firstNonRepeatedChar");
        Optional<Character> firstNonRepeatedChar = map.entrySet().stream()
                .filter(val -> val.getValue() ==1).map(Map.Entry::getKey).findFirst();

        System.out.println(firstNonRepeatedChar);


        //anyMatch
        System.out.println("anyMatch");
       boolean anyMatch =  map.entrySet().stream()
               .anyMatch(val -> val.getValue().equals(map.values().iterator().next()));

        System.out.println(anyMatch);

        //To find max letter from the string

        String stir = "programmiom";
        Map<Character,Long> map1 = stir.chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map1);

        System.out.println("Max character in string");
        Optional<Character> max = map1.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
        System.out.println(max);

        char[] c = {'a', 'G', 'f', 'o', 'G', 'F', 'X'};

        System.out.println("index of lowercase");
        //To find index of small letter

        new String(c).chars().filter(Character::isLowerCase)
                        .forEach(ch -> System.out.println((char) ch +" "+(ch - 'a' +1 )));

        System.out.println("index of uppercase");
        //To find index of capital letter
        new String(c).chars().filter(Character::isUpperCase)
                .forEach(ch -> System.out.println((char)ch +" "+ (ch  - 'A' +1)));


        //how to find missing alphabets from below char

        char[] c1 = {'c', 'd', 'e'};

        System.out.println("Missing Characters");
        Set<Integer> present = new String(c1).chars().boxed().collect(Collectors.toSet());

        IntStream.rangeClosed('a', 'z')
                .filter(ch1 -> !present.contains(ch1)).forEach(val -> System.out.println((char)val));

        String st = "GFJabcty3762829";

        System.out.println("Lowercase");
        st.chars().filter(Character::isLowerCase).forEach(val -> System.out.println((char)val));

        System.out.println("Uppercase");
        st.chars().filter(Character::isUpperCase).forEach(val -> System.out.println((char)val));


        System.out.println("Digits");
        st.chars().filter(Character::isDigit).forEach(val -> System.out.println((char)val));


        System.out.println("Letters");
        st.chars().filter(Character::isLetter).forEach(val -> System.out.println((char)val));


    }
}
