package com.example.JavaExamples.basicprogram;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factorial {



    public static void main(String[] args) {

        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("using loop");
        int s = 1;
        for(int i =1 ;i<=n;i++){
            s = s*i;
        }
        System.out.println(s);

        System.out.println("Using Stream::");
        int s1 = 1;
      int response =  IntStream.rangeClosed(1,n).
                reduce(1, (a,b) -> a*b);
      System.out.println(response);

    }
}
