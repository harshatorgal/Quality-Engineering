package JavaCodes;

/*
153 = 1³ + 5³ + 3³
= 1 + 125 + 27
= 153
 */
public class Armstrong {
    public static void main(String[] args) {
        int a = 153;
        int original = a;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;                  //get last number
            sum = sum + (digit * digit * digit);
            a = a / 10;                         //remove last number
        }
        if (sum == original) {
            System.out.println("Given number is an armstrong number");
        } else {
            System.out.println("Given number is not an armstrong number");
        }

    }
}
