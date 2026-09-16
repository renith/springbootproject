package com.example.JavaExamples.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee1 {

    int id;
    String name;
    String address;
    long salary;

    public Employee1(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
