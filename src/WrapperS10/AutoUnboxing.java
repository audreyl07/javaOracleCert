package WrapperS10;

public class AutoUnboxing {

    public static void main(String[] args) {
        Double db = 12.0; // Auto-boxing: primitive double is automatically converted to Double object
        double primitiveDb = db; // Auto-unboxing: Double object is automatically converted back to

        System.out.println(db + " " + primitiveDb);
        Integer in =5;
        int i = in;
        System.out.println(in + " " + i);


    }
}
