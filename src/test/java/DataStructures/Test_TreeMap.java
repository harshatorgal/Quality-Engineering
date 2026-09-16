package DataStructures;

import java.util.Map;
import java.util.TreeMap;

public class Test_TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> abc = new TreeMap<Integer, String>();
        abc.put(12, "Harsha");
        abc.put(1, "Shivam");
        abc.put(24, "Shubhangi");
        abc.put(0, "Mayll");
        abc.put(-1, "Girish");
        abc.put(30, "Vinayak");
        System.out.println(abc);
    }
}
/*
key->value
No duplicate for key but yes for value
Sorts keys automatically
 */