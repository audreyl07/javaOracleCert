package S12Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

    public static void main(String[] args) {
    //essentially you can sort the elements in a list by custom rule
        ArrayList<CarsEx> carList = new ArrayList<>();
        carList.add(new CarsEx("Mercedes", 2020, 10000));
        carList.add(new CarsEx("BMW", 2018, 12000));
        carList.add(new CarsEx("Ferrari", 2025, 20000));
        carList.add(new CarsEx("Ford", 2024, 15000));
        carList.add(new CarsEx("Opel", 2020, 10000));

        Comparator <CarsEx> comparator = Comparator.comparing (CarsEx::getPrice);
        Collections.sort(carList, comparator);

        for (CarsEx car: carList){
            System.out.println("Car "+ car.getCarName() + "\tYear: " + car.getYear() + "\tPrice: " + car.getPrice());
        }
        /*
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('b');
        charList.add('Z');
        charList.add('A');
        charList.add('Z');
        charList.add('d');
        charList.add('F');

        Collections.sort(charList, new MyChars());
        System.out.println(charList);

         */
    }
}


class MyChars implements Comparator<Character> {
    //can be sorted by ascending and descending order by changing the return values in the compare method. if we want to sort in ascending order, we can return 1 if c1 is greater than c2, -1 if c1 is less than c2 and 0 if they are equal. if we want to sort in descending order, we can return -1 if c1 is greater than c2, 1 if c1 is less than c2 and 0 if they are equal.
    @Override
    public int compare(Character c1, Character c2) {

        if (c1 > c2) {
            return 1;
        } else if (c1 < c2) {
            return -1;
        } else {
            return 0;
        } 
    }
}