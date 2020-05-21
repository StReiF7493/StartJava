package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[11];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempt(int attempts) {
        this.attempts = attempts;
    }

    public void setNumber(int number) {
        enteredNumbers[attempts] = number;
        attempts++;
        enteredNumbers[attempts] = number;
    }

    public int getNumber() {
        return enteredNumbers[attempts];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(enteredNumbers , attempts);
    }

    public void zeroing() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }
}