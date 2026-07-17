package com.example.javaExamples.basicprogram;



public class AmstrongNo {

    public static void isAmstongNo(int n){

        int original =n, r, s =0;
      while (n>0){
          r = n%10;
          s =s+ (int) Math.pow(r,3);
          n = n/10;
      }
        if(original == s){
            System.out.println("Amstrong");
        }else{
            System.out.println("Non-Amstrong");
        }
        }

    public static void main(String[] args) {

        AmstrongNo.isAmstongNo(123);
        AmstrongNo.isAmstongNo(153);   // Armstrong
        AmstrongNo.isAmstongNo(370);   // Armstrong
       // AmstrongNo.isAmstongNo(9474);  // Armstrong
      //  AmstrongNo.isAmstongNo(123);
    }
}
