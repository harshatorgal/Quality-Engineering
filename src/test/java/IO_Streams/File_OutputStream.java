package IO_Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\harsh\\Java_Codes\\a.txt");
            String i = "Hello";
            file.write(i.getBytes());
            System.out.println("Successful");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}