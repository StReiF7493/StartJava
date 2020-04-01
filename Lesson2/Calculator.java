public class Calculator {

    private int number1;
    private char operation;
    private int number2;
    private int result = 1;

    void setNumber1(int number1) {
        this.number1 = number1;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public int getNumber2() {
        return number2;
    }

    void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculate() {
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
            case '%':
                result = number1 % number2;
                break;
        }
            return result;
    }
}