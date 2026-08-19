package com.example.JavaExamples.stream;

import java.util.*;

public class SortedSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(3);
        set.add(2);
        set.add(9);

List<Integer> list = new ArrayList<>(set);
        System.out.println("sortedASC");
        List<Integer> sortedAsc = list.stream().sorted()
                        .toList();
        System.out.println(sortedAsc);

        System.out.println("sortedDesc");
        List<Integer> sortedDesc = list.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(sortedDesc);
    }
}
