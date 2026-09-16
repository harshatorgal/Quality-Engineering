package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class Test_HashSet {
    public static void main(String[] args) {
        Set<Integer> abc = new HashSet<Integer>();
        abc.add(12);
        abc.add(1);
        abc.add(24);
        abc.add(0);
        abc.add(-1);
        System.out.println(abc);
    }
}
/*
Duplicates are not allowed
Elements are not in order
preferred for add/search/removr
 */
