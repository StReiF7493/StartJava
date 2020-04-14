import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);

    private int compNumber = (int) (Math.random()*101);
    Player playerOne = new Player();
    Player playerTwo = new Player();

    public int getCompNumber() {
        return compNumber;
    }

    void setCompNumber(int compNumber) {
        this.compNumber = compNumber;
    }

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    public void startGame() {
        getCompNumber();
        Player movePlayerOne = new Player();
        while(movePlayerOne.getNumber() != getCompNumber()) {
            System.out.println(playerOne.getName() + " - угадайте число загаданное компьютером");
            movePlayerOne.setNumber(scan.nextInt());
            if (movePlayerOne.getNumber() > getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(movePlayerOne.getNumber() < getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
              }
            Player movePlayerTwo = new Player();
            System.out.println(playerTwo.getName() + " - угадайте число загаданное компьютером");
            movePlayerTwo.setNumber(scan.nextInt());
            if (movePlayerTwo.getNumber() > getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(movePlayerTwo.getNumber() < getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerTwo.getName());
                    break;
              }
        }
    }
}