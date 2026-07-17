package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class PalondromeWhileLoop {
    public static void main(String[] args) {

       System.out.println("Enter n::");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int s =0,original = n,r;
      while (n>0){
          r = n%10;
          s = s*10+r;
          n = n/10;
       }if(original ==s){
           System.out.println("palondrome");
       }else{
           System.out.println("Non-Palondrome");
        }

    }
}
