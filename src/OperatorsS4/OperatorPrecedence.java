package OperatorsS4;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 5 + 2 * 4; //BEDMAS
        System.out.println("result = " + result);

        result = (5+2) * 4;
        System.out.println("result = " + result);

        result += 80/20 % 8 * 3+-5; //35
        System.out.println("result = " + result);

        //unary
        int x =8, y =4, z =2, sum =0;
//        sum = x+ --y + --z;
//        System.out.println("sum = " + sum);
//
//        sum = x+ y-- + z--;
//        System.out.println("sum = " + sum);

        sum = x+ y-- + --z + y;
        System.out.println("sum = " + sum);
    }
}
