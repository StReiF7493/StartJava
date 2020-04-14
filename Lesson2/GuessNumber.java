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
        while(playerOne.getNumber() != compNumber) {
            System.out.println(playerOne.getName() + " - угадайте число загаданное компьютером");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() > compNumber) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerOne.getNumber() < compNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
                }
            System.out.println(playerTwo.getName() + " - угадайте число загаданное компьютером");
            playerTwo.setNumber(scan.nextInt());
            if (playerTwo.getNumber() > compNumber) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerTwo.getNumber() < compNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerTwo.getName());
                    break;
                }
        }
    }
}