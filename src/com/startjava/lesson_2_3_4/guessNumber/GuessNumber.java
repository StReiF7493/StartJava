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
        while (playerTwo.getAttempts() < 10) {
            inputNumber(playerOne);
            if(compareNums(playerOne) == true) {
                break;
            }
            inputNumber(playerTwo);
            if(compareNums(playerTwo) == true) {
                break;
            }
        }
        if (playerTwo.getAttempts() > 9 & playerOne.getAttempts() > 9) {
            System.out.println("У всех игроков закончились попытки.");
        }
        System.out.println("Числа введённые игроком " + playerOne.getName() + ": " + Arrays.toString(playerOne.getNumbers()));
        System.out.println("Числа введённые игроком " + playerTwo.getName() + ": " + Arrays.toString(playerTwo.getNumbers()));
        playerOne.zeroing();
        playerTwo.zeroing();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " угадайте число загаданное компьютером: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNums(Player player) {
        if (player.getNumber() == compNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + player.getAttempts() + " попытки");
            return true;
        }
        else if (player.getNumber() > compNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() < compNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
        return false;
    }
}
