package S11String;

public class StringImmutability {
    public static void main(String[] args) {

        //compare primitive vs strings
        int age = 20;
        age++; //mutable
        System.out.println(age); //21

        String message = "Hello";
        System.out.println(System.identityHashCode(message)); //ID of the original string object
        message = message.concat(" World"); //like the +, since it is immutable then it technically won't be added on.
        System.out.println(System.identityHashCode(message)); //ID of the original string object, since it is immutable, it will still be the same ID.
        System.out.println(message);

        String s = "andriod";
        String s2 = s.toUpperCase(); //since it is immutable, it will not change the original string, instead it will create a new string object with the upper case version of the original string.
        //if you pass it to another variable then it can be changed
        System.out.println(s);
        System.out.println(s2);
    }
}
