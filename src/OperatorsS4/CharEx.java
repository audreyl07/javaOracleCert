package OperatorsS4;

public class CharEx {
    public static void main(String[] args) {
        //Char -> 0-65535 "A"

        char c1 = 'H'; //72
        char c2 = '5'; //53

        System.out.println("c1 " + c1);
        System.out.println("is first variable letter? " + Character.isLetter(c1));
        System.out.println("is first variable letter? " + Character.isDigit(c1));

        System.out.println("c2 " + c2);
        System.out.println("is first variable letter? " + Character.isLetter(c2));
        System.out.println("is first variable letter? " + Character.isDigit(c2));

        char letter1 = 67; //C in ASCII
        int num1 = letter1 + 3; //67 + 3 = 70
        char letter2 = (char) num1; //F
        System.out.println("letter2 is " + letter2);

        char letter3 = 70; //F in ASCII
        char letter4 = letter3--;
        boolean check1 = letter4 == 'E';
        boolean check2 = --letter3 > 'D';
        System.out.println("check1 : " + check1);
        System.out.println("check2 : " + check2);
    }
}
