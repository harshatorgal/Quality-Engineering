package DataStructures;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test_LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> abc = new LinkedHashSet<Integer>();
        abc.add(12);
        abc.add(1);
        abc.add(24);
        abc.add(0);
        abc.add(-1);
        System.out.println(abc);
    }
}
//Maintains insertion order