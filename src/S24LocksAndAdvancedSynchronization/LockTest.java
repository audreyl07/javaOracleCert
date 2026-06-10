package S24LocksAndAdvancedSynchronization;

public class LockTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        ReentrantLockEx reentrantLock = new ReentrantLockEx();

        Thread t1 = new Thread(reentrantLock::increment, "Thread-1");
        Thread t2 = new Thread(reentrantLock::increment, "Thread-2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

         */

        ReadWriteLockEx readWriteLock = new ReadWriteLockEx();
        Thread writerThread = new Thread (() -> readWriteLock.writeData(49), "Writer Thread");

        Thread r1 = new Thread(readWriteLock::readData, "Reader Thread 1");
        Thread r2 = new Thread(readWriteLock::readData, "Reader Thread 2");

        writerThread.start();
        r1.start();
        r2.start();

        writerThread.join();
        r1.start();
        r2.start();

    }
}
