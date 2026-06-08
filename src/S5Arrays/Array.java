package S5Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] numberArray = new int[5]; //can be done separately as well

        numberArray[0] = 5;
        numberArray[1] = -4;
        numberArray[2] =7;
        numberArray[3] = 2;
        numberArray[4] = -3;
        //numberArray[5] = 9; //ArrayIndexOutOfBoundsException

        int result = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3] + numberArray[4];
        System.out.println("Result -> " + result);
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Length of the array is -> " + numberArray.length);

        //altering an element in the array by its index
        int numberArray2[] = {5, -4, 7, -3, 2};
        System.out.println("Before changing: " + Arrays.toString(numberArray2));
        numberArray2[3] = 8;
        System.out.println("After changing: " + Arrays.toString(numberArray2));

        //to create an array with different data types, we can use object class
        Object[] mixedArray = {3, 5.7, 5.8F, "Cat", "A", false};
        System.out.println("Mixed Array -> " + Arrays.toString(mixedArray));
    }
}
