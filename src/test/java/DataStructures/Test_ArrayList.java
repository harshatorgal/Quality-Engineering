package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Auckland");
        city.add("Wellington");
        city.add("Christchurch");
        city.add("Dunedin");
        city.add("Dunedin");
        city.add("Bangalore");
        System.out.println("Some major cities of NewZealand are:");
        System.out.println(city);

        Iterator<String> it = city.iterator();
        while (it.hasNext()) {

            String currentcity = it.next();
            System.out.println(currentcity);
            if (currentcity.equals("Bangalore")) {
                it.remove();
            }

        }
        System.out.println(city);

    }
}
/*
JavaCodes.Duplicates are allowed
Access by index
Best for reading/searching
Memory is less
Adding/Removing elements at the end is usually fast
Adding/Removing elements at the beginning is slow
Adding/Removing elements at the middle is slow
*/