public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 40;
        int userNumber = 35;

        if (compNumber > userNumber) {
            while(compNumber > userNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
            }
        } else if(userNumber > compNumber) {
            while(userNumber > compNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber--;
            }
          }
        System.out.println("Вы угадали!");

    }
}






