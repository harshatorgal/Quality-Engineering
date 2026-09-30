package JavaCodes;

//Method Overload
public class PrintOverload {
    public static void main(String[] args) {
        PrintOverload p = new PrintOverload();
        p.print("Hello");
        p.print(12);
        p.print(33, 9.45);
    }

    public void print(int a) {
        System.out.println("Prints integer: " + a);
    }

    public void print(int i, double j) {
        System.out.println("Prints integer: " + i + " and double: " + j);
    }

    public void print(String b) {
        System.out.println("Prints String: " + b);
    }
}
