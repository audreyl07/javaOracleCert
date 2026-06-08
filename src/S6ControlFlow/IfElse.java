package S6ControlFlow;

public class IfElse {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();

        if(number % 2 != 0){ System.out.println("Number is odd"); }
        else { System.out.println("Number is even"); }



        boolean control = true;
        if (control == true){
            System.out.println("Control is true");
        } else {
            System.out.println("Control is false");
        }

        //input.close();

         */
        int age = 30;
        if (age > 10) {
            System.out.println("Age is greater than 10");
        }
        if (age > 20) {
            System.out.println("Age is greater than 20");
        }
        if (age == 30) {
            System.out.println("Age is equal to 30");
        }
        if (age > 40) {
            System.out.println("Age is greater than 40");
        }
    }
}
