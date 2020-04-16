package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int result = 1;
        char action = '^';

        if (action == '+') {
            result = a + b;
            System.out.println("a + b = " + result);
        } else if (action == '-') {
            result = a - b;
            System.out.println("a - b = " + result);
        } else if (action == '*') {
            result = a * b;
            System.out.println("a * b = " + result);
        } else if (action == '/') {
            result = a / b;
            System.out.println("a / b = " + result);
        } if ( action == '^') {
            if(b == 0) {
                System.out.println(1);
            }
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println(a + " в степени " + b + " = " + result);
          }
    }
}
