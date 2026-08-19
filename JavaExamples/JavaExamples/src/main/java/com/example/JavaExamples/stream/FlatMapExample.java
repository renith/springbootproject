package com.example.JavaExamples.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(4, 3),
                Arrays.asList(5, 9),
                Arrays.asList(6, 9),
                Arrays.asList(7, 2));

        //flatMap sorted ASC
        System.out.println("sorted ASC");
        List<Integer> sortedAsc = listOfList.stream()
                .flatMap(List::stream)
                .sorted()
                .toList();

        System.out.println(sortedAsc);

        //flatMap sorted Desc
        System.out.println("sorted DESC");
        List<Integer> sortedDesc = listOfList.stream()
                .flatMap(List::stream)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedDesc);
    }
}
