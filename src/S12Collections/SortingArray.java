package S12Collections;

import java.util.*;


public class SortingArray {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(2.3);
        list.add(11.0);
        list.add(4.6);
        list.add(-3.6);
        list.add(0.8);
        list.add(12.0);

        System.out.println("Unsorted list: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        //Integer
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(-5);
        list2.add(10);
        list2.add(2);
        list2.add(9);

        System.out.println("Unsorted list: " + list2);
        Collections.sort(list2);
        System.out.println("Sorted list: " + list2);

        //Characters
        List<Character> list3 = new ArrayList<>();
        list3.add('F');
        list3.add('B');
        list3.add('b');
        list3.add('H');
        list3.add('c');
        list3.add('A');
        System.out.println("Unsorted list: " + list3);
        Collections.sort(list3);
        System.out.println("Sorted list: " + list3);

        //Strings
        List<String> list4 = new ArrayList<>();
        list4.add("cat");
        list4.add("Dog");
        list4.add("Monkey");
        list4.add("Lion");
        list4.add("elephant");
        list4.add("Cow");
        System.out.println("Unsorted list: " + list4);
        Collections.sort(list4);
        System.out.println("Sorted list: " + list4);

        // Represented as Numbers
        List<String> list5 = new ArrayList<>();
        list5.add("3");
        list5.add("300");
        list5.add("20");
        list5.add("35");
        list5.add("37");
        list5.add("31");
        list5.add("4");
        list5.add("7");
        list5.add("ant");
        list5.add("Zebra");

        //the sorting logic is that they compare the first number and sort like that, then if they check the second number and sort based on that order.
        System.out.println("Unsorted list: " + list5);
        Collections.sort(list5);
        System.out.println("Sorted list: " + list5);
    }
}
