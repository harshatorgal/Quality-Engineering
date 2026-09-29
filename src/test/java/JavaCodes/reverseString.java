package JavaCodes;

public class reverseString {
    public static void main(String[] args) {
        String old = "Shivam";
        String reverse = "";

        for (int i = old.length() - 1; i >= 0; i--) {
            reverse = reverse + old.charAt(i);
        }
        System.out.println(old);
        System.out.println(reverse);
    }
}

/* Palindrome
public class reverseString {
    public static void main(String[] args) {
        String old = "Shivam";
        String reverse = "";

        for (int i = old.length() - 1; i >= 0; i--) {
            reverse = reverse + old.charAt(i);
        }
        if (old.equals(reverse)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
 */