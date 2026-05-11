package BasicsS3;
import java.util.Scanner;
//Exercise 1
public class Customer {
    String firstName, lastName;

    public String getFullName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = input.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = input.nextLine();

        return firstName + " " + lastName;
    }

    public static void main (String[] args) {
        Customer customer = new Customer();
        String fullName = customer.getFullName();
        System.out.println("The customer's name is "+ fullName);

    }

}
