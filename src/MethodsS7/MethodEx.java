package MethodsS7;

import java.util.Scanner;

public class MethodEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        show(num1, num2);
        int a= add(num1, num2);
        int b = min(num1, num2);
        System.out.println("Sum: " + a);
        System.out.println("Minimum: " + b);
    }

    public static void show(int num1, int num2){
        System.out.println("You entered: " + num1 + " and " + num2);


    }
    //add the sum
    public static int add(int num1, int num2){
        int sum=0;
        sum = num1 + num2;
        return sum;

    }
    //return minimum
    public static int min(int num1, int num2){
        int min;
        if (num1>num2){
            min = num2;
        } else {
            min = num1;
        }
        return min;
    }
}
