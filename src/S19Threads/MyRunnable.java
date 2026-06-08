package S19Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable is running");
    } //allows us to separate the thread logic from the thread management, and also allows us to extend another class if needed, since Java does not support multiple inheritance.
}
