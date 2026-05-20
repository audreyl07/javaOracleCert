package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=Simple Calculator=");
        System.out.println("Enter 2 integer numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = in.next().charAt(0);
        double result = 0.0;

        switch(operator){
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = (double) num1 / num2;
                break;
            case '%': result = num1 % num2;
                break; //terminates the switch
            default:
                System.out.println("invalid operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        in.close();
    }
}
