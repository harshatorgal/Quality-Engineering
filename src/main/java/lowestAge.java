public class lowestAge {
    /*public static void main(String[] args) {
        int a[] = {78, 34, 66, 90, 23, 4};
        int lowestAge = a[0];
        for (int i = 0; i < a.length; i++) {
            if (lowestAge > a[i]) {
                lowestAge = a[i];
            }

        }
        System.out.println(lowestAge);
    }*/


    public static void main(String[] args) {
        int a[] = {78, 34, 66, 90, 23, 4};
        int highestAge = a[0];
        int lowestAge = a[0];
        for (int i = 0; i < a.length; i++) {
            if (highestAge < a[i]) {
                highestAge = a[i];
            }
            if (lowestAge > a[i]) {
                lowestAge = a[i];
            }
        }
        System.out.println("Highest age: " + highestAge);
        System.out.println("Lowest age: " + lowestAge);

    }
}


