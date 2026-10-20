package com.example.JavaExamples.singleton;

public class SingletonEnum {
    public static void main(String[] args) {


        EnumSingleton obj1 = EnumSingleton.INSTANCE;
        EnumSingleton obj2 = EnumSingleton.INSTANCE;
        if(obj1 == obj2){
            System.out.println(true);

        }
    }
}
