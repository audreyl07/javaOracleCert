package S21Synchronized;

public class VolatileTest {
    public static void main(String[] args) {
        VolatileEx volatileEx = new VolatileEx();
        Thread thread= new Thread(volatileEx::run);
        thread.start();

        try{
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        volatileEx.stopRunning();
    }
}
