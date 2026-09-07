package IO_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class File_InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\harsh\\Java_Codes\\a.txt");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

