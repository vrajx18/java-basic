import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setDetails();
        m1.setdet();
        m1.countSalary();
    }
}
class Employee {
    int employee_id,salary;
    String name;
    void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of employee :");
        name = sc.nextLine();
        System.out.println("enter the employee _id :");
        employee_id = sc.nextInt();
        System.out.println("enter the salary of employee :");
        salary = sc.nextInt();
    }
}
class Manager extends Employee {
    int bonus;
    String dept ;
    void setdet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dept of manager :");
        dept = sc.next();
        System.out.println("enter the salary of employee (bonus)");
        bonus = sc.nextInt();
        sc.close();
    }
    void countSalary(){
        int result = salary + bonus ;
        System.out.println("the total salary of a employe is : " + result);
    }
}