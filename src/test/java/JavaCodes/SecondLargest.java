package JavaCodes;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {20, 6, 12, 28, -1, 90, 7};
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];

            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
//Integer.MIN_VALUE is a predefined constant in Java that represents the
// smallest possible value an int variable can store.