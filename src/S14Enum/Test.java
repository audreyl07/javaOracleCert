package S14Enum;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a color: ");
        String inputcolor = input.nextLine();
        EnumColors color = EnumColors.valueOf(inputcolor.toUpperCase());
    try {
    switch (color) {
        case RED:
            System.out.println("you entered red");
            break;
        case GREEN:
            System.out.println("you entered green");
            break;
        case YELLOW:
            System.out.println("you entered yellow");
            break;
        }
    } catch (IllegalArgumentException e) {
    System.out.println("invalid color");
}
    }
}

