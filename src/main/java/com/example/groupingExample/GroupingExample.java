package com.example.groupingExample;


import com.example.modelemployee.Users;

import java.util.*;
import java.util.stream.Collectors;


public class GroupingExample {
    public static void main(String[] args) {

        List<Users> list = Arrays.asList(new Users(1, "Renith", "renithdayana@gmail.com"),
                new Users(2, "Dayana", "dayana.renith@gmail"),
                new Users(3, "liya", "liya@gmail.com"),
                new Users(4, "gan", "gane@gmail.com"),
                new Users(5, "anu", "laya@gmail.com"),
                new Users(5, "anu", "laya@gmail.com"));

        Map<Character,List<Users>> grouped = list.stream().collect(Collectors.groupingBy(
                e -> Character.toLowerCase(e.getEmail().charAt(0))
        ));

        System.out.println(grouped);


        System.out.println("EmailID");
        List<String> emailId = list.stream().map(Users::getEmail)
                        .distinct()
                                .collect(Collectors.toList());


        System.out.println(emailId);

        //or
        System.out.println("Return object");
        Set<String> emails = new HashSet<>();

        List<Users> uniqueEmployees = list.stream().filter(us -> emails.add(us.getEmail())).toList();
        System.out.println(uniqueEmployees);


    }
}
