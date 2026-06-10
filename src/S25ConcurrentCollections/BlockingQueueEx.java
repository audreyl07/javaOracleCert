package S25ConcurrentCollections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueEx {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);
        Thread producer = new Thread(() -> produce(queue));
        Thread consumer = new Thread(() -> consume(queue));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void produce (BlockingQueue<Integer> queue ){
        for (int i=1; i<= 5; i++){
            try {
                queue.put(i);
                System.out.println("Produced: "+ i);
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void consume (BlockingQueue<Integer> queue ){
        for (int i=0; i<= 5; i++){
            int value = 0;
            try {
                value = queue.take();
                System.out.println("consumed: " + value);
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
