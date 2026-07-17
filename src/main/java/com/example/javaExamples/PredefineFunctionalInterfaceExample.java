package com.example.javaExamples;


import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredefineFunctionalInterfaceExample {
    public static void main(String[] args) {


        //Predicate - test()
        Predicate<Integer> filter = x -> x%2 ==0;
        System.out.println(filter.test(4));


        //Function - apply()
        Function<Integer, Integer> map = x -> x;
        System.out.println(map.apply(3));

        //Consumer - accept()
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(2);

        //BiPredicate
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>b;
        System.out.println(biPredicate.test(2,5));

        //BiFunction
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a*b;
        System.out.println(biFunction.apply(2,4));

      //BiConsumer
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a +" "+b);
        biConsumer.accept(3,5);


//real-time example
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> filterr = x -> x%2 ==0;
        Function<Integer, Integer> mapp =   x -> x;
        Consumer<Integer> consumer = printt -> System.out.println(printt);

        list.stream().filter(filterr).map(mapp).forEach(consumer);





    }
}
