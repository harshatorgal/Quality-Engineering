package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("C:\\Users\\harsh\\Java_Codes\\a.txt");
            file.write("This is Java File Handling Concept");
            file.close();
            System.out.println("Successfully completed");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
