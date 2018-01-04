package com.kodilla.testing.calculator;

public class Calculator {

    public int add(int a, int b){
        return (a+b);
    }
    public int subtract(int a, int b){
        return (a-b);

    }

    public static void main (String [] args){
        Calculator calculator = new Calculator();
        int result =calculator.add(4,2);
        int result2 =calculator.subtract(4,2);

    }

}
