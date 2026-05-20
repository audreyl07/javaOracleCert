package JavaOOPS8;

import java.util.Scanner; //import statement, built-in package
import JavaOOPS8.Packages; //import statement, user-defined package
import java.util.* ; //import statement, imports all classes in the java.util package


public class PackageTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = in.nextInt();
        System.out.println("Enter another number: ");
        int num2 = in.nextInt();

        Packages p = new Packages();
        System.out.println("Sum of the two numbers is: " + p.sumNumbers(num1, num2));

    }
}
