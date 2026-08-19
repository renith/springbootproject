package com.example.JavaExamples.basicprogram;

import java.util.stream.IntStream;

public class SinglePrimeNumber {
    public static void main(String[] args) {
        int n = 17;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }

        }if(count == 2){
               System.out.println(n +" is prime Number ");
        }else{
            System.out.println(n+ " is not prime Number");
        }


        System.out.println("using stream");
        boolean response = IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count() == 2;
        if(response){
            System.out.println(n+" is prime Number");
        }else{
            System.out.println(n+ " is not prime Number");
        }


    }
}
