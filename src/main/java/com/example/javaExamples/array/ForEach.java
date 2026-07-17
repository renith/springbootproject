package com.example.javaExamples.array;

import java.util.Scanner;

public class ForEach {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n::");
        // int a[] = {12,13,14,15};
       int[] a = new int[10];
     int n = sc.nextInt();

     for(int i=0; i<n; i++){
         a[i] = sc.nextInt();

     }
     for(int i =0;i<n;i++){
         System.out.print(a[i]);

     }
    }
}
