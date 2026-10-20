package com.example.JavaExamples.basicprogram;

import java.util.Scanner;

public class Palondrome {
    public static void main(String[] args) {

        System.out.println("Enter n::");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int original = n, s=0,r;

       while (n>0){
           r = n%10;
           s= s*10+r;
           n = n/10;
       }
       if(original ==s){
           System.out.println("palondrom");
       }else {
           System.out.println("not palondrome");
       }

    }
}
