package S22ConcurrencyAPI;

import java.util.concurrent.*;
public class ScheduleExecutorEx {
    public static void main(String[] args) {
        //schedules tasks to run after a delay or periodically
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        for(int i=0; i< 5; i++){
            Task task = new Task ("Task " + i);
            scheduledExecutorService.schedule(task, i+2, TimeUnit.SECONDS);
        }
        //regular delay between the end of one execution and the start of the next
        scheduledExecutorService.scheduleAtFixedRate(new Task("Fixed Rate Task"), 1, 5, TimeUnit.SECONDS);

        //delay between the end of one execution and the start of the next
        scheduledExecutorService.scheduleWithFixedDelay(new Task("Fixed Delay Task") , 2, 5, TimeUnit.SECONDS);
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduledExecutorService.shutdown();
        System.out.println("Shutdown scheduled executor service");



    }
}
