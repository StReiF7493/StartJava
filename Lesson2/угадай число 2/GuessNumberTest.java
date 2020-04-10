import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GuessNumber guessNumberOne = new GuessNumber();

        guessNumberOne.getCompNumber();
        guessNumberOne.startGame();
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