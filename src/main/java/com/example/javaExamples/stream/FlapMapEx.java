package com.example.javaExamples.stream;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.AnnotatedType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMapEx {
    public static void main(String[] args) {

        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(4, 3),
                Arrays.asList(5, 9),
                Arrays.asList(6, 9),
                Arrays.asList(7, 2));

        //sortedASC
        System.out.println("sortedASC");
        List<Integer> sortedASC = listOfList.stream().flatMap(List::stream).sorted().collect(Collectors.toList());


        System.out.println(sortedASC);


        //sortedDesc
        System.out.println("sortedDesc");
        List<Integer> sortedDesc = listOfList.stream().flatMap(List::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        System.out.println(sortedDesc);
    }
}
