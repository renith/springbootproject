package com.example.javaExamples.sortingandremoveduplicate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateSorting {

    public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,10,2,3,9,8,4,5,6);

               // sorted(Asc) and removed duplicate Using Stream

        System.out.println("sorted(Asc) and removed duplicate Using Stream");
        List<Integer> sortedAsc = list.stream().sorted().distinct().collect(Collectors.toList());
        sortedAsc.forEach(System.out::println);

        //sorted(Desc) and removed duplicate Using Stream

        System.out.println("sorted(Desc) and removed duplicate Using Stream");
        List<Integer> sortedDesc = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct().collect(Collectors.toList());

        sortedDesc.forEach(System.out::println);


        //Top 2
        System.out.println("using limit 2");
        List<Integer>  limit = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct().limit(2)
                .collect(Collectors.toList());

        limit.forEach(System.out::println);


    }
}
