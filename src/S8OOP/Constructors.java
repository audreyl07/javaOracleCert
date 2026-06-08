package S8OOP;

public class Constructors {
    private String name;
    private double weight;
    private int age;
    private int salary;

    //basic 2 parameter constructor
    public Constructors(String name, double weight){
        this.name = name; //initializes the instance variable name
        this.weight = weight;
    }

    public Constructors(String name, double weight, int age, int salary){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.salary = salary;
    }

    public void wakeUp(){
        System.out.println(this.name + " woke up.");
    }
    public void eat(){
        System.out.println(this.name + " had breakfast.");
        this.weight += 1;
    }

    public void doExercise(){
        System.out.println(this.name + " did exercise.");
        this.weight -= 1;
    }

    public void showWeight(){
        System.out.println("The current weight of " + this.name + " is " + this.weight + " kg. ");
    }

    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " Weight: " + weight + " Salary: " + this.salary;
    }

}
