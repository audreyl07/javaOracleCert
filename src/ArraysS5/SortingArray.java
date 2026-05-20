package ArraysS5;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        //Double sort
        double [] arr1 = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
        System.out.println("Before sorting" + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorting" + Arrays.toString(arr1));

        //Integer sort
        int [] arr2 = {1, 3, -5, 10, 2, 15, 9};
        System.out.println("Before sorting arr2 -> " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted arr2 -> " + Arrays.toString(arr2));

        //character sort
        //consider ASCII Table (upper then lower case)
        char [] arr3 = {'F', 'B', 'b', 'H', 'c', 'A'};
        System.out.println("Before sorting arr3 -> " + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("Sorted arr3 -> " + Arrays.toString(arr3));

        //String sort
        //If we sort numbers in a string array, they will be sorted as strings, the first digit will be sorted first.
        //numbers will be sorted first, then uppercase letters and then lowercase letters. If there are more than one word, they will be sorted by the first letter of the word.
        String [] arr4 = {"3", "300", "20", "35", "37", "31", "4", "70", "ant", "Zebra"};
        System.out.println("Before sorting arr4 -> " + Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println("Sorted arr4 -> " + Arrays.toString(arr4));


    }
}
