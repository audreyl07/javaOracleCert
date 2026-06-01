package CollectionsS12;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx {
    public static void main(String[] args) {

        Deque<String> carsDeque = new LinkedList<>();
        carsDeque.add("Mercedes");
        carsDeque.add("BMW");
        carsDeque.add("Ferrari");
        carsDeque.addFirst("Ford");
        carsDeque.addLast("Opel");
        carsDeque.push("Honda");
        carsDeque.offer("Hyundai");
        carsDeque.offerFirst("Kia");
        carsDeque.offerLast("Renault");

         System.out.println("carsDeque: " + carsDeque);
         System.out.println("first element: " + carsDeque.peekFirst());
         System.out.println("last element: " + carsDeque.peekLast());

         System.out.println("remove first element: " + carsDeque.removeFirst());
         System.out.println("remove last element: " + carsDeque.removeLast());
        System.out.println("carsDeque: " + carsDeque);
    }
}
