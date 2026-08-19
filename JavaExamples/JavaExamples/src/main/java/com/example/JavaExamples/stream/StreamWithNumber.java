package com.example.JavaExamples.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithNumber {

    private static final Logger log =
            LoggerFactory.getLogger(StreamWithNumber.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,2,7,3,5,6,9,10);

        //to convert array object to list of array
        int[] li = {6,7,3,5,10,30,20,60,80,40};
        List<Integer> lis = Arrays.stream(li).boxed().toList();


        //find the even number
        List<Integer> evenNumber = list.stream()
                .filter(x -> x%2 == 0)
                .toList();
        System.out.println("evenNumber");
        System.out.println(evenNumber);

        //sorting as ASC
        List<Integer> sortedAsc = list.stream()
                .sorted()
                .toList();

        System.out.println("sortedASC");
        System.out.println(sortedAsc);

        //sorted as DESC
        List<Integer> sortedDesc = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("sortedDesc");
        System.out.println(sortedDesc);

        //To Find duplicate
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicate = list.stream()
                .filter(num -> !seen.add(num)).toList();
        System.out.println("duplicate");
        System.out.println(duplicate);


        //Unique
        System.out.println("unique");
        List<Integer> unique = list.stream().distinct().toList();
        System.out.println(unique);

        //second highest salary
        System.out.println("secondHighestSalary");
        Optional<Integer> secondHighestSalary = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestSalary);

        //Top 3
        System.out.println("top3");
        List<Integer> top3 = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(top3);



        //sum
        System.out.println("sum");
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //sum using reduce
        System.out.println("sum using reduce::");
        int sum1 = list.stream().reduce(0,Integer::sum);
        System.out.println(sum1);

        //average
        System.out.println("average");
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average);
           //max
        System.out.println("max");
        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max);


        //min
        System.out.println("min");
        Optional<Integer> min = list.stream().min(Integer::compare);
        System.out.println(min);



        //count even no
        System.out.println("count even no");
        long countEvenNo = list.stream().filter(x -> x%2 ==0).count();
        System.out.println(countEvenNo);


        //count
        System.out.println("count");
        long count = list.stream().count();
        System.out.println(count);



        //even number from the list
        System.out.println("even number");
        List<Integer> evenNumbers = list.stream().filter(x -> x%2 ==0).toList();
        System.out.println(evenNumbers);



        //square of number
        System.out.println("square of number");
        List<Integer> squareOfNumber = list.stream().map(x -> x*x).toList();
        System.out.println(squareOfNumber);



        //even number using predicate
        System.out.println("even number using predicate");
        Predicate<Integer> filter = x -> x%2 ==0;
        Function<Integer,Integer>  map = x -> x*x;
        Consumer<Integer> print = x -> System.out.println(x);

        list.stream().filter(filter).map(map).forEach(print);


        //BII
        System.out.println("BII");
        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>b;
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a*b;
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+ " "+b);

        System.out.println(biPredicate.test(4,3));
        System.out.println(biFunction.apply(2,3));
        biConsumer.accept(1,5);


        //partition list into evn and add
        System.out.println("partition");
        Map<Boolean,List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(x -> x%2 ==0));
        System.out.println(partition);

        //To find missing No
        System.out.println("To find missing No from the list");
        int n = 10;
        List<Integer> list2 = Arrays.asList(2,5,1,7,8);
        List<Integer> missingNo = IntStream.rangeClosed(1,n)
                        .filter(num -> !list2.contains(num) )
                                .boxed()
                                        .toList();
        System.out.println(missingNo);

        //or

        System.out.println("Another Option");
        IntStream.rangeClosed(1,n)
                .filter(num -> !list2.contains(num))
                .forEach(System.out::println);


        //parallel()
        System.out.println("parallel()");
        IntStream.rangeClosed(1,10)
                .parallel()
                        .forEach(System.out::println);


        //parallelStream()
        System.out.println("parallelStream()");
        list.parallelStream()
                .forEach(System.out::println);

        System.out.println("Using Stream");
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println);


        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println("using peek");
        numbers.stream().peek(p -> System.out.println("peek num::"+p))
                .forEach(System.out::println);

        // peek() - Debugging Stream Operations
        numbers.stream().peek(p -> System.out.println("peek num::"+p)); // No output
       //peek example
        list.stream()
                .filter(num -> num % 2 == 0)
                .peek(num -> log.info("Even number: {}", num))
                .forEach(System.out::println);

    }
}
