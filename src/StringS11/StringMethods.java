package StringS11;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Java Developers";
        String s2 = "Hello";
        String s3 = "hello";

        //trim()
        System.out.println("     Hello Java World".trim());

        //replace()
        System.out.println(s1.replace(' ', '/')); //Jovo Developers

        //contains()
        System.out.println(s1.contains("op")); //true
        System.out.println(s1.contains("J".toLowerCase())); //false

        //startsWith() and endsWith()
        System.out.println(s2.startsWith("H")); //true
        System.out.println(s2.startsWith("h".toUpperCase())); //false
        System.out.println(s1.endsWith("ers"));

        //equalsIgnoreCase()
        System.out.println(s2.equalsIgnoreCase(s3)); //true

        //substring()
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,12));

        //charAt()
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(4));
        //System.out.println(s1.charAt(25)); //out of bounds

        //indexOf
        System.out.println(s1.indexOf('p'));
        System.out.println(s1.indexOf('v',5));
        System.out.println(s1.indexOf("lop"));
        System.out.println(s1.indexOf("lop", 12));

        /*
        String str1 = "Hello Java Developers";
        String str2 = "Java is fun";
        String [] str3;

        System.out.println("str1: " + str1);
        System.out.println("str1 length: "  + str1.length());
        System.out.println("str1 char at index 0: " + str1.charAt(0));
        System.out.println("is str1 empty? " + str1.isEmpty());
        System.out.println("substring: " + str1.substring(6));
        System.out.println("str1 is equal to str2?: " + str1.equals(str2));
        System.out.println("str1 + str2: " + str1.concat(str2));
        System.out.println("str1 in lowercase: " + str1.toLowerCase());
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("replace l with L: " + str1.replace('l','L'));
        str3 = str1.split(" ");
        System.out.println("str3: " + Arrays.toString(str3));

         */
    }
}
