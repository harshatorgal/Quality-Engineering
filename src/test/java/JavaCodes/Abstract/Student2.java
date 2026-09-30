package JavaCodes.Abstract;

class Student2 extends Education {
    int age = 28;
    String gender = "M";
    String name = "Shivam";
    String subjectName = "Science";

    public void subject() {

        System.out.println("The subject is: " + subjectName);
        System.out.println("Graduation Year: " + graduationYear);
    }

    public void remarks() {
        System.out.println(name + " has successfully graduated ");
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}
