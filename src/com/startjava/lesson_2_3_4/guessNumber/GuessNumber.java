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

    private void loss(Player player) {
        System.out.println("У игрока " + player.getName() + " закончились попытки.");
        System.out.println("Числа введённые игроком " + player.getName() + ": " + Arrays.toString(player.getNumbers()));
    }

    private void win(Player player) {
        System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + player.getAttempts() + " попытки");
    }

    private void numberInput(Player player) {
        System.out.print(player.getName() + " угадайте число загаданное компьютером: ");
        player.setNumber(scan.nextInt());
    }

    private void comparisonPlayerNumber(Player player) {
        if (player.getNumber() > compNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() < compNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
    }

    public void startGame() {
        compNumber = (int) (Math.random() * 101);
        while (playerOne.getNumber() != compNumber | playerTwo.getNumber() != compNumber) {
            if (playerTwo.getAttempts() == 10 ) {
                loss(playerOne);
                loss(playerTwo);
                break;
            } else {
                if (playerOne.getNumber() == compNumber) {
                    win(playerOne);
                    break;
                } else if (playerTwo.getNumber() == compNumber) {
                    win(playerTwo);
                    break;
                }
                numberInput(playerOne);
                comparisonPlayerNumber(playerOne);
                numberInput(playerTwo);
                comparisonPlayerNumber(playerTwo);
            }
        }
        playerOne.zeroing();
        playerTwo.zeroing();
    }
}