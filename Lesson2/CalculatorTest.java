import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        System.out.println(calculatorOne.getRequest1());
        calculatorOne.setNumber1(scan.nextInt());
        System.out.println(calculatorOne.getRequest2());
        calculatorOne.setOperation(scan.next().charAt(0));
        System.out.println(calculatorOne.getRequest3());
        calculatorOne.setNumber2(scan.nextInt());
        calculatorOne.getResult();
        calculatorOne.calc();
        System.out.println("Сумма математической операции: " + calculatorOne.getResult());

    }
}



