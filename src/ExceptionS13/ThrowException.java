package ExceptionS13;

public class ThrowException {

    public static double divide (double x, double y){
        if (y == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x/y;
    }

    public static void main(String[] args) {
        double d;
        try {
            d = divide(8.5, 3.4);
            System.out.println("d = " + d);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
