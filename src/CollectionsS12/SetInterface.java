package CollectionsS12;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        /*
        Set<String> animalSet = new HashSet<>();
        animalSet.add("Cat");
        animalSet.add("Dog");
        animalSet.add("Lion");
        animalSet.add("Cow");
        animalSet.add("Ant");
        animalSet.add("Dog");

        System.out.println("Animal set: " + animalSet);
        System.out.println("size: " + animalSet.size());
        animalSet.remove("Cow");
        System.out.println("Animal set: " + animalSet);

        System.out.println("Contain sheep?: " + animalSet.contains("Sheep"));

         */
        /*
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(13);
        set1.add(17);
        set1.add(18);
        set1.add(16);
        set1.add(14);
        System.out.println("Set1: " + set1);

         Set<Integer> set2 = new HashSet<>();
         set2.add(10);
         set2.add(11);
         set2.add(12);
         set2.add(15);
         set2.add(13);
         set2.add(19);
         set2.add(13);
         System.out.println("Set2: " + set2);

         //Intersection -> retainAll()
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        //Union -> addAll()
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);
        //Difference -> removeAll()
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference: " + differenceSet);
         */

        HashSet<String> carHashSet = new HashSet<>();
        carHashSet.add("Mercedes");
        carHashSet.add("BMW");
        carHashSet.add("Ferrari");
        carHashSet.add("Ferrari");
        carHashSet.add("Ford");
        carHashSet.add("Opel");
        carHashSet.add("Opel");
        carHashSet.add("Honda");
        //stores them in a hash and not in the order added

        System.out.println("Car HashSet: " + carHashSet);

        //LinkedHashSet -> maintains the order of insertion
        LinkedHashSet<String> carLinkedHashSet = new LinkedHashSet<>();
        carLinkedHashSet.add("Mercedes");
        carLinkedHashSet.add("BMW");
        carLinkedHashSet.add("Ferrari");
        carLinkedHashSet.add("Ferrari");
        carLinkedHashSet.add("Ford");
        carLinkedHashSet.add("Opel");
        carLinkedHashSet.add("Opel");
        carLinkedHashSet.add("Honda");

        System.out.println("Car LinkedHashSet: " + carLinkedHashSet);

         //TreeSet -> stores the elements in a sorted order
        TreeSet<String> chars = new TreeSet<>();
        chars.add("P");
        chars.add("L");
        chars.add("R");
        chars.add("W");
        chars.add("W");
        chars.add("N");
        chars.add("B");
        chars.add("T");
        chars.add("T");
        chars.add("A");

        System.out.println("Descending: " + chars.descendingSet());
        System.out.println("chars: " + chars);
        System.out.println("head set: " + chars.headSet("N", false)); //returns the elements that are less than the specified element
        System.out.println("subset: " + chars.subSet("L",  "T"));
        System.out.println("tail set: " + chars.tailSet("N"));  //returns the elements that are greater than the specified element
        System.out.println("first: " + chars.first());
        System.out.println("last: " + chars.last());

        System.out.println("remove first: " + chars.pollFirst());
        System.out.println("remove last: " + chars.pollLast());
        System.out.println("chars: " + chars);
    }
}
