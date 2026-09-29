package JavaCodes;

/*public class swaping {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 344;
        int temp;
        System.out.println("After swaping");
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}*/

//without 3rd variable
public class swaping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}