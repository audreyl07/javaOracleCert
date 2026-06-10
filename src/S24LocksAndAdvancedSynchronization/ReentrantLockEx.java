package S24LocksAndAdvancedSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {

    private final Lock lock = new ReentrantLock();
    private int counter = 0;
    public void increment(){
        lock.lock();
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
        } finally {
            lock.unlock();
        }
    }
}
