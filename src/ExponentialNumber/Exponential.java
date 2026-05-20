package ExponentialNumber;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a integer base number: ");
        int base = in.nextInt();
        System.out.println("Enter an exponent: ");
        int power = in.nextInt();

        for (int i=0; i<=power; i++){
            System.out.println(base + " to the power " + i + " is: " + pow(base, i));


        }
        in.close();
    }

    public static int pow(int num, int power){
        return (int) Math.pow(num, power);
    }
}
