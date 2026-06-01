package CollectionsS12;

import java.util.ArrayList;
import java.util.Collections;

public class SearchInList {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(19);
        numbersList.add(11);
        numbersList.add(17);
        numbersList.add(15);
        numbersList.add(39);
        numbersList.add(27);
        numbersList.add(22);

        Collections.sort(numbersList); //binary search works only on sorted lists
        System.out.println(Collections.binarySearch(numbersList, 17));
        //similar to logic in arrays


    }
}
