package JavaOOPS9.var;

public class VarExamples {
    public static void main(String[] args) {
        var num = 10; // Inferred as int
        var name = "John"; // Inferred as String

        var animals = new String[5]; // Inferred as String array

        var person = new Person();
        //var age; //must initialize
        //var text = null; doesn't work

        //var [] numbers = new int[5]; //automatically assigns type
        //lambda
        //var function = anyString -> anyString.length();

    }
    class Var{

    }

    public static void var(){
        //return type and method parameters cannot be inferred using var
    }
}
