package com.example.javaExamples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {

}

public class ListUsingStream {

    public static void main(String args[]) {
        List<String> list = Arrays.asList("Soap", "Shampoo", "Apple");

        //populate list which is start with S
        List<String> filtered = list.stream().filter(val -> val.startsWith("S")).collect(Collectors.toList());


        System.out.println(filtered);

        //count the string with contains stsrt with S
        long count = list.stream().filter(val -> val.startsWith("S")).count();
        System.out.println(count);

    }
}
