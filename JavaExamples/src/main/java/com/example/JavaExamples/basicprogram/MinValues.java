package com.example.JavaExamples.basicprogram;

import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinValues {

    public static void main(String[] args) {
        int[] n = {3, 2, 1, 7, 9};

        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];

            }

        }

        System.out.println(min);

        System.out.println("using stream");
        List<Integer> list = Arrays.stream(n).boxed().toList();

        Optional<Integer> min1 = list.stream().min(Integer::compareTo);
        System.out.println(min1);
    }
}
