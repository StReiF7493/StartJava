package com.startjava.lesson2.calculator;

public class Calculator {

    private int number1;
    private char operation;
    private int number2;

    void setNumber1(int number1) {
        this.number1 = number1;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public int getNumber2() {
        return number2;
    }

    void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculate() {
        switch(operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '^':
                int result = 1;
                for(int i = 1; i <= number2; i++) {
                    result *= number1;
                }
                return result;
            case '%':
                return number1 % number2;
            default:
                return 0;
        }
    }
}