package S18JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamEx {
    public static final String FILE_Name = "example.txt";
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String inputText = in.nextLine();

        try {
            OutputStream outputStream = new FileOutputStream(FILE_Name);
            byte [] inputTextByBytes = inputText.getBytes();
            outputStream.write(inputTextByBytes);
            System.out.println("Was successful");

            outputStream.flush();
            outputStream.close();
            in.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
