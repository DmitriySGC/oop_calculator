public class Calculator {
    private double num1;
    private double num2;
    private char operation;

    public Calculator(double num1, double num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return 0;
        }
    }
}
