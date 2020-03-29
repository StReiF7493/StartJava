import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scan.nextInt();
        System.out.println("Введите знак математической операции: ");
        char operation = scan.next().charAt(0);
        System.out.println("Введите второе число: ");
        int number2 = scan.nextInt();
        int result = 1;

        switch(operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                for(int i = 1; i <= number2; i++) {
                result *= number1;
             }
                break;
        }
        System.out.println("Результат математической операции: " + result);
    }
}
