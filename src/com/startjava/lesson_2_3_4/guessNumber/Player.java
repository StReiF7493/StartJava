package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] number = new int[11];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getNumber() {
        return number[attempts];
    }

    public void setNumber(int numbers) {
        number[attempts] = numbers;
        if(attempts < 10) {
            attempts++;
            number[attempts]++;
            number[attempts] = numbers;
        }
    }

    public int[] getNumbers() {
        return Arrays.copyOf(number, attempts);
    }

    public void zeroing() {
        Arrays.fill(number, 0, attempts, 0);
        attempts = 0;
    }
}