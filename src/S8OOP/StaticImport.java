package S8OOP;

public class StaticImport {
    public static int currentSalary = 1000;
    public static void showSalary(int salary){
        System.out.println("Current salary is: " + salary);
    }
    public static void increase(int raise){
        System.out.println("You received a raise of: " + raise);
        currentSalary += raise;
        showSalary(currentSalary);
    }
}
