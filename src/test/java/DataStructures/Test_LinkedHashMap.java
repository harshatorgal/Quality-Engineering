package DataStructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> abc = new LinkedHashMap<Integer, String>();
        abc.put(12, "Harsha");
        abc.put(1, "Shivam");
        abc.put(24, "Shubhangi");
        abc.put(0, "Mayll");
        abc.put(-1, "Girish");
        abc.put(30, "Vinayak");
        System.out.println(abc);
    }
}
//Insertion order of keys