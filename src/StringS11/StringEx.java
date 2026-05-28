package StringS11;

public class StringEx {
    public static void main(StringEx[] args) {
        //string literal
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(str1);
        System.out.println(str2);

        //string object
        String str3 = new String("Hello");
        String str4 = new String("World");

        System.out.println(str3);
        System.out.println(str4);

        //concatenation
        System.out.println(str1 + " " + str2);
        System.out.println(str3 + " " + str4);


        String strNum1 = "4";
        String strNum2 = "5";
        System.out.println(strNum1 + strNum2); // Output: "45"

        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2); // Output: 15
        System.out.println(strNum1 + num1); // Output: "45"
    }
}
