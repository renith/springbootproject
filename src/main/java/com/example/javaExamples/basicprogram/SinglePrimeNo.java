package com.example.javaExamples.basicprogram;

import java.util.stream.IntStream;

public class SinglePrimeNo {
    public static void main(String[] args) {
        int n = 17;

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("Prime No");
        } else {
            System.out.println("Non-Prime No");
        }
           System.out.println("Prime No using Stream");


        boolean result = IntStream.rangeClosed(1, n)
                .filter(i -> n%i == 0).count() ==2;
        if(result){
            System.out.println("Prime No");
        }else {
            System.out.println("Non-PrimeNo");
        }


    }

}
