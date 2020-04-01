import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();

        System.out.println("Введите первое число: ");
        calculatorOne.setNumber1(scan.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculatorOne.setOperation(scan.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculatorOne.setNumber2(scan.nextInt());
        calculatorOne.calculate();
        System.out.println("Результат математической операции: " + calculatorOne.calculate());
        String replay;
        do {
            System.out.println("Хотите продолжить?[да/нет]");
            replay = scan.next();
            if(replay.equals("да")) {
                main(args);
                break;
            } else if(replay.equals("нет")) {
                break;
            } else {
                continue;
            }
        } while(true);
    }
}
