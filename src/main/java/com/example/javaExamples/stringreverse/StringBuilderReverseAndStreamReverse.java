package com.example.javaExamples.stringreverse;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringBuilderReverseAndStreamReverse {
    public static void main(String[] args) {
        System.out.println("Enter String::");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
      //This is the classic way
String reversed = new StringBuffer("hello").reverse().toString();
        System.out.println("reversed (StringBuilder):: "+reversed);
        //Using java Stream
        String reversedWithStream = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
                    Collections.reverse(list);
                    return  list.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
                }
                ));
        System.out.println("reversedWithStream::" + reversedWithStream);


    }
}
