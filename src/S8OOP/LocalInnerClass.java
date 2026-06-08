package S8OOP;

import java.util.Scanner;

public class LocalInnerClass {
    //classes defined in a block of code, such as a method, constructor, or even an if statement, are called local inner classes.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        checkNumber(num);
        in.close();
    }

    public static void checkNumber(int enteredNum){
        int result = 0;

        class NumberChecker{
            boolean check;
            public NumberChecker(int number){
                check = number % 2 == result ? true : false;
            }

            public void printNumber(){
                System.out.println("You entered: " + enteredNum);
            }
        }

        NumberChecker checker = new NumberChecker(enteredNum);
        checker.printNumber();
        if (checker.check){
            System.out.println(enteredNum + " is an even number.");
        } else {
            System.out.println(enteredNum + " is an odd number.");
        }
    }
}
