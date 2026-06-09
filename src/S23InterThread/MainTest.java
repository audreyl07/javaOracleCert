package S23InterThread;

public class MainTest {
    public static void main(String[] args) {
        //Producer Consumer Example with Lock
        LockAndCondition lockAndCondition = new LockAndCondition();
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                lockAndCondition.produce(i);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer Thread");

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                lockAndCondition.consume();
                try {
                    Thread.sleep(700L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer Thread");

        producerThread.start();
        consumerThread.start();

        //Produce Consumer Example
        /*
        SharedBuffer sharedBuffer = new SharedBuffer();
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedBuffer.produce(i);
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer Thread");

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedBuffer.consume();
                try {
                    Thread.sleep(700L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer Thread");

        producerThread.start();
        consumerThread.start();
        */
    }
}
