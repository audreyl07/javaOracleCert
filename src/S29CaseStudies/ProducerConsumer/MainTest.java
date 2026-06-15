package S29CaseStudies.ProducerConsumer;

public class MainTest {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);

        Thread pThread = new Thread(new Producer(sharedBuffer));
        Thread cThread = new Thread(new Consumer(sharedBuffer));

        pThread.start();
        cThread.start();
    }
}
