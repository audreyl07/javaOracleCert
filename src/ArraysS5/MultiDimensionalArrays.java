package ArraysS5;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //2D array
        int [][] twoDArray = new int[3][3];
        //1st 1D array
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[0][2] = 2;
        //2nd 1D array
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;
        twoDArray[1][2] = 5;
        //3rd 1D array
        twoDArray[2][0] = 6;
        twoDArray[2][1] = 7;
        twoDArray[2][2] = 8;

        //we printed out the ids of each array
        System.out.println("2D Array -> " + Arrays.toString(twoDArray));
        System.out.println(Arrays.toString(twoDArray[0]));
        System.out.println(Arrays.toString(twoDArray[1]));
        System.out.println(Arrays.toString(twoDArray[2]));

        int [][] ages = {
                {5, 20},
                {25,26,27},
                {30}
        };
        System.out.println("2D Array -> " + Arrays.toString(twoDArray));
        System.out.println(Arrays.toString(ages[0]));
        System.out.println(Arrays.toString(ages[1]));
        System.out.println(Arrays.toString(ages[2]));

        //3D array
        char [][][] threeDArray = {
                {
                        {'a','b','c'},
                        {'d','e'}
                },
                {
                        {'f','g'},
                        {'h'},
                        {'i','j','k','l'}
                }
        };

        System.out.println("3D Array -> " + Arrays.toString(threeDArray));
        System.out.println(Arrays.toString(threeDArray[0]));
        System.out.println(Arrays.toString(threeDArray[1]));
        System.out.println(Arrays.toString(threeDArray[0][0]));
        System.out.println(Arrays.toString(threeDArray[0][1]));
        System.out.println(Arrays.toString(threeDArray[1][0]));
        System.out.println(Arrays.toString(threeDArray[1][1]));

    }
}
