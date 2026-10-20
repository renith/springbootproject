package com.example.JavaExamples.stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredefineFunctionalInterfaceExample {
    public static void main(String[] args) {


        //Predicate - test()
        Predicate<Integer>  filter = x -> x%2 ==0;
        System.out.println(filter.test(4));

        //Function - apply()
        Function<Integer, Integer> map = x -> x;
        System.out.println(map.apply(5));

//Consumer - accept()
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(9);

        //BiPredicate
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>b;
        System.out.println(biPredicate.test(5,3));

        //BiFunction
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a*b;
        System.out.println(biFunction.apply(7,6));

        //BiConsumer
        BiConsumer<Integer,Integer> biConsumer =  (a ,b) -> System.out.println(a +" "+b);
        biConsumer.accept(7,9);

        //real-time example
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> filter1 =  x -> x%2 ==0;
        Function<Integer,Integer> map1 = x -> x;
        Consumer<Integer> print1 = x -> System.out.println(x);

        list.stream().filter(filter1).map(map1).forEach(print1);



    }
}
