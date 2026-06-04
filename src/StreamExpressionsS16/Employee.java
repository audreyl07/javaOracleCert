package StreamExpressionsS16;

public class Employee {
    String name;
    int salary;
    public enum Sex{
        MALE, FEMAlE;
    }

    Sex gender;
    public Employee(String name, int salary, Sex gender){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Sex getGender() {
        return gender;
    }
}
