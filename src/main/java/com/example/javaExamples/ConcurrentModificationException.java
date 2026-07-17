package com.example.javaExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{

    int id;
    String name;
    String address;
    long salary;
    Employee(int id,String name, String address,long salary){
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class ConcurrentModificationException {
    public static void main(String args[]){
        List<Employee> emp = Arrays.asList(
                new Employee(1,"jestin","saligrammam",50000),
                new Employee(2,"Ashok","kk nagar",60000),
                new Employee(3,"kumaresan","mugaporru",70000));
        List<String> result = emp.stream()
                .filter(s ->s.getSalary()>2000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(result);

        //max of salary using stream Api
        long max = emp.stream().max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary).orElse(0L);

        //fetch object based on max salary
        Optional<Employee> em = emp.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(em);


        //min using stream Api
         long min = emp.stream().min(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary).orElse(0L);
         System.out.println("Min");
        System.out.println(min);
    }

}
