package S19Threads.ThreadStateMonitoring;

public class MainTestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("Thread state before start: " + myThread.getState());
        myThread.start();
        System.out.println("Thread state after start: " + myThread.getState());
    }
}
