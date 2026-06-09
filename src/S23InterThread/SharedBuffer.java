package S23InterThread;

public class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait until the buffer is empty
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that data is produced
    }

    //consumer
    public synchronized void consume(){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Consumed: " + data);
        hasData = false;
        notify(); // Notify the producer that data is consumed
    }
}
