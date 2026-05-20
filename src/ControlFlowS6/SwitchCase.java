package ControlFlowS6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter a day (number) of the week:");
        int dayNum = num.nextInt();
        String day;

        switch (dayNum){
            case 1: day = "Monday";
                break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
        }

        num.close();
    }
}
