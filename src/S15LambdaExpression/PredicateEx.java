package S15LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        /*
        Predicate<String> p0 = s -> (s.equals("Java"));
        boolean result = p0.test("Java"); //true
        System.out.println(result);

        Predicate<Integer> p1 = i -> (i<10);
        boolean result1 = p1.test(5); //true
        System.out.println(result1);

        Predicate<Integer> i2 = i -> (i > 5);
        boolean result2 = p1.or(i2).test(7); //false
        System.out.println(result2);


        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Ant");
        animals.add("Lion");

        System.out.println("Animals: " + animals);
        animals.removeIf(animal -> (animals.equals("Ant")));
        System.out.println("new Animals: " + animals);

         */

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a number: ");
        int enteredNum = scanner.nextInt();

        if (isEven(enteredNum, n -> n % 2 == 0)){
            System.out.println(enteredNum + " is even");
        } else {
            System.out.println(enteredNum + " is odd");
        }

        scanner.close();
    }
    public static boolean isEven(int num, Predicate<Integer> p){
        return p.test(num);
    }
}
