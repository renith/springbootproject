package com.example.javaExamples.sortingandremoveduplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemovingDuplicateUsingArray {

    public static void main(String[] args) {
        int[] c = {1,2,5,4,4,5,5};

     Set<Integer> set = new TreeSet<>();
     for(int i = 0;i<c.length; i++){
         set.add(c[i]);
     }

     set.stream().forEach(val ->{
         System.out.println(val);
     });

     List<Integer> list = Arrays.stream(c).boxed()
             .sorted()
             .distinct()
             .collect(Collectors.toList());
System.out.println("list sorting");
        list.forEach(System.out::println);

    }
}
