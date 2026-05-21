package JavaOOPS8;

public class Nested {
    static String person1 = "John";
    private static String person2 = "David";
    public String person3 = "Andy";

    //if inner class static then it can only access static variables
    static class staticPerson{
        void show(){
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);
            //System.out.println("Person 3: " + person3); //Cannot access non-static variable from static context
        }
    }
}
