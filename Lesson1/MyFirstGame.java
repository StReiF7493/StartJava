public class MyFirstGame {
    public static void main(String[] args) {
        int winningNumber = 40;
        int userNumber = 40;

        if (winningNumber > userNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        }
        else if (winningNumber < userNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        }
        else {
            System.out.println("Вы угадали!");
        }
    }
}