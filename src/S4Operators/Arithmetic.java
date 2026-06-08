package S4Operators;

public class Arithmetic {
    public static void main(String[] args) {
        double num1 = 8.4, num2 = 4.2, result = 0.0;
        result = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+result);

        result = num1 - num2;
        System.out.println("The difference of "+num1+" and "+num2+" is "+result);

        result = num1 * num2;
        System.out.println("The product of "+num1+" and "+num2+" is "+result);

        result = num1 / num2;
        System.out.println("The quotient of "+num1+" and "+num2+" is "+result);

        //concatenation of strings
        String str1 = "java";
        String str2 = "programming";
        String str3 = str1 + " " + str2;
        System.out.println(str3);
    }
}
