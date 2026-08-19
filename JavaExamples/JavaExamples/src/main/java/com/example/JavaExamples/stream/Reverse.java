package com.example.JavaExamples.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {

    public static void main(String[] args) {


        String str = "Hello Technology";

        System.out.println("Reverse using StringBuffer");
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);

        System.out.println("reverse using loop");
        char[] c = str.toCharArray();
        for (int i = c.length -1; i >= 0; i--) {
            System.out.print(c[i]);
        }
        System.out.println();
        System.out.println("reverse using stream");
        String reverse1 = IntStream.range(0, str.length())
                        .mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 -i)))
                                .collect(Collectors.joining());


                System.out.println(reverse1);


    }
}
