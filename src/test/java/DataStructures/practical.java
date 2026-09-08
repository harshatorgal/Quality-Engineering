package DataStructures;

import java.util.Map;
import java.util.TreeMap;

public class practical {
    public static void main(String[] args) {
        Map<Integer, Map<String, Integer>> student = new TreeMap<>();

        Map<String, Integer> s1 = new TreeMap<>();
        s1.put("Harsha", 100);
        Map<String, Integer> s2 = new TreeMap<>();
        s2.put("Shivam", 99);
        Map<String, Integer> s3 = new TreeMap<>();
        s3.put("Shivs", 100);

        student.put(102, s2);
        student.put(101, s1);
        student.put(103, s3);
        System.out.println(student);

    }
}
