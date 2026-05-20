package JavaOOPS8;

public class Naming {
    //we cannot put numbers as the first letter in the class name
    //we cannot put special characters in the class name except underscore and dollar sign

    public static void main(String[] args) {
        int java; //valid
        int _java; //valid
        int $java; //valid
        int _$java; //valid

        //int public; //invalid because public is a reserved keyword
        int Public; //valid because it is not a reserved keyword, case-sensitive

    }

    void java(){}; //valid method name
    void _java(){}; //valid method name

}
