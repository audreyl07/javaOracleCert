package S26PerformanceandScalability;

import java.util.concurrent.*;

public class ThreadPoolEx {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating the square of 5.");
            return 5*5;
        };
        Callable<Integer> task2 = () -> {
                    System.out.println(Thread.currentThread().getName() + " is calculating the square of 7.");
                    return 7*7;
        };
        Callable<Integer> task3 = () -> {
                    System.out.println(Thread.currentThread().getName() + " is calculating the square of 10.");
                    return 10*10;
        };

        try {
            Future<Integer> r1 = executor.submit(task1);
            Future<Integer> r2 = executor.submit(task2);
            Future<Integer> r3 = executor.submit(task3);

            System.out.println("Square of 5: " + r1.get());
            System.out.println("Square of 7: " + r2.get());
            System.out.println("Square of 10: " + r3.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
