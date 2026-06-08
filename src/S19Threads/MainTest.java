package S19Threads;

public class MainTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("Main thread is running");
        /*
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Main thread is running");
         */
    }
}
