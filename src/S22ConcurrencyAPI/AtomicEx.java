package S22ConcurrencyAPI;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {
    public static void main(String[] args) throws InterruptedException {
        //thread safe, can update without needing synchronized blocks or anything
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i=0; i<6; i++){
            executorService.submit(() -> {
                String threadName = Thread.currentThread().getName();
                int newValue = atomicInteger.incrementAndGet();
                System.out.println(threadName + " incremented value to: " + newValue);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Final value: " + atomicInteger.get());
    }
}
