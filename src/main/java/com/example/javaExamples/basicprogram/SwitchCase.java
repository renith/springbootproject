package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option::");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiple");
        System.out.println("4 - Division");
        int option = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        switch (option) {
            case 1: {
                c = a + b;
                System.out.println(c);
                break;
            }
            case 2: {
                c = a-b;
                System.out.println(c);
                break;
            }
            default:{
                System.out.println("default");
            }
        }


    }

}
