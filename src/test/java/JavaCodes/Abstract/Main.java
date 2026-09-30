package JavaCodes.Abstract;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student details");
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        System.out.println("Student 1");
        s1.subject();
        s1.remarks();
        System.out.println("------------------------------------");
        System.out.println("Student 2");
        s2.subject();
        s2.remarks();
    }
}

/*
can use
Eduaction s1 = new Student1();
Education s2 = new Student2();

Education is parent reference
Student1 and Student2 are the actual object that will be looked for.

using parent reference the code becomes runtime polymorphism(method override)

OBJECT CAN'T BE CREATED FOR ABSTRACT CLASS
ABSTRACT METHOD should be kept empty in abstract class
 */
