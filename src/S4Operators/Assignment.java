package S4Operators;

public class Assignment {
    public static void main(String[] args) {

        int x = 20, y = 15, z = 0;
        z = x + y; //simple assignment
        System.out.println("The value of x+y -> " + z);

        z += x; //z = z + x
        System.out.println("The value of z+=x -> " + z);

        z -= x;
        System.out.println("The value of z-=x -> " + z);

        z *= x;
        System.out.println("The value of z*=x -> " + z);

        z /= x;
        System.out.println("The value of z/=x -> " + z);

        z %= x;
        System.out.println("The value of z%=x -> " + z);

    }
}
