package IO_Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
            bw.write("Hello");
            bw.newLine();
            bw.write("Hi");
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
