package S22ConcurrencyAPI;

import java.util.concurrent.*;

public class FutureCallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<String> callableTask = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is executing the task");
            Thread.sleep(2000L);
            return "Task completed by " + threadName;
            //callable can return a string result, while runnable cannot return anything

        };
        //we also can use future to get the result of the callable task
        Future<String> futureResult = executorService.submit(callableTask);
        String result = futureResult.get();
        System.out.println("Result: " + result);
        executorService.shutdown();

    }
}
