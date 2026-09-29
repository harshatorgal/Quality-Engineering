package JavaCodes;

public class largestSmallest {
    public static void main(String[] args) {
        int a[] = {20, 6, 12, 28, -1, 90, 7};
        int largest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}

/*Smallest

public class JavaCodes.largestSmallest {
    public static void main(String[] args) {
        int a[] = {20, 6, 12, 28, -1, 90, 7};
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }
}

*/
