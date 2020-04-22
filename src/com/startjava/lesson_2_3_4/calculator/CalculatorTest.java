package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите математическое выражение: ");
        Calculator calculatorOne = new Calculator();
        System.out.println("Результат математической операции: " + calculatorOne.calculate());
        String replay;
        do {
            System.out.println("Хотите продолжить?[да/нет]");
            replay = scan.next();
            if(replay.equals("да")) {
                main(args);
                break;
            }
        } while(!replay.equals("нет"));
    }
}