package S18JavaIO.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    String name, surname;
    int age;
    boolean married;
    transient long personID;
    transient Weights weight;
    double personWeight;

    public Person(String name, String surname, int age, boolean married, long personID, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;
        this.personID = personID;

        this.weight = new Weights(weight);
        personWeight = this.weight.weight;
    }

    public String toString() {
        return "Name: " + this.name + ", Surname: " + this.surname + ", Age: " + this.age + ", Married: " + this.married + "\nPersonID: " + this.personID + ", Weight: " + this.personWeight;
    }
}
