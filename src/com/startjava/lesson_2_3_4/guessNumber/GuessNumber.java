package com.startjava.lesson_2_3_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private int compNumber;

    private Player playerOne;
    private Player playerTwo;
    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        compNumber = (int) (Math.random() * 101);
        while (playerOne.getNumber() != compNumber) {
            if (playerOne.getAttempts() == 10 && playerTwo.getAttempts() == 10) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки." + " У игрока " + playerTwo.getName() + " закончились попытки");
                System.out.print("Числа введённые игроком " + playerOne.getName() + ": ");
                System.out.print(Arrays.toString(playerOne.getNumbers()));
                System.out.print("Числа введённые игроком " + playerTwo.getName() + ": ");
                System.out.print(Arrays.toString(playerTwo.getNumbers()));
                break;
            } else {
                System.out.println(playerOne.getName() + " - угадайте число загаданное компьютером");
                playerOne.setNumber(scan.nextInt());
                if (playerOne.getNumber() > compNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else if (playerOne.getNumber() < compNumber) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Игрок " + playerOne.getName() + " угадал число " + compNumber + " с " + playerOne.getAttempts() + " попытки");
                    break;
                }
                System.out.println(playerTwo.getName() + " - угадайте число загаданное компьютером");
                playerTwo.setNumber(scan.nextInt());
                if (playerTwo.getNumber() > compNumber) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                } else if (playerTwo.getNumber() < compNumber) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Игрок " + playerTwo.getName() + " угадал число " + compNumber + " с " + playerTwo.getAttempts() + " попытки");
                    break;
                }
            }
        }
        playerOne.zeroing();
        playerTwo.zeroing();
    }
}