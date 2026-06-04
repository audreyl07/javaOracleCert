package StreamExpressionsS16;

import java.util.*;

public class ReductionOperation {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("David", 3000, Employee.Sex.MALE),
                new Employee("Mary", 2500, Employee.Sex.FEMAlE),
                new Employee("Clark", 3500, Employee.Sex.MALE),
                new Employee("Andy", 4500, Employee.Sex.MALE),
                new Employee("Sara", 2000, Employee.Sex.FEMAlE)

        );

        Optional<Employee> highestSalary= employees.stream()
                .reduce((a1,a2) -> a1.getSalary() > a2.getSalary() ? a1 : a2);
        highestSalary.ifPresent(e -> System.out.println("Employee with highest salary: " + e.getName() + " - " + e.getSalary()));

        int totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, (a,b) -> a+b);
        System.out.println("Total Salary: " + totalSalary);

        /*
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Optional<Integer> sum = nums.stream()
                .reduce((a,b) -> a+b);

        sum.ifPresent(n-> System.out.println("Sum: " + n));

        int sumWithInitialValue = nums.stream()
                .reduce (0, (a,b) -> a+b); //initial value is 0
        System.out.println("Sum: " + sumWithInitialValue);

        int elementsProduct = nums.stream()
                .reduce(1, (a,b) -> a*b); //initial value is 1
        System.out.println("Product: " + elementsProduct);

        Optional<Integer> max = nums.stream().reduce((a,b) -> a > b ? a:b);
        max.ifPresent(n -> System.out.println("Max: " + n));

         Optional<Integer> min = nums.stream().reduce((a,b) -> a < b ? a:b);
            min.ifPresent(n -> System.out.println("Min: " + n));

         */
    }
}
