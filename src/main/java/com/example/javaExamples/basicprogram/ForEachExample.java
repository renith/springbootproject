package com.example.javaExamples.basicprogram;

import java.util.Scanner;

public class ForEachExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {12,13,14,15,16};
        int max = n[0];
        for(int i = 0; i<n.length; i++){
            if(n[i]>max)
                max = n[i];
        }
        System.out.println(max);

    }
}
