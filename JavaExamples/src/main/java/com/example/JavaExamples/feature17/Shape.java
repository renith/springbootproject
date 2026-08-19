package com.example.JavaExamples.feature17;

public sealed class Shape permits Rectangle, Triangle {
    public double area() {
        return 0;
    }
}
