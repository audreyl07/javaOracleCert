package MethodsS7;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of 2 numbers:" + add(10, 20));
        System.out.println("Sum of 3 numbers:" + add(10, 20, 30));
        System.out.println("Sum of 2 double numbers:" + add(4.6, 8.4));
    }

    //same method name but different parameters (number or type)
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(double a, double b){
        return a + b;
    }
}
