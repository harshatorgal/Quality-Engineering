package IO_Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\harsh\\Java_Codes\\a.txt"));
            bw.write("This is Java File Handling Concept");
            bw.newLine();
            bw.write("Hello");
            bw.newLine();
            bw.write("Hi");
            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
