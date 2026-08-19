package com.example.JavaExamples.basicprogram;

import java.util.Scanner;

public class Palondrome {
    public static void main(String[] args) {

        System.out.println("Enter n::");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int r, s = 0;

        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (original == s) {
            System.out.println("Palondrome");
        }else{
            System.out.println("Not Palondrome");
        }
    }
}
