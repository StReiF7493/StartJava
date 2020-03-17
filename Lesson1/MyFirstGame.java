public class MyFirstGame {
    public static void main(String[] args) {
        int winningNumber = 40;
        int userNumber = 45;

        if (winningNumber == userNumber) {
            System.out.println("Вы угадали!");
        } if (winningNumber > userNumber) {
            while(userNumber < winningNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
        if(userNumber == winningNumber) {
            System.out.println("Вы угадали!");
        }
            }
          } if(userNumber > winningNumber) {
              while(userNumber > winningNumber) {
                  System.out.println("Введенное вами число больше того, что загадал компьютер");
                  userNumber--;
        if(userNumber == winningNumber) {
            System.out.println("Вы угадали!");
          }
        }
    }
}
}