package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\harsh\\Java_Codes\\a.txt");
            if (file.createNewFile()) {
                System.out.println(file.getName() + " has been created.");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();

        }
    }
}
