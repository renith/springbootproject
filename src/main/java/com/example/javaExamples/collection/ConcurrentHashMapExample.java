package com.example.javaExamples.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"reni");
        map.put(2,"abi");
        map.put(6,"lita");

map.remove(2);
map.entrySet().stream().forEach(val -> {
    System.out.println(val.getKey() +" "+ val.getValue());
});

    }
}
