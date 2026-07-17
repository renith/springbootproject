package com.example.javaExamples.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

    public static void main(String[] args) {

        String str = "wipro Technology";

        System.out.println("reversed using stringBuffer");
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println(reverse);

        System.out.println("reversed using stream");
        String streamReverse = IntStream.range(0, str.length())
                        .mapToObj(i -> String.valueOf(str.charAt(str.length() -1 -i)))
                                .collect(Collectors.joining());

        System.out.println(streamReverse);

        System.out.println("reversed using loop");

        char[] ch = str.toCharArray();
        for(int i = ch.length -1; i<=0; i--){
            System.out.println(ch[i]);
        }



        System.out.println();
    }
}
