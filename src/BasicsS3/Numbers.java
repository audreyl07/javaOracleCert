package BasicsS3;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Octal Numbers:");
        //octal numbers
        //octal range is 0-7
        int octalNum1 = 015; //13
        int octalNum2 = 0104; //68
        int sumOctal = octalNum1 + octalNum2; //81
        System.out.println("The sum of octal numbers " + octalNum1 + " and " + octalNum2 + " is: " + sumOctal);
        System.out.println("The sum is in octal: " + Integer.toOctalString(sumOctal));

        System.out.println("\nHexadecimal Numbers:");
        //hexadecimal
        //hexadecimal range is 0-9 and A-F (or a-f)
        int hexNum1 = 0x1B0; //432
        int hextNum2 = 0x2F; //47
        int sumHex = hexNum1 + hextNum2; //479
        System.out.println("The sum of hexadecimal numbers " + hexNum1 + " and " + hextNum2 + " is: " + sumHex);
        System.out.println("The sum is in hexadecimal: " + Integer.toHexString(sumHex));


        System.out.println("\nBinary Numbers:");
        //binary
        //binary range is 0 and 1
        int binNum1 = 0b1001; //9
        int binNum2 = 0b1011; //11
        int sumBin = binNum1 + binNum2; //20
        System.out.println("The sum of binary numbers " + binNum1 + " and " + binNum2 + " is: " + sumBin);
        System.out.println("The sum is in binary: " + Integer.toBinaryString(sumBin));


    }
}
