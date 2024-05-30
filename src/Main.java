import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = input.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = input.nextDouble();
        System.out.print("Введите операцию над числами (+, -, *, /): ");
        char operation = input.next().charAt(0);
        Calculator calculator = new Calculator(num1, num2, operation);
        double result = calculator.calculate();
        System.out.println("Итог: " + result);

    }
}