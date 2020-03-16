public class Calculator {
    public static void main (String [] args) {
        int a = 5;
        int b = 1;
        int result = 1;
        char action = '*';
        if (action == '+') {
        result = a+b;
        System.out.println("a + b = " + result);
        } else if (action == '-') {
        result = a-b;
        System.out.println("a - b = " + result);
        } else if (action == '*') {
        result = a*b;
        System.out.println("a * b = " + result);
        } else if (action == '/') {
        result = a/b;
        System.out.println("a / b = " + result);
        } if (a % 2 == 0) {
        System.out.println("число " + a + " является четным");
        } else {
        System.out.println("число " + a + " является нечетным");
        } if (b % 2 ==0) {
        System.out.println("число " + b + " является четным");
        } else {
        System.out.println("число " + b + " является нечетным");
        } if (result % 2 ==0) {
        System.out.println("число " + result + " является четным");
        } else {
        System.out.println("число " + result + " является нечетным");
        } if ( action == '^') {
        while(b<=50) {
        result = result*a;
        System.out.println(a + " в степени " + b + " = " + result);
        b++;
        }
        }
    }
}