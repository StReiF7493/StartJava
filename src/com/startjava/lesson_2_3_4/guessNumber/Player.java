package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[10];

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
        enteredNumbers[getAttempts()] = number;
        attempts++;
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

    public int getLastEnteredNumber() {
        return enteredNumbers[attempts - 1];
    }
}