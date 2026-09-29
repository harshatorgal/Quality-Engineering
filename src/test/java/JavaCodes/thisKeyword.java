package JavaCodes;

class thisKeyword {
    public thisKeyword() {
        this(10);
        System.out.println("Welcome");

    }

    public thisKeyword(int x) {
        System.out.println("Hello");
        System.out.println(x);
    }


    public static void main(String[] args) {
        thisKeyword t = new thisKeyword();

    }
}