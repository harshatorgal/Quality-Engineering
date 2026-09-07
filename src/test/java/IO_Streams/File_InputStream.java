package IO_Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class File_InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\harsh\\Java_Codes\\a.txt");
            int i;
            if ((i = file.read()) != -1) {
                System.out.println((char) i);
            } else {
                System.out.println("End of file");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

