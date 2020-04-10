import java.util.Scanner;

public class GuessNumber {
    Player playerOne = new Player();
    Player playerTwo = new Player();
    Scanner scan = new Scanner(System.in);

    private int compNumber = (int) (Math.random()*101);

    public int getCompNumber() {
        return compNumber;
    }

    void setCompNumber(int compNumber) {
        this.compNumber = compNumber;
    }

    public void startGame() {
        Player playerOne = new Player();
        System.out.println("Введите имя первого игрока ");
        playerOne.setName(scan.next());
        Player playerTwo = new Player();
        System.out.println("Введите имя второго игрока ");
        playerTwo.setName(scan.next());
        while(playerOne.getNumber() != getCompNumber()) {
            System.out.println(playerOne.getName() + " - угадайте число загаданное компьютером");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() > getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerOne.getNumber() < getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
              }
            System.out.println(playerTwo.getName() + " - угадайте число загаданное компьютером");
            playerTwo.setNumber(scan.nextInt());
            if (playerTwo.getNumber() > getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerTwo.getNumber() < getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
              }
        }
    }
}