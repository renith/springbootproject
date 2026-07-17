package com.example.javaExamples.stringreverse;

import java.util.HashMap;

public class Example {

    public static void main(String[] args) {
        String s = "abcabcabcxuyd";

        char[] c = s.toCharArray();
        int count;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0 ;i<c.length; i++){
            count =0;
            for(int j=0;j<c.length; j++){

                if(c[i] == c[j]){
                    count = count +1;
                }

            }
            String val = String.valueOf(c[i]);
            map.put(val,count);
        }

        map.entrySet().stream().forEach(val -> {
            System.out.println(val.getKey()+"--"+val.getValue());
        });
    }
}
