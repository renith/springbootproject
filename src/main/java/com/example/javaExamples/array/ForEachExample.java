package com.example.javaExamples.array;

import java.util.Scanner;

// to find maximum number
public class ForEachExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {12, 13, 14, 15, 16};
        int max = list[0];
       // int n = sc.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }

        }
        System.out.print(max);
    }
}
