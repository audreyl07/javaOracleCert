package S3Basics;

public class TypeCasting {
    public static void main(String[] args) {
        //implicit casting (conversion)
        int a = 124;
        long b = a; //implicit casting (widening)
        double d = b;
        System.out.println("Int value: "+a);
        System.out.println("Int value: "+b);
        System.out.println("Int value: "+d);

        //explicit casting (type casting)
        double dbl = 135.35;
        long lng = (long)dbl; //explicit casting (narrowing)
        byte byt = (byte)lng;
        System.out.println("Double value: "+dbl);
        System.out.println("Double value: "+lng);
        System.out.println("Double value: "+byt);
    }
}
