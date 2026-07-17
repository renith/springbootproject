package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter N::");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
   int a =-1,b =1,c;
   for(int i =1;i<=n;i++){
       c = a+b;
       System.out.print(" "+c);
       a =b;
       b= c;
   }


    }

}
