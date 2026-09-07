package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\harsh\\Java_Codes\\a.txt");
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String a = input.nextLine();
                System.out.println(a);
                System.out.println(a);
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}

