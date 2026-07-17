package com.example.javaExamples.stream;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.*;
import java.util.stream.*;

public class SortedHashMap1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "aaa");
        map.put(1, "bb");
        map.put(6, "yyy");
        map.put(23, "jj");
        map.put(25, "iii");
        map.put(1, "bbb");

        //sortedASC
        System.out.println("SortedASC");
        Map<Integer,String> sortedASC = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (e1,e2) -> e1,
                                        LinkedHashMap::new
                                ));


        System.out.println(sortedASC);


        // populate way 1

        //populate way2
      /*  map1.forEach((key,value) ->{
            System.out.println(key +" "+value);
        });*/

        //populate way3
       /* map1.entrySet().stream().forEach(val ->{
            System.out.println(val.getKey() +" " +val.getValue());
        });*/


        //sorted desc order

        System.out.println("SortedDESC");
        Map<Integer,String> sortedDESC = map.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));

        System.out.println(sortedDESC);

    }
}
