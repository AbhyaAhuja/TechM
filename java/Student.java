package java;
public class Student {

    private String name;
    private int roll;
    private int marks;

    Student(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", marks: " + marks);
    }

    public static void main(String[] args) {
        Student stu = new Student("abhya", 10, 99);
        stu.showDetails();
    }
}
radhe radhe