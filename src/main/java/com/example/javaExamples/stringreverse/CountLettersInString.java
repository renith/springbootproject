package com.example.javaExamples.stringreverse;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountLettersInString {
    public static void main(String[] args) {
        System.out.println("Enter String::");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        //trim the space

        String trim = in.replaceAll(" ","");
        char[] c = trim.toCharArray();

        for(int i =0; i<c.length; i++){
            int count =0;
            for(int j =0;j<c.length ;j++){
                 if(c[i] == c[j]){
                    count = count+1;
                 }

            }
            String ch = String.valueOf(c[i]);


            map.put(ch,count);

        }

System.out.println("input string");
        System.out.println(map);

        // count each character using stream grouping
        String s = "abbvgass";
       Map<Character,Long> map1 = s.chars()
               .mapToObj(c1 -> (char) c1)
               .collect(Collectors.groupingBy(
                       Function.identity(),
                       LinkedHashMap::new,
                       Collectors.counting()
               ));


        //map iteration
        map.entrySet().stream().forEach(val -> {
            System.out.println(val.getKey() + " " + val.getValue());
        });

        //check all character count is same or not then  return true or false using java7
        int firstValue = map.values().iterator().next();
        boolean result1 = true;
        for(int val: map.values()){
            if(val!=firstValue){
                result1 = false;
                break;
            }
        }
        System.out.println(result1);


        // check all char count is same using Java 8
     boolean result = map.entrySet().stream().allMatch(v -> v.equals(map.values().iterator().next()));

       System.out.println("check all char count is same using Java 8");
       System.out.println(result);

    }
}
