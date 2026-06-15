package S28BestPractice.ExceptionsInThreads;

import java.util.concurrent.*;

public class CallableExceptionEx {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {

                        System.out.println(Thread.currentThread().getName() + ": Task Started");
                        double value = Math.random();
                        System.out.println("Generated number for thread: " + Thread.currentThread().getName() + " is " + value);

                        if (value > 0.5) {
                            throw new RuntimeException("simulation error");
                        }
                        Thread.sleep(1000L);
                        return (Thread.currentThread().getName() + ": Task completed successfully.");
        };
        Future<String> future = executor.submit(task);

        try {
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("task interrupted");
        } catch (ExecutionException e) {
            System.out.println("Task failed with exception: " + e.getCause().getMessage());
        } finally {
            executor.shutdown();
        }
    }
}

