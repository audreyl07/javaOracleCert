package S25ConcurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollectionEx {
    public static void main(String[] args) {
        List<String> orderList  = new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(() -> addOrder(orderList, "Order 1"));
        Thread t2 = new Thread(() -> addOrder(orderList, "Order 2"));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("order list: " + orderList);
    }

    public static void addOrder(List<String> orderList, String order){
        orderList.add(order);
        System.out.println(Thread.currentThread().getName() + " added " + order);
    }
}
