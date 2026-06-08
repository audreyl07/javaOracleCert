package S21Synchronized;

public class VolatileEx {
    private volatile boolean running = true;
    //the volatile keyword ensures that changes to the running variable are immediately visible to all threads
    //it is for simple operations like reading/writing a boolean, but does not provide atomicity for compound operations

    public void stopRunning() {
        running = false; // This will be visible to other threads immediately
    }

    public void run(){
        while (running) {
            System.out.println("Running...");
        }
        System.out.println("Stopped running");
    }
}
