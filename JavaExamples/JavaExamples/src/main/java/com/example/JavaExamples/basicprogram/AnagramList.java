package com.example.JavaExamples.basicprogram;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat", "bat"
        );

        Collection<List<String>> anagram = list.stream()
                .collect(Collectors.groupingBy(word -> {
                            char[] c = word.toCharArray();
                            Arrays.sort(c);
                            return new String(c);
                        }
                )).values();
        System.out.println(anagram);


    }
}
