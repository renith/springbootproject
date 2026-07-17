package com.example.javaExamples.basicprogram;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;
import java.util.stream.IntStream;

//prime Number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N::");
        int n = sc.nextInt();
        //using normal for loop

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }

            }
            if (count == 2) {
                System.out.println(i);
            }

        }


        System.out.print("Prime No::");
        IntStream.rangeClosed(1, n).filter(i -> IntStream.rangeClosed(1, i).filter(j -> i % j == 0).count() == 2).forEach(System.out::println);


    }
}
