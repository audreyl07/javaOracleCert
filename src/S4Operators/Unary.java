package S4Operators;

public class Unary {
    public static void main(String[] args) {

        double number = 7.6;
        boolean isCheck = true;

        System.out.println("+number -> " + +number); //unary plus
        System.out.println("-number -> " + -number); //unary minus
        System.out.println("++number -> " + ++number); //increment
        System.out.println("--number -> " + --number); //decrement
        System.out.println("!number -> " + !isCheck); //logical complement

        System.out.println("\nPrefix / Suffix");
        double result = 4.7;
        System.out.println("result -> " + result);
        System.out.println("result++ -> " + result++);
        System.out.println("result -> " + result);
        System.out.println("++result -> " + ++result);
        System.out.println("result -> " + result);
    }
}
