package CollectionsS12;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> carsQueue = new LinkedList<>();
        carsQueue.offer("Mercedes");
        carsQueue.offer("Ferrari");
        carsQueue.offer("Ford");
        carsQueue.offer("BMW");
        carsQueue.offer("Opel");

        /*
        System.out.println("carsQueue: " + carsQueue);
        System.out.println("size" + carsQueue.size());
        System.out.println("first element: " + carsQueue.peek());
        System.out.println("remove element: " + carsQueue.poll());
        System.out.println("carsQueue: " + carsQueue);
        //FIFO order
        */

        int size = carsQueue.size();
        for (int i=0; i<size; i++){
            System.out.println("removed element: " + carsQueue.poll());

        }

        System.out.println("carsQueue: " + carsQueue);
        //System.out.println("first element: " + carsQueue.element()); //throws an exception

    }
}
