package S9JavaOOP.Final;

//final means no extension of the class is allowed, so we cannot extend the Vehicle class to Car class
public class Car extends Vehicle{
        @Override
        public void showMaxSpeed() {
            System.out.println("Max speed of the car is 200 km/h");
        }
}
