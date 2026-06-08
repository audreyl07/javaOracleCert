package S13Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, result = 0;
        boolean isFlag = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("enter the first number:");
                num1 = input.nextInt();
                System.out.println("enter the second number:");
                num2 = input.nextInt();

                result = num1 / num2;
                System.out.println("result: " + result);
                isFlag = true;
                input.close();
            } catch (InputMismatchException e) {
                System.out.println("please enter valid number");
            } catch (ArithmeticException e) {
                System.out.println("second number cannot be zero");
            } catch (Exception e) {
                System.out.println("something went wrong");
            } finally {
                System.out.println("this is always executed");
            }
        } while (!isFlag);

    }
}
