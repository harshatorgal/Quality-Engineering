package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Test_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> abc = new HashMap<Integer, String>();
        abc.put(12, "Harsha");
        abc.put(1, "Shivam");
        abc.put(24, "Shubhangi");
        abc.put(0, "Mayll");
        abc.put(-1, "Girish");
        abc.put(30, "Vinayak");
        System.out.println(abc);
    }
}
//Order is not maintained
