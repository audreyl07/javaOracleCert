package S27JVM;

public class ThreadPriorityEx {
    public static void main(String[] args) {

        Thread highPriority = new Thread( () -> {
            for (int i=1; i<=5; i++){
                System.out.println("high priority thread: " + i);
            }
        }, "High Priority Thread");

        Thread mediumPriority = new Thread( () -> {
            for (int i=1; i<=5; i++){
                System.out.println("medium priority thread: " + i);
            }
        }, "Medium Priority Thread");

        Thread lowPriority = new Thread( () -> {
            for (int i=1; i<=5; i++){
                System.out.println("low priority thread: " + i);
            }
        }, "Low Priority Thread");

        highPriority.setPriority(Thread.MAX_PRIORITY);
        mediumPriority.setPriority(Thread.NORM_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);

        highPriority.start();
        mediumPriority.start();
        lowPriority.start();
    }
}
