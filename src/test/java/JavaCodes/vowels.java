package JavaCodes;

public class vowels {
    public static void main(String[] args) {
        String str = "shivam";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                System.out.println("Vowel: " + str.charAt(i));
                count++;
            }
        }
        System.out.println("Total count: " + count);
    }
}