package File_Handling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\harsh\\Java_Codes\\b.txt");
        if (file.delete()) {
            System.out.println("Successful");
        } else {
            System.out.println("Error");
        }
    }
}
