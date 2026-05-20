package ControlFlowS6;

public class Ternary {
    public static void main(String[] args) {

        int score = 80;
        String result;

        /*
        if (score > 50){
            result = "passed";
        } else {
            result = "failed";
        }

        System.out.println("Result: " + result);


        result = score > 50 ? "passed" : "failed";
        System.out.println("Result: " + result);
        */

        int a = 10, b = 9;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + (a == b ? a++ : b--));
    }
}
