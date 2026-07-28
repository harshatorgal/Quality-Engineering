public class breakContinue {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, -7, 6, -8, 0, 2, 4, -5};

        for (int i = 0; i < a.length; i++) {
            if (a[1] < 0) {
                continue;
            }
            if (a[i] == 0) {
                break;
            }
            System.out.println(a[i]);
        }

    }
}
