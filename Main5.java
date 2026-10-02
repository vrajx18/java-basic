import java.util.*;
public class Main5 {
    public static void main(String[] args) {
       Result o = new Result();
       o.setMarks(70);
       o.claculateGrade();
    }
}
class Student {
    private int rollno,marks;
    private  String name;
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }

}
class Result extends Student {
    public void claculateGrade(){
        int temp = super.getMarks();
        if (temp >= 90 ){
            System.out.println("a grade");
        }
        else if (temp >= 80 ){
            System.out.println("b grade");
        }
        else if (temp >= 70){
            System.out.println("c grade");
        }
        else {
            System.out.println("sorry you  are failed in exam please try again later !!");
        }
    }
}
