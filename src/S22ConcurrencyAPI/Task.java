package S22ConcurrencyAPI;

public class Task implements Runnable{
    private String taskName;
    public Task ( String taskName) {
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskName + " is running " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task " + taskName + " is complete");
    }
}
