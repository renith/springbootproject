package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input::");
        int n = sc.nextInt();
        int s = 0;

        if (n > 5) {
            s = n + 2;
            System.out.println("output::" + s);
        }
    }
}
