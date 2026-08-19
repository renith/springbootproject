package com.example.JavaExamples.basicprogram;

public class AmstrongNumber {

    public static boolean amstrong(int n){

        int original =n,r, s=0;
        while (n>0){
            r = n%10;
            s= s + (int) Math.pow(r, 3);
            n = n/10;
        }
        if(original == s){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(amstrong(153)); //amstrong
        System.out.println(amstrong(123)); //non amstrong
        System.out.println(amstrong(370)); //amstrong
        System.out.println(amstrong(371)); //amstrong

    }
}
