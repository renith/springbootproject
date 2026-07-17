package com.example.javaExamples.stream;


import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExampleWithNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(90, 10, 50, 30, 10, 20, 5, 3, 3, 4, 5);

        int[] li = {90, 10, 50, 30, 10, 20, 5, 3};
        List<Integer> lis = Arrays.stream(li).boxed().collect(Collectors.toList());


        //To Convert  int array to list of integer

        // to find duplicate element in list
        System.out.print("Duplicate::");
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicate = list.stream().filter(num -> !seen.add(num)).collect(Collectors.toList());

        System.out.print(duplicate);


        //sorting ASC
        System.out.println("sortedAsc");
        List<Integer> sortedAsc = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedAsc);

        //sorted Desc
        System.out.println("sortedDesc");
        List<Integer> sortedDesc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedDesc);

        //Distinct
        System.out.println("unique");
        List<Integer> unique = list.stream().distinct().collect(Collectors.toList());

        System.out.println(unique);

        //Second Highest salary
        System.out.println("Secong highest salary");
        Optional<Integer> secHighestSalary = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secHighestSalary);


        //Top 3
        System.out.println();
        System.out.println("Top 3");
        List<Integer> top3 = list.stream().sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());

        System.out.println(top3);

        //sum
        System.out.println("sum");
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("sum using reduce()");
        int sumreduce = list.stream().reduce(0, Integer::sum);
        System.out.println(sumreduce);


        //average
        System.out.println("average");
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println(average);

        //max
        System.out.println("max");
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        System.out.println(max);

        //Min
        System.out.println("Min");
        Optional<Integer> min = list.stream().min(Integer::compareTo);

        System.out.println(min);


        //count even no
        System.out.println("countEvenNo");
        long countEvenNo = list.stream().filter(num -> num % 2 == 0).count();

        System.out.println(countEvenNo);


        //count
        System.out.println("count");
        long count = list.stream().count();
        System.out.println(count);


        //even number from the list
        System.out.println("Even No");
        List<Integer> evenNo = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNo);


        // Square of Number
        System.out.println("Square");
        List<Integer> square = list.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(square);


        //predicate
        System.out.println("even no using predicate");
        Predicate<Integer> filter = x -> x % 2 == 0;
        Function<Integer, Integer> map = x -> x * x;
        Consumer<Integer> print = x -> System.out.println(x);
        System.out.println(filter.test(2));
        System.out.println(map.apply(3));
        print.accept(5);

        System.out.println();
        System.out.println("BIII");

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + " " + b);
        System.out.println(biPredicate.test(4, 2));
        System.out.println(biFunction.apply(2, 3));
        biConsumer.accept(4, 6);


        //partition list into even and odd

        System.out.println("partition");
        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(partition);


        //To find missing no
        System.out.print("missing No::");
        int n = 10;
        List<Integer> lists = Arrays.asList(5, 4, 1, 9);
        List<Integer> missNo = IntStream.rangeClosed(1,n)
                .filter(num -> !lists.contains(num))
                .boxed()
                .collect(Collectors.toList());
        //or

        IntStream.rangeClosed(1,n)
                .filter(num -> !lists.contains(num))
                .forEach(System.out::println);


    }
}
