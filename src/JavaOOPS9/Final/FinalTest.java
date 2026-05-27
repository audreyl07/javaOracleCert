package JavaOOPS9.Final;

public class FinalTest {

    public static final int NUMBER = 10;
    public static void main(String[] args) {
        Car car = new Car();
        //if created using final, then it is techincally considered a constant
        car.model = "Ferrari";
        car.showMaxSpeed();


        //you can modify the value of the variable, but you cannot reassign it to a different value
        int num1 = NUMBER;
        int num2 = num1--;
        int result = NUMBER/2;

        for (int i=0; i<NUMBER; i++){
            System.out.println("i: " + i);
        }

    }
}
