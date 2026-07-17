package com.example.javaExamples.basicprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinNoInArray {

    public static void main(String[] args) {
        int[] a = {5, 1, 7, 9, 6};

       /* int min = a[0];
        for(int i=0 ;i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);*/

        //min
        List<Integer> minList = Arrays.stream(a).boxed().collect(Collectors.toList());

        Optional<Integer> minStream = minList.stream().min(Integer::compare);
        System.out.println(minStream);


    }
}
