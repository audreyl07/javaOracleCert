package S26PerformanceandScalability;

import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
        integers.parallelStream().forEach( integer -> {
            System.out.println("thread: " + Thread.currentThread().getName() + " Number: " + integer + " Square: " + (integer*integer));
        });

    }
}
