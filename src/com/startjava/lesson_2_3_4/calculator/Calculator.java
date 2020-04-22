package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String operation;
    private String input;
    private int[] numbers = new int[2];

    public void setInput(String input) {
        this.input = input;
    }

    public int calculate() {
        String[] splitMathExpression = input.split(" ");
        numbers[0] = Integer.parseInt(splitMathExpression[0]);
        numbers[1] = Integer.parseInt(splitMathExpression[2]);
        operation = Character.toString(splitMathExpression[1].charAt(0));

        switch(operation) {
            case "+":
                return Math.addExact(numbers[0], numbers[1]);
            case "-":
                return Math.subtractExact(numbers[0], numbers[1]);
            case "*":
                return Math.multiplyExact(numbers[0], numbers[1]);
            case "/":
                return Math.floorDiv(numbers[0], numbers[1]);
            case "^":
                int result = 1;
                for(int i = 1; i <= numbers[1]; i++) {
                    result *= numbers[0];
                }
                return result;
           case "%":
                return numbers[0] % numbers[1];
            default:
                return 0;
        }
    }
}