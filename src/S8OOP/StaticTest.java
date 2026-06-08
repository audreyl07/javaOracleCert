package S8OOP;

public class StaticTest {
    public static void main(String[] args) {
        Static.showCurrentSpeed(Static.currentSpeed);
        Static.speedUp(50);
        Static.speedUp(140);
        Static.speedDown(30);
        Static.stop();

        Static obj = new Static();
        obj.speedUp(20); //accessing static method through an object reference, not recommended but valid
    }
}
