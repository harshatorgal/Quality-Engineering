package JavaCodes;

public class sort {
    public static void main(String[] args) {
        int a[] = {54, 4, 76, 23, 76, 88, 44, 2, 67, 357, 7, 56, 367, 35};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
