package StringS11;

import java.util.Arrays;

public class StringEquality {
    public static void main(String[] args) {
        //== (is equal to operator), equals()
/*
        String str1 = new String("Hello Developers");
        String str2 = new String("hello Developers");
        String str3 = "Hello Developers";
        String str4 = "Hello Developers";
        String str5 = "Hello" + " Developers";

        System.out.println(" == operator results:");
        System.out.println(str1 == str2);//false  s1 is considered a different object than s2 since the lower case hello. Thus it will refer to a different object in memory.
        System.out.println(str1 == str3);//false
        System.out.println(str1 == str4);//false
        System.out.println(str1 == str5);//false
        System.out.println(str2 == str3);//false
        System.out.println(str2 == str4);//false
        System.out.println(str2 == str5);//false
        System.out.println(str3 == str4);//true. These are all considered the same because in the string pool, it refers to the same string literal "Hello Developers".
        System.out.println(str3 == str5);//true
        System.out.println(str4 == str5);//true


        //System.identityHashCode()
        System.out.println("ID of s1: " + System.identityHashCode(str1));
        System.out.println("ID of s2: " + System.identityHashCode(str2));
        System.out.println("ID of s3: " + System.identityHashCode(str3));
        System.out.println("ID of s4: " + System.identityHashCode(str4));
        System.out.println("ID of s5: " + System.identityHashCode(str5));

        //equals()
        System.out.println("Equals() method results:");
        System.out.println(str1.equals(str2)); //false.
        System.out.println(str1.equals(str3)); //true.
        System.out.println(str1.equals(str4)); //true.
        System.out.println(str1.equals(str5)); //true
        System.out.println(str2.equals(str3)); //false
        System.out.println(str2.equals(str4)); //false
        System.out.println(str2.equals(str5)); //false
        System.out.println(str3.equals(str4)); //true
        System.out.println(str3.equals(str5)); //true
        System.out.println(str4.equals(str5)); //true
        //since Java is case sensitive, the equals() method will return false even if the content is the same.

        */

        //Wrapper and primitive types
        Integer age = 20;
        int age2 = 20;
        //both are literally created, so it will be true
//        System.out.println(age == age2);
//        System.out.println(age.equals(age2));

        //Arrays
        String [] animals1 = new String[] {"Dog", "Cat", "Bird"};
        String [] animals2 = {"Dog", "Cat", "Bird"};
        String [] animals3 = new String [3];
        animals3[0] = "Dog";
        animals3[1] = "Cat";
        animals3[2] = "Bird";
        String[] animals4 = animals1;

        System.out.println("== operator results:");
        System.out.println(animals1 == animals2); //false
        System.out.println(animals1 == animals3); //false
        System.out.println(animals1 == animals4); //true
        System.out.println(animals2 == animals3); //false
        System.out.println(animals2 == animals4); //false
        System.out.println(animals3 == animals4); //false

        System.out.println("Equals() method results:");
        System.out.println(animals1.equals(animals2)); //false.
        System.out.println(animals1.equals(animals3)); //false
        System.out.println(animals1.equals(animals4)); //true.
        System.out.println(animals2.equals(animals3)); //false
        System.out.println(animals2.equals(animals4)); //false
        System.out.println(animals3.equals(animals4)); //false

        System.out.println("Arrays equals results:");
        System.out.println(Arrays.equals(animals1,animals2));
        System.out.println(Arrays.equals(animals1,animals3));
        System.out.println(Arrays.equals(animals1,animals4));
        System.out.println(Arrays.equals(animals2,animals3));
        System.out.println(Arrays.equals(animals2,animals4));
        System.out.println(Arrays.equals(animals3,animals4));
        //it will all print true since all the elements are the same.
    }
}
