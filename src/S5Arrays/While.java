package S5Arrays;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        int x=0;
        while (x<6){
            System.out.println(x);
            x++;
        }

        String[] animals= {"Cat", "Dog", "Horse", "Cow"};
        int i=0;
        while (i< animals.length){
            System.out.println("animals[" + i + "] = " + animals[i]);
            i++;
        }

         */

        //Factorial
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println(number + "! is undefined");
        } else if (number ==0 || number == 1){
            System.out.println(number + "! = 1");
        } else {
            long result = 1;
            while (number > 0){
                result *= number;
                number--;
            }
            System.out.println(number + "! = " + result);
        }
        scanner.close();
    }
}
