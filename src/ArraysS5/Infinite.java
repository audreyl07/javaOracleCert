package ArraysS5;

import java.util.Random;
import java.util.Scanner;

public class Infinite {
    public static void main(String[] args) {
        //Number Guessing App
        Random random = new Random();
        int genNum = random.nextInt(5, 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 5 and 100");
        while (true){
            int userIn = scanner.nextInt();
            if(userIn > genNum){
                System.out.println("Decrease your guess");
            } else if (userIn < genNum){
                System.out.println("Increase your guess");
            } else {
                System.out.println("Congratulations....");
                break;
            }
        }
        scanner.close();
        /*
        boolean isChecked = true;
        while (isChecked){
            System.out.println("This is an infinite (endless) loop");
        } //it will never end

        int a=5;

        boolean isFalse = false;
        while (isFalse){

        }

         */
    }
}
