package com.example.javaExamples.basicprogram;

import java.util.Scanner;
// Biggest of 3 Number
public class ElseIfLadder {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a,b and c::");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is biggest number");
        }else if(b>c){
            System.out.println("b is biggest number");
        }else{
            System.out.println("c is biggest number");
        }


    }
}
