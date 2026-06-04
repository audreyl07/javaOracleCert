package StreamExpressionsS16;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectOperation {
    public static void main(String[] args) {
        /*
        List<String> names = Arrays.asList("David", "Mary", "Clark", "Andy", "Sara", "Mary");
        List<String> collectedNames = names.stream()
                .filter(n -> n.length() > 4)
                .collect(Collectors.toList());
        System.out.println("Collected Names: " + collectedNames);
        Set<String> collectedNamesSet = names.stream()
                .filter(n -> n.length() > 4)
                .collect(Collectors.toSet());
        System.out.println("Collected Names: " + collectedNamesSet);

        String joinedNames = names.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println("Joined Names: " + joinedNames);

        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Names by Length: " + namesByLength);

        Map<Boolean, List<String>> partitionByLength= names.stream()
                .collect(Collectors.partitioningBy(n->n.length() > 4));
        System.out.println("Partitioned Names: " + partitionByLength);

        LinkedList<String> collectedNamesLinkedList = names.stream()
                .filter(n -> n.length() > 4)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Collected Names in LinkedList: " + collectedNamesLinkedList);

        List<Employee> employees = Arrays.asList(
                new Employee("David", 3000, Employee.Sex.MALE),
                new Employee("Mary", 2500, Employee.Sex.FEMAlE),
                new Employee("Clark", 3500, Employee.Sex.MALE),
                new Employee("Andy", 4500, Employee.Sex.MALE),
                new Employee("Sara", 2000, Employee.Sex.FEMAlE)

        );

        Map<Employee.Sex, Integer> totalSalary = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getGender, Collectors.summingInt(Employee::getSalary)
                        )
                );
        System.out.println("Total Salary by Gender: " + totalSalary);

        SalaryCollector salaryCollector = employees.stream()
                .map(Employee::getSalary)
                .collect(
                        SalaryCollector::new
                        , SalaryCollector::accept
                        , SalaryCollector::combine
                );
        System.out.println("Total Salary: " + salaryCollector.getTotal());


         */

        List<Employee> employees = Arrays.asList(
                new Employee("David", 3000, Employee.Sex.MALE),
                new Employee("Mary", 2500, Employee.Sex.FEMAlE),
                new Employee("Clark", 3500, Employee.Sex.MALE),
                new Employee("Andy", 4500, Employee.Sex.MALE),
                new Employee("Sara", 2000, Employee.Sex.FEMAlE)

        );

        Map<Employee.Sex, SalaryCollector> totalSalaryByGender = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getGender,
                                        Collectors.mapping(Employee::getSalary, Collector.of(
                                        SalaryCollector::new,
                                        SalaryCollector::accept,
                                                (salary1, salary2) -> {
                                                    salary1.combine(salary2);
                                                    return salary1;
                                                }
                                )
                        )
                ));
        totalSalaryByGender.forEach((g, s) -> System.out.println("Total Salary for " + g + ": " + s.getTotal() + ", Count: " + s.getCount()));

    }

}
