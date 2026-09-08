package DataStructures;

import java.util.Set;
import java.util.TreeSet;

public class Test_TreeSet {
    public static void main(String[] args) {
        Set<Integer> abc = new TreeSet<Integer>();
        abc.add(12);
        abc.add(1);
        abc.add(24);
        abc.add(0);
        abc.add(-1);
        System.out.println(abc);
    }
}
//Sorts automatically