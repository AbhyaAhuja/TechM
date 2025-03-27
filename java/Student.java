package java;
public class Student {

    private String name;
    private int roll;
    private float marks;

    Student(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", marks: " + marks);
    }

    public static void main(String[] args) {
        Student stu = new Student("abhya", 10, 99);
        stu.showDetails();
    }
}
