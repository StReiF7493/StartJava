package com.startjava.lesson_2_3.guessNumber;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(scan.next());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.startGame();
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