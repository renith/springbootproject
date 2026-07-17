package com.example.javaExamples.basicprogram;

import java.util.Scanner;

// biggest of 2 number
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b::");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a is biggest number");
        } else {
            System.out.println("b is biggest number");
        }
    }
}
