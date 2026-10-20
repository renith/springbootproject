package com.example.JavaExamples.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedHashMap {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(4, "aaa");
        map.put(1, "bb");
        map.put(6, "yyy");
        map.put(23, "jj");
        map.put(25, "iii");
        map.put(1, "bbb");


        // sorted by key
        System.out.println("Sorted by key");
        Map<Integer,String> sortedByKey = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1,e2) -> e1,
                                        LinkedHashMap::new

                                ));
        System.out.println(sortedByKey);


        System.out.println("Sorted by Values ASC");
        Map<Integer, String> sortedByValuesAsc = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1,e2) -> e1,
                                LinkedHashMap::new
                        ));


        System.out.println(sortedByValuesAsc);

        System.out.println("Sorted by Values DESC");
        Map<Integer,String> sortedByValuesDesc = map.entrySet().stream()
                        .sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1,e2) -> e1,
                                        LinkedHashMap::new
                                ));


        System.out.println(sortedByValuesDesc);
    }
}
