package S27JVM;

public class JVMThreadTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new CustomTask(), "Thread 1");
        Thread t2 = new Thread(new CustomTask(), "Thread 2");
        Thread t3 = new Thread(new CustomTask(), "Thread 3");
        System.out.println("Before start T1: " + t1.getState());
        System.out.println("Before start T2: " + t2.getState());
        System.out.println("Before start T3: " + t3.getState());

        t1.start();
        t2.start();
        t3.start();

        System.out.println("After start T1: " + t1.getState());
        System.out.println("After start T2: " + t2.getState());
        System.out.println("After start T3: " + t3.getState());

    }
}
