package JavaOOPS9.RecordClasses;

public class RTest {
    public static void main(String[] args) {

//        Person2 person = new Person2("John Doe", 20);
//
//        System.out.println("Name: " + person.getName());
//        System.out.println("Name: " + person.getAge());
//        System.out.println(person.toString());
//
//        Person2 person2 = new Person2("John Doe", 20);
//        System.out.println(person.equals(person2));
//        System.out.println(person.hashCode());
//        System.out.println(person2.hashCode());

        Person person = new Person("John Doe", 20);

        System.out.println("Name: " + person.name());
        System.out.println("Name: " + person.age());
        System.out.println(person.toString());

        Person person2 = new Person("John Doe", 20);
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        Person person3 = new Person("Paul Smith", 25);
        System.out.println(person.isAdult());

        //OuterPerson.InnerPerson
    }
}
