import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.setName("krunal");
        obj.setSalary(1245555);
        obj.Display();
    }
}
class Parent {
    private String name;
    protected double salary;
    int employee_id;
    public static String company_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Child extends Parent {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void Display(){
        double salary = 500;
        System.out.println("name from child " + this.name);
        System.out.println("name from parent " + super.getName());
        System.out.println("salary from parent " + getSalary());
        System.out.println("employee_id from parent " + employee_id );
        System.out.println("salary from child  " + this.salary);
        System.out.println("company name fron parent " + Parent.company_name);
    }
}
