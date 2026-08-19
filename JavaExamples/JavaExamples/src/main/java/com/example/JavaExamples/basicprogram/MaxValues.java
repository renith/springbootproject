package com.example.JavaExamples.basicprogram;

public class MaxValues {
    public static void main(String[] args) {
        int[] n = {3,2,1,7,9};

        int max = n[0];
        for(int i =0; i<n.length; i++){
            if(max<n[i]){
                max = n[i];
            }
        }
        System.out.println(max);


    }
}
