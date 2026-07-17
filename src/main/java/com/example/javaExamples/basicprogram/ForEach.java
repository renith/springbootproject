package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n::");
        // int a[] = {12,13,14,15};
        int a[] = new int[5];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}
