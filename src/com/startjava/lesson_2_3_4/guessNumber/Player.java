package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int attempts;
    private int number;
    int[] answers = new int[10];


    int[] answersCopy = Arrays.copyOf(answers, answers.length);

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

    public int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    public void answers() {
        for(int i : answersCopy) {
            i++;
           answersCopy[i] = number;
            System.out.print(answersCopy[i] + " ");
        }
    }
    public void zeroing() {
        Arrays.fill(answers, 0);
    }
}