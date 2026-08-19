package com.example.JavaExamples.basicprogram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayExample {
    public static void main(String[] args) {

        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Using loop::");
    /*    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
*/
        System.out.println("Using Stream::");
        // Read Value
        IntStream.range(0,n).forEach(i -> arr[i] = sc.nextInt());

        //Print Value
        IntStream.of(arr).forEach(i -> System.out.println(i));
    }
}
