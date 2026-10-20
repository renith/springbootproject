package com.example.JavaExamples.basicprogram;

import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValues {
    public static void main(String[] args) {
        int[] n = {3, 2, 1, 7, 9};

        int max = n[0];

        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }


        System.out.println(max);
        System.out.println("Using stream::");

        List<Integer> list = Arrays.stream(n).boxed().toList();
        Optional<Integer> max1 = list.stream().max(Integer::compareTo);

        System.out.println(max1);


    }
}
