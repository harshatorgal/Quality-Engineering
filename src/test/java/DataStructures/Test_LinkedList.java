package DataStructures;

import java.util.LinkedList;
import java.util.List;

public class Test_LinkedList {
    public static void main(String[] args) {
        List<String> abc = new LinkedList<String>();
        abc.add("Java");
        abc.add("List");
        abc.add("List");
        System.out.println(abc);
    }
}
/*
JavaCodes.Duplicates are allowed
Memory is more because each node is dedicated memory
Good for inserting/deleting
Adding/Removing elements at the end is fast
Adding/Removing elements at the beginning is fast
Adding/Removing elements at the middle is fast
 */