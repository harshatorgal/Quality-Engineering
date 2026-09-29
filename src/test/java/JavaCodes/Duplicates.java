package JavaCodes;

/*public class JavaCodes.Duplicates {
    public static void main(String[] args) {
        String str = "harsha";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Duplicate character is: " + str.charAt(i));
                    break;
                }
            }
        }
    }
}

 */

//Using hashSet because there are 3 a's and to avoid printing 'a' twice, I use hashSet to avoid duplicates getting printed twice

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        String str = "banana";
        Set<Character> dup = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (dup.add(str.charAt(i))) {
                        System.out.println("Duplicate character is: " + str.charAt(i));
                    }
                    break;
                }
            }
        }
    }
}


//duplicates for numbers
/*
import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        int a[] = {23, 55, 2, 456, 32, 2, 2, 23, 456};
        Set<Integer> dup = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (dup.add(a[i])) {
                        System.out.println(a[i]);
                    }
                    break;
                }
            }
        }

    }
}
*/
