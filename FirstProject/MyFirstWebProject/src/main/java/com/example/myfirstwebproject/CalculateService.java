package com.example.myfirstwebproject;

class CalculateService {
    static double calculate(double a, double b, String operator){
        return switch (operator){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Exception");
        };
    }
}
