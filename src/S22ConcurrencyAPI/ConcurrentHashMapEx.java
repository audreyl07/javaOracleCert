package S22ConcurrencyAPI;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        //makes it thread safe and allows concurrent modifications without throwing ConcurrentModificationException
        //uses fine grain locking mechanism to allow multiple threads to access different segments of the map concurrently, improving performance in multi-threaded environments
        Map<String, String > taskResult = new ConcurrentHashMap<>();
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(3);

        for (int i=0; i<6; i++){
            String taskName = "Task " + i;
            executorService.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " is executing " + taskName);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                } taskResult.put(taskName, "Completed by: " + threadName);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Task Results: ");
        taskResult.forEach((task, result) -> System.out.println(task + ": " + result));
    }
}
