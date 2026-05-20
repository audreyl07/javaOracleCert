package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //Fibonacci
        Scanner input = new Scanner(System.in);
        System.out.println("Enter max sequence number: ");
        int number = input.nextInt();
        int fibPrev = 0, fibonacci = 1, sum =0;

        for (int i=1; i<=number; i++){
            System.out.println(fibPrev + " ");
            sum = fibonacci + fibPrev;
            fibPrev = fibonacci;
            fibonacci = sum;
        }

    }
}
