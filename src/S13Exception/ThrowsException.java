package S13Exception;

public class ThrowsException {
    public static void divide() throws NumberFormatException, ArithmeticException {
        int a = Integer.parseInt("8b");
        int b = Integer.parseInt("0");
        int c = a/b;
        System.out.println("result: " + c);

    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}
