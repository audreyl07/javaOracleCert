package CollectionsS12;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList();
        ages.add(20);
        ages.add(25);
        ages.add(30);

        System.out.println("ages: " + ages);//toString method is overridden in ArrayList class to return the elements in the list.

        ArrayList<Object> mixList = new ArrayList();
        mixList.add("Java");
        mixList.add(20);
        mixList.add(true);

        System.out.println("mixList: " + mixList);

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add(2, "Dog");
        animals.add(1, "Cow");

        System.out.println("animals: " + animals);

        animals.remove(2); //removes the element at index 2
        System.out.println("animals: " + animals);
        animals.remove("Lion");
        System.out.println("animals: " + animals);

        animals.set(1, "Ant");
        System.out.println("animals: " + animals);

        ArrayList<String> cars = new ArrayList<>();
        System.out.println("size: " + cars.size());
        System.out.println("Is cars empty? " + cars.isEmpty());

        cars.add("Mercedes");
        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println("opel? " + cars.contains("Opel"));
        System.out.println("bmw? " + cars.contains("BMW"));

        cars.clear();
        System.out.println("size: " + cars.size());

        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Andy");
        names.add("Clark");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("David");
        names2.add("Andy");
        names2.add("Clark");

        System.out.println(names.equals(names2));

    }
}
