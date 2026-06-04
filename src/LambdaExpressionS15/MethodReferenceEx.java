package LambdaExpressionS15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceEx {
    public static void main(String[] args) {
        //static method reference
        Function<String, Integer> s = Integer::parseInt;
        Integer result = s.apply("123");
        System.out.println(result);

        //method reference via an object
        String str = "hello";
        Supplier<String> stringSupplier = () -> str.toUpperCase();
        System.out.println(stringSupplier.get());

        //Calling constructor of a class
        Supplier<ArrayList<String>> arrayListSupplier = () -> new ArrayList<>();
        ArrayList<String> list = arrayListSupplier.get();

        //list of makes it immutable
        /*
        List<String> animals = List.of("Cat", "Cow", "Dog", "Horse");
        Consumer<String> consumer = System.out::println; //method reference
        animals.forEach(consumer);

        List<String> animals = List.of("Cat", "Cow", "Dog", "Horse");
        animals.forEach(animal -> {
            if (animal.startsWith("C")){
                System.out.println(animal);
            }
        });

         */
    }
}
