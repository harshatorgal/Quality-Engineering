package IO_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\harsh\\Java_Codes\\a.txt"));
            String i;
            if ((i = br.readLine()) != null) {
                System.out.println(i);
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
