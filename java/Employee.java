package java;
import java.util.*;

class Employee {
    String name;
    int ID;
    int salary;

    Employee(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    int netSalary(int bonus, int tax) {
        return salary + bonus - tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee");
        String EmpName = sc.next();

        System.out.println("Enter ID of employee");
        int EmpID = sc.nextInt();

        System.out.println("Enter salary of employee");
        int EmpSalary = sc.nextInt();

        System.out.println("Enter bonus of employee");
        int bonus = sc.nextInt();

        System.out.println("Enter tax of employee");
        int tax = sc.nextInt();
        Employee e = new Employee(EmpName, EmpID, EmpSalary);

        int net = e.netSalary(bonus, tax);
        System.out.println("Employee details");
        System.out.println("Name: "+ EmpName+ ", ID: "+ EmpID + ", Base salary: " + EmpSalary + ", Bonus: "+ bonus +", Tax: "+ tax+", Net Salary: "+ net);

    }
}
