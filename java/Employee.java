package java;
import java.util.*;

class Employee {
    String name;
    int ID;
    double salary;

    Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    double netSalary(double bonus, double tax) {
        return salary + bonus - tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee");
        String EmpName = sc.next();

        System.out.println("Enter ID of employee");
        int EmpID = sc.nextInt();

        System.out.println("Enter salary of employee");
        double EmpSalary = sc.nextDouble();

        System.out.println("Enter bonus of employee");
        double bonus = sc.nextDouble();

        System.out.println("Enter tax of employee");
        double tax = sc.nextDouble();
        Employee e = new Employee(EmpName, EmpID, EmpSalary);

        double net = e.netSalary(bonus, tax);
        System.out.println("Employee details");
        System.out.println("Name: "+ EmpName+ ", ID: "+ EmpID + ", Base salary: " + EmpSalary + ", Bonus: "+ bonus +", Tax: "+ tax+", Net Salary: "+ net);
sc.close();
    }
}
