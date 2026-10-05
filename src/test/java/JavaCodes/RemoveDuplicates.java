package JavaCodes;

/*
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "harsha";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}

*/

//Find the First Repeated Character
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "harsha";
        String repeated = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (repeated.indexOf(ch) != -1) {
                System.out.println(ch);
                break;
            }
            repeated = repeated + ch;
        }

    }
}