package JavaCodes;

//0 1 1 2 3 5 8 13...
public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        for (int i = a; i < n; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;

        }

    }

}
