package OperatorsS4;

public class BitwiseBitShift {
    public static void main(String[] args) {
        //Bitwise AND
        int num1 = 8; //1000
        int num2 = 9; //1001
                    //1000 -> 8

        System.out.println("num1 in binary = " + Integer.toBinaryString(num1));
        System.out.println("num2 in binary = "+ Integer.toBinaryString(num2));
        System.out.println("num1 + num2 in binary = "+ Integer.toBinaryString(num1 & num2));
        System.out.println("num1 + num2 in decimal = "+ Integer.toString(num1 & num2));

        //Bitwise OR
        int num3 = 8; //1000
        int num4 = 9; //1001
                    //1001 -> 9

        System.out.println("\nnum3 in binary = " + Integer.toBinaryString(num3));
        System.out.println("num4 in binary = "+ Integer.toBinaryString(num4));
        System.out.println("num3 + num4 in binary = "+ Integer.toBinaryString(num3 | num4));
        System.out.println("num3 + num4 in decimal = "+ Integer.toString(num3 | num4));

        //Bitwise Exclusive OR
        int num5 = 8; //1000
        int num6 = 9; //1001
                    //0001 -> 1

        System.out.println("\nnum5 in binary = " + Integer.toBinaryString(num5));
        System.out.println("num6 in binary = "+ Integer.toBinaryString(num6));
        System.out.println("num5 + num6 in binary = "+ Integer.toBinaryString(num5 ^ num6));
        System.out.println("num5 + num6 in decimal = "+ Integer.toString(num5 ^ num6));

        //Left Shift
        int num7 = 8; // 1000 << 2 -> 100000

        System.out.println("\nnum7 in binary = " + Integer.toBinaryString(num7));
        System.out.println("num7 in binary = "+ Integer.toBinaryString(num7 << 2));
        System.out.println("num7 in decimal = "+ Integer.toString(num7 << 2));

        //Right Shift
        int num8 = 8; // 1000 >> 2 -> 10

        System.out.println("\nnum8 in binary = " + Integer.toBinaryString(num8));
        System.out.println("num8 in binary = "+ Integer.toBinaryString(num8 >> 2));
        System.out.println("num8 in decimal = "+ Integer.toString(num8 >> 2));

        //Unary Bitwise
        int num9 = 8; // -1000 -> 0111 -> -9

        System.out.println("\nnum9 in binary = " + Integer.toBinaryString(num9));
        System.out.println("num9 in binary = "+ Integer.toBinaryString(~num9));
        System.out.println("num9 in decimal = "+ (~num9));

        //Unary Bitwise
        int num10 = 33; // ~0010 0001-> 1101 1110  -> 222

        System.out.println("\nnum9 in binary = " + Integer.toBinaryString(num10));
        System.out.println("num9 in binary = "+ Integer.toBinaryString(~num10));
        System.out.println("num9 in decimal = "+ (~num10));

    }
}
