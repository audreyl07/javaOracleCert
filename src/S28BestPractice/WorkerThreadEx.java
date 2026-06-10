package S28BestPractice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class WorkerThreadEx {
    public static void main(String[] args) {
        BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
        int numOfWorkers = 3;

        Worker[] workers = new Worker[numOfWorkers];
        for (int i=0; i<numOfWorkers; i++){
            workers[i] = new Worker(taskQueue);
            workers[i].start();
        }

        for (int i=1; i<= 10; i++){
            taskQueue.add(new Task(i));
        }

        try {
            Thread.sleep(12000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Worker worker: workers){
            worker.interrupt();
        }
    }
}
