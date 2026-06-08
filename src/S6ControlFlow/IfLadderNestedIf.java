package S6ControlFlow;
import java.util.Scanner;

public class IfLadderNestedIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, largest;
        System.out.println("This app finds the largest number \nPlease enter first number:");
        num1 = in.nextInt();
        System.out.println("Please enter second number:");
        num2 = in.nextInt();
        System.out.println("Please enter third number:");
        num3 = in.nextInt();

        if (num1 >= num2){
            if (num1 >= num3){
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3){
                largest = num2;
            } else {
                largest = num3;
            }
        }
        System.out.println("The largest number is: " + largest);
        /*
        System.out.println("Please enter your age:");

        int age = in.nextInt();

        if(age < 13){
            System.out.println("You are a child");
        } else if (age < 19){
            System.out.println("You are a teenager");
        } else {
            if (age < 65) {
                System.out.println("You are an adult");
            } else {
                System.out.println("You are a senior citizen");
            }
        }
        */
        in.close();

    }
}
