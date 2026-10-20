package com.example.JavaExamples.stream;

import com.example.JavaExamples.singleton.SingletonUsingEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.print.DocFlavor;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWithNumber {

    private static final Logger log =
            LoggerFactory.getLogger(StreamWithNumber.class);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 2, 7, 3, 5, 6, 9, 10);

        //to convert array object to list of array
        int[] li = {6, 7, 3, 5, 10, 30, 20, 60, 80, 40};
        List<Integer> list1 = Arrays.stream(li).boxed().toList();


        //find the even number

        System.out.println("evenNumber");
        List<Integer> evenNumber = list.stream()
                .filter(x -> x % 2 == 0).toList();
        System.out.println(evenNumber);

        //sorting as ASC
        System.out.println("sortedASC");
        List<Integer> sortedAsc = list.stream().sorted().toList();
        System.out.println(sortedAsc);

        //sorted as DESC

        System.out.println("sortedDesc");
        List<Integer> sortedDesc = list.stream().sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedDesc);

        //To Find duplicate


        System.out.println("duplicate");
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicate = list.stream().filter(x -> !seen.add(x)).toList();
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
        List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(top3);


        //sum
        System.out.println("sum");
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

        //sum using reduce
        System.out.println("sum using reduce::");
        int sum1 = list.stream().reduce(0, Integer::sum);

        System.out.println(sum1);

        //average
        System.out.println("average");
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);

        System.out.println(average);
        //max
        System.out.println("max");
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        System.out.println(max);


        //min
        System.out.println("min");
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println(min);

        //count even no
        System.out.println("count even no");
        List<Integer> countEvenNo = list.stream()
                .filter(x -> x % 2 == 0).toList();
        System.out.println(countEvenNo);


        //count
        System.out.println("count");
        long count = list.stream().count();

        System.out.println(count);


        //even number from the list
        System.out.println("even number");
        List<Integer> evenNumbers = list.stream()
                .filter(x -> x % 2 == 0).toList();
        System.out.println(evenNumbers);


        //square of number
        System.out.println("square of number");
        List<Integer> squareOfNumber = list.stream().map(x -> x * x).toList();
        System.out.println(squareOfNumber);


        //even number using predicate
        System.out.println("even number using predicate");

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> map = x -> x;
        Consumer<Integer> print = x -> System.out.println(x);


        list.stream().filter(predicate).map(map).forEach(print);


        //BII
        System.out.println("BII");
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + " " + b);


        //partition list into evn and add
        System.out.println("partition");
        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(partition);

        //To find missing No
        System.out.println("To find missing No from the list");
        int n = 10;
        List<Integer> list2 = Arrays.asList(2, 5, 1, 7, 8);
        List<Integer> missingNo = IntStream.rangeClosed(1, n)
                .filter(x -> !list2.contains(x))
                .boxed()
                .toList();
        System.out.println(missingNo);

        //or

        System.out.println("Another Option");
        IntStream.rangeClosed(1, n)
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));


        //parallel()
        System.out.println("parallel()");
        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(System.out::println);


        //parallelStream()
        System.out.println("parallelStream()");
        list.parallelStream().forEach(System.out::println);


        System.out.println("Using Stream");
        Stream<Integer> stream = Stream.of(2, 4, 5);
        stream.forEach(System.out::println);


        List<Integer> numbers = List.of(1, 2, 3);
        System.out.println("using peek");


        // peek() - Debugging Stream Operations
        list.stream().peek(p -> System.out.println("peek::" + p))
                .forEach(System.out::println);
        list.stream().peek(p -> System.out.println("peek::" + p));// No output

        //peek example
        list.stream().filter(x -> x%2 == 0)
                .peek(p -> System.out.println("peek::"+p))
                .forEach(System.out::println);


    }
}
