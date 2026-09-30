package JavaCodes.Abstract;

public class main {
    public static void main(String[] args) {
        System.out.println("Student details");
        student1 s1 = new student1();
        student2 s2 = new student2();
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
 */
