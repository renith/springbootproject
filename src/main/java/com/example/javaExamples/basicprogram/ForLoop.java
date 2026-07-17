package com.example.javaExamples.basicprogram;

import java.util.Scanner;
// print the even number from given input
public class ForLoop {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n::");
       int n = sc.nextInt();
       int a = -1,b = 1,c;
       for(int i = 1; i< n; i++){
           c = a+b;
           System.out.println(c);
         a= b;
         b =c;

       }
    }
}
