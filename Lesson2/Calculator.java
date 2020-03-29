public class Calculator {

        private int number1;
        private char operation;
        private int number2;
        private int result = 1;
        private String request1 = "Введите первое число: ";
        private String request2 = "Введите знак математической операции: ";
        private String request3 = "Введите второе число: ";

        public String getRequest1() {
            return request1;
        }

        void setRequest1(String request1) {
            this.request1 = request1;
        }

        public String getRequest2() {
            return request2;
        }

        void setReuqest2(String request2) {
            this.request2 = request2;
        }

        public String getRequest3() {
            return request3;
        }

        void setRequest3(String request3) {
            this.request3 = request3;
        }

        public int getNumber1() {
            return number1;
        }

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

        public int getResult() {
            return result;
        }

        void setResult(int result) {
            this.result = result;
        }

        public void calc() {
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
        }
}