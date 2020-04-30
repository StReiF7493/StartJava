package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int attempts;
    private int[] number = new int[11];

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int numbers) {
        if (number[attempts] == 0) {
            number[attempts] = numbers;
        } else {
            attempts++;
            number[attempts] = numbers;
        }
    }

    public int getNumber() {
        return number[attempts];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(number, attempts );
    }
    public void zeroing() {
        Arrays.fill(number, 0, attempts, 0);
        attempts = 0;
    }
}