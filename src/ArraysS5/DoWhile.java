package ArraysS5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        char continueToCalculate;

        do {
            System.out.println("Enter a number:");
            int number = in.nextInt();
            result += number;
            System.out.println("Do you want to continue (Y/N): ");
            continueToCalculate = in.next().charAt(0);

        } while (continueToCalculate == 'Y' || continueToCalculate == 'y');

        System.out.println("the sum of the numbers are: " + result);
        in.close();
        /*
        int i=5;
        do {
            System.out.println(i);
            i--;
        }while (i > 0);



        int age = 15;
        do {
            age--;
            while (age < 20){
                age++;
            }
        } while (age < 15);
        System.out.println("Age: "+ age);

         */
    }
}
