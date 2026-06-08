package S8OOP;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructors person = new Constructors("David", 60);
        person.wakeUp();
        person.showWeight();
        person.eat();
        person.showWeight();
        person.doExercise();
        person.showWeight();


        Constructors person2 = new Constructors("David", 60, 30, 2000);
        System.out.println(person2);
    }

    //toString() returns the package name, class name and an id (reserves memory in stack and heap)

}
