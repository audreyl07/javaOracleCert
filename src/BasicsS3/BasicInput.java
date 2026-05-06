package BasicsS3;


import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a text:");
        System.out.println("You entered " + input.nextLine());
        input.close(); //for efficiency
    }
}
