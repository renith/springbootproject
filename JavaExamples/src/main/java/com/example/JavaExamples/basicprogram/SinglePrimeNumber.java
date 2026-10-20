package com.example.JavaExamples.basicprogram;

import java.awt.desktop.SystemSleepEvent;
import java.util.stream.IntStream;

public class SinglePrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }

        }
        if (count == 2) {
            System.out.println(n + " prime No");
        } else {
            System.out.println(n + " not primr no");
        }


        System.out.println("using stream");

        boolean res = IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0).count() == 2;
        if (res) {
            System.out.println("prime no");
        } else {
            System.out.println("not prime no");
        }

    }
}
