package JavaCodes;

/*
public class primeNumber {
    public static void main(String[] args) {
        int num = 1234567;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }
    }
}
*/

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        System.out.println("Enter starting range number(greater than 1): ");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println("Enter ending range number(greater than 1): ");
        int end = input.nextInt();
        System.out.println("Prime numbers from " + start + " to " + end + " are: ");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }


    }
}
