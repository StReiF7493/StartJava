public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int result = 1;
        char action = '^';
        if (action == '+') {
            result = a + b;
            System.out.println("a + b = " + result);
        } else if (action == '-') {
            result = a - b;
            System.out.println("a - b = " + result);
        } else if (action == '*') {
            result = a * b;
            System.out.println("a * b = " + result);
        } else if (action == '/') {
            result = a / b;
            System.out.println("a / b = " + result);
        } if ( action == '^') {
        while(b <= a) {
            result = result * a;
            System.out.println(a + " в степени " + b + " = " + result);
            b++;
        }
        }
    }
}