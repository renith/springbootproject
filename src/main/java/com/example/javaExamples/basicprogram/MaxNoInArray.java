package com.example.javaExamples.basicprogram;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxNoInArray {
    public static void main(String[] args) {
        int[] in = {1, 6, 4, 9, 6};

        int max = in[0];
        for (int i = 0; i < in.length; i++) {
            if (max < in[i]) {
                max = in[i];

            }

        }
        System.out.println(max);

        System.out.println("Max using stream");

        List<Integer> list = Arrays.stream(in).boxed().collect(Collectors.toList());

        Optional<Integer> maxStream = list.stream().max(Integer::compare);
        System.out.print(maxStream);

    }
}
