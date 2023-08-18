package com.interswitch.employeesportal;

public class Calculator {

    public int enumerate(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.enumerate(2,6));
    }
}
