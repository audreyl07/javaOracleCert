package CollectionsS12;


import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //polymorphism, we can use List interface to create an ArrayList object
        List<Integer> list2;
        list2 = new ArrayList<>();

        List<Double> list3 = new ArrayList<>(); //we can only use wrapper classes
        Collection<Integer> list4 = new ArrayList<>();

        //List list5 = new ArrayList(); //accepted as raw type. the default is object.
        List <String> list5 = new ArrayList(); //we can use raw type but it is not recommended as it can lead to runtime errors. it is better to use generics to specify the type of elements in the list.

    }

}
