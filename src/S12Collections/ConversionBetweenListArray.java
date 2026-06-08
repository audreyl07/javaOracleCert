package S12Collections;

import java.util.*;

public class ConversionBetweenListArray {
    public static void main(String[] args) {

        List<String> animalList = new ArrayList<>();
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Cow");
        animalList.add("Lion");

        //String[] animalArray = new String [animalList.size()];
        String [] animalArray = animalList.toArray(new String[animalList.size()]);

        //Object [] animalArray = animalList.toArray();
        //the regular method to convert list to an array
        /*
        String[] animalArray = new String[animalList.size()];
        for (int i=0; i<animalList.size(); i++){
            animalArray[i] = animalList.get(i);
        }
         */

        animalList.add("Ant");
        System.out.println("Animal list: " + animalList);
        System.out.println("Animal array: " + Arrays.toString(animalArray));

        //Array -> List
        String [] carArray = {"Mercedes", "BMW", "Audi"};
        //List<String> carList = Arrays.asList(carArray);
        //ArrayList<String> carList = new ArrayList<>(Arrays.asList(carArray));

        ArrayList<String> carList = new ArrayList<>();
        //Collections.addAll(carList, carArray);
        for (String car: carArray){
            carList.add(car);
        }

        carList.add("Opel"); // we cannot add any elements into the list if it is created by the asList method because it is a fixed size list. we can only modify the existing elements but cannot add or remove elements from the list. thus we need to create a new ArrayList and add the elements from the array to the list to be able to add or remove elements from the list.
        System.out.println("Car array: " + Arrays.toString(carArray));
        System.out.println("Car list: " + carList);
    }
}
