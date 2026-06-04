package LambdaExpressionS15;

public class SwitchExpression {
    public static void main(String[] args) {
        /*

        int day = 3;
        String message = "";
        message = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("hello");
                yield "Workday";
        }
            case 6,7 -> {yield "Weekend";}
            default -> {yield "Invalid day";}
        };
        System.out.println(message);

         */

        Object obj = 132;
        String message = switch (obj){
            case Integer i -> "obj " + "is an Integer: " + i;
            case String s -> "obj " + "is a String: " + s;
            default -> "Unknown type";
        };

        /*
        if (obj instanceof String s){
            System.out.println("String: " + s);
        } else if (obj instanceof Integer i){
            System.out.println("Integer: " + i);
        } else {
            System.out.println("Unknown type");
        }

         */

        //Enum
        Days day = Days.MONDAY;
        String messages = switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Workday";
            case SATURDAY, SUNDAY -> "Weekend";
            default -> "Invalid day";
        };

    }
    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
