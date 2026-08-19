package com.example.JavaExamples.basicprogram;

import java.util.stream.IntStream;

public class NPrimeNumbers {
    public static void main(String[] args) {

        int n = 17;
        int count;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count+1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        System.out.println("Using stream");
        IntStream.rangeClosed(1,n).filter(i -> IntStream.rangeClosed(1,i).filter(j -> i%j ==0).count() ==2)
                .forEach(System.out::println);
    }
}
