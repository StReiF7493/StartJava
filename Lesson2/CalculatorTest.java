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
        calculatorOne.getResult();
        calculatorOne.calculate();
        System.out.println("Результат математической операции: " + calculatorOne.getResult());
        String request = "Хотите продолжить?[да/нет] ";
        boolean exit = false;
        for (int i = 1; ;) {
            if(exit == true) {
            break;
        }
            System.out.println(request);
            String replay = scan.next();
            switch(replay) {
                case "да":
                    main(args);
                    break;
                case "нет":
                    exit = true;
                    break;
            }
        }
    }
}