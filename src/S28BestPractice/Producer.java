package S28BestPractice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                int value = (int) (Math.random() * 100);
                System.out.println("produced: " + value);
                queue.put(value);
                TimeUnit.MILLISECONDS.sleep(500L);
            } queue.put(-1);

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
