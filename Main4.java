import java.util.*;
public class Main4 {
    public static void main(String[] args) {

    }
}
class Parent1 {
    private String n;
    public void setName(String name) {
        this.n = name;
    }

    public String getName() {
        return n;
    }


}
class Child1 extends Parent1{
    private String n;

    public String getName() {
        return n;
    }

    public void setName(String name) {
        this.n = name;
    }

    public void displayDetails(){
        System.out.println("name from child :" + this.n);
        System.out.println("name from parent : " + super.getName());
    }
}