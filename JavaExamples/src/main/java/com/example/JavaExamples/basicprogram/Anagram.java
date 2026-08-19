package com.example.JavaExamples.basicprogram;

import java.util.Arrays;

public class Anagram {

    public static boolean anagram(String s1, String s2){

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        System.out.println(anagram("cat","act"));
        System.out.println(anagram("abc","cdf"));
    }
}
