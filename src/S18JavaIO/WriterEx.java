package S18JavaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterEx {
    public static final String FILE_NAME = "test.txt";
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String inputText = scanner.nextLine();

        int indexOfW = inputText.indexOf("Writer");
        if (indexOfW != -1) {
            Writer writer = new FileWriter(FILE_NAME);
            writer.write(inputText);
            System.out.println("Was successful");
            scanner.close();
            writer.close();
        }



    }
}
