package JavaCodes.Abstract;

class Student1 extends Education {
    int age = 27;
    String gender = "F";
    String name = "Harsha";
    String subjectName = "Maths";

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
