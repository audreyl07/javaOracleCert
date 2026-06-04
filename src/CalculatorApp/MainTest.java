package CalculatorApp;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        Calculator calculator = new Calculator();
        calculator.calculate(num1, num2, (x, y) -> {

                System.out.println("x + y = " + (x + y));
                System.out.println("x - y = " + (x - y));
                System.out.println("x * y = " + (x * y));
                if (y != 0) { System.out.println("x / y = " + (x / y)); }
                else { System.out.println("Cannot divide by zero"); }
        });

        input.close();

    }
}
