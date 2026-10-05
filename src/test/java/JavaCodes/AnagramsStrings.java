package JavaCodes;

import java.util.Arrays;

public class AnagramsStrings {
    public static void main(String[] args) {
        String str1 = "aabb";
        String str2 = "baba";
        char arr1[] = str1.toCharArray();   //convert string to char array {a,a,b,b}
        char arr2[] = str2.toCharArray();   //convert string to char array {b,a,b,a}
        Arrays.sort(arr1);     //sorts in alphabetical order
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
