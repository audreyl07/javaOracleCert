package S16StreamExpressions;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.*;

public class ParallelStreamEx {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.parallelStream().forEach(n -> System.out.print(n + " "));
        //Since the stream is parallel, the order of output may not be the same as the order that is in the List.

        //Concurrent Reduction
        ConcurrentMap<Boolean, List<Integer>> groupedNumbers = numbers.parallelStream()
                .collect(Collectors.groupingByConcurrent(n -> n%2 == 0));
        System.out.println("Grouped Numbers: " + groupedNumbers);

        Set<Collector.Characteristics> characteristics = Collectors.groupingByConcurrent(n-> "Java").characteristics();
        System.out.println("Characteristics: " + characteristics);

        //Ordering
        System.out.println("List of Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        Comparator<Integer> reverse = Comparator.reverseOrder();
        numbers.sort(reverse);
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("Parallel stream:");
        numbers.parallelStream().forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

}
