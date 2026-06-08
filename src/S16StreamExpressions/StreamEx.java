package S16StreamExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,10,3,6,1,15,4,9,16,5);

        numbers.stream()
                .filter(n -> n % 2 == 0) //filtering even numbers, an intermediate operation
                .map (n -> n+1)
                .sorted()
                .distinct()
                .forEach(System.out::println); //terminal operation,

        //Terminal Operation methods -> do not return a stream
        //Intermediate Operation methods -> return a stream

        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        Stream<String> animalStream = animals.stream();
        animalStream.map(String::toUpperCase).forEach(System.out::println);
    }
}
