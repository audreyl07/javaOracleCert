package OperatorsS4;

public class Conditional {
    public static void main(String[] args) {
        int num1 =5, num2 =8, num3 = 12;
        boolean result; //default is false

        //Conditional And
        result = (num1 > num2 ) && (num3 > num2);
        System.out.println("result = " + result);

        //Conditional OR
        result = (num1 > num2) || (num3 > num2);
        System.out.println("result = " + result);

        //Ternary
        result = num1 < num2 ? true : false;
        System.out.println("result = " + result);
    }
}
