public class Calculator {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
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
          for(int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " в степени " + b + " = " + result);
        }
        }
    }
