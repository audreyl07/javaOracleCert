package CollectionsS12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIteratorEx {

    public static void main(String[] args) {
        ArrayList <Integer> numbersList = new ArrayList<>();

        int i = 1;
        while(i < 51){
            numbersList.add(i);
            i++;
        }
        //ListIterator
        ListIterator<Integer> listIterator = numbersList.listIterator();
        while (listIterator.hasNext()){
            int index = listIterator.nextIndex();
            System.out.print(index + " ");

            int eachElement = listIterator.next();
            if (eachElement % 3 != 0){
                listIterator.set(-1);
            }
        }
        System.out.println();
        System.out.println("Numbers list: " + numbersList);

        /*
        System.out.println("Numbers list: " + numbersList);
        //Iterator
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()){
            int eachNum = iterator.next();
            if (eachNum % 3 == 0){
                iterator.remove();
            }
        }
        System.out.println("new list: " + numbersList);

         */
    }
}
