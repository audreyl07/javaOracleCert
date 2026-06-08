package S7Methods;

import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please enter the numbers you want to sum, leave a space between them:");
            String [] inputNum = scanner.nextLine().split(" ");
            sumNumbers(inputNum); //If its just VarArgs, then leave blank
            System.out.println("Do you want to continue? (Y/N)");
            char answer = scanner.nextLine().charAt(0);
            if (answer == 'N' || answer == 'n'){
                System.out.println("Goodbye!");
                break;
            }

        }
        scanner.close();
    }

    public static void sumNumbers ( String...numbers){ //... is the VarArgs, it must always be at the end and there is only one allowed
        int sum = 0;
        String enteredNum = "";

        for (int i=0; i<numbers.length; i++){
            sum += Integer.parseInt(numbers[i]);
            if (i != numbers.length - 1){
                enteredNum += numbers[i] + " + ";
            } else {
                enteredNum += numbers[i];
            }
        }
        System.out.println("The sum of " + enteredNum + " is: " + sum);
    }
}
