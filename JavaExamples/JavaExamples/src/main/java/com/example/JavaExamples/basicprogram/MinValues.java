package com.example.JavaExamples.basicprogram;

public class MinValues {

    public static void main(String[] args) {
        int[] n = {3,2,1,7,9};

        int min = n[0];
        for(int i =0; i<n.length; i++){
            if(min>n[i]){
                min = n[i];
           }
        }
        System.out.println(min);
    }
}
