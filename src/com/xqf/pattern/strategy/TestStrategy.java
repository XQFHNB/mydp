package com.xqf.pattern.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        OpeationStrategy strategy = new StrategySub();
        double result = strategy.getResult(2.0, 3.0);
        System.out.println(result);
    }
}