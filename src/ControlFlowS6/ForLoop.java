package ControlFlowS6;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        int sum = 0;
        for (int k=0; k<=10; k+=2){
            sum += k;
            System.out.println(k);
        }
        System.out.println("Sum: " + sum);
        */

        for (int a=0, b=1; a<=5 && b<11; a++, b++){
            System.out.println("a: " + a + ", b: " + b);
            System.out.println("-------------------");

        }
    }
}
