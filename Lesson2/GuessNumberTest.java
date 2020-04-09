import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player playerOne = new Player();

        System.out.println("Введите имя первого игрока");
        playerOne.setName(scan.next());

        Player playerTwo = new Player();

        System.out.println("Введите имя второго игрока");
        playerTwo.setName(scan.next());

        GuessNumber guessNumberOne = new GuessNumber();

        guessNumberOne.getCompNumber();
        while(playerOne.getNumber() != guessNumberOne.getCompNumber()) {
            System.out.println(playerOne.getName() + " - угадайте число загаданное компьютером");
            playerOne.setNumber(scan.nextInt());
            if (playerOne.getNumber() > guessNumberOne.getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerOne.getNumber() < guessNumberOne.getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
              }
        System.out.println(playerTwo.getName() + " - угадайте число загаданное компьютером");
            playerTwo.setNumber(scan.nextInt());
            if (playerTwo.getNumber() > guessNumberOne.getCompNumber()) {
                System.out.println("Введеное вами число больше того, что загадал компьютер");
            } else if(playerTwo.getNumber() < guessNumberOne.getCompNumber()) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
              } else {
                    System.out.println("победил игрок: " + playerOne.getName());
                    break;
              }
        }
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