package S26PerformanceandScalability;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockEx {

    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task1 = () -> {
            lock1.lock();
            try {
                System.out.println("Thread-1 locked. Waiting for lock 2...");
                Thread.sleep(100L);
                lock2.lock();
                try {
                    System.out.println("Thread-1 acquired lock 2");
                } finally {
                    lock2.unlock();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock1.unlock();
            }
        };

        Runnable task2 = () -> {
            lock2.lock();
            try {
                System.out.println("Thread-2 locked. Waiting for lock 1...");
                Thread.sleep(100L);
                lock1.lock();
                try {
                    System.out.println("Thread-2 acquired lock 1");
                } finally {
                    lock1.unlock();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock2.unlock();
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }


}
