package com.example.javaExamples.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SortedSet {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(3);
        set.add(2);
        set.add(9);
        List<Integer> list = new ArrayList<>(set);



        //SortedASC
        System.out.println("SortedASC");
        List<Integer> sortedAsc = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedAsc);

        //SortesDesc
        System.out.println("sortesDesc");
        List<Integer> sortedDesc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedDesc);
    }
}
