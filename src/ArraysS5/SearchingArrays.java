package ArraysS5;

import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {
        int [] num = {0, 12, 4, 16, 18, 10}; //unsorted, which means unpredictable results for binary search
        int indexof8 = Arrays.binarySearch(num, 8); //returns the index of the element if found, otherwise returns a negative value
        System.out.println("Index of 8 -> " + indexof8);

        int indexof7 = Arrays.binarySearch(num, 7);
        System.out.println("Index of 7 -> " + indexof7);

        Arrays.sort(num);
        int indexOf4 = Arrays.binarySearch(num, 4);
        System.out.println("Index of 4 -> " + indexOf4);

        String [] animals = { "Cat", "Cow", "Dog", "Elephant", "Lion", "Zebra"};
        int indexOfDog = Arrays.binarySearch(animals, "Dog");
        System.out.println("Index of Dog -> " + indexOfDog);

        //Ant -> -1
        int indexOfAnt = Arrays.binarySearch(animals, "Ant");
        System.out.println("Index of Ant -> " + indexOfAnt);
    }
}
