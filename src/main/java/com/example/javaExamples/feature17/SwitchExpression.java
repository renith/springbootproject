package com.example.javaExamples.feature17;

public class SwitchExpression {
    public static void main(String[] args) {

int day = 2;
String result = switch (day){

    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "other";
};
System.out.println(result);
    }
}
