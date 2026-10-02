import java.util.Scanner;
import java.util.*;
class AttdenceLessthanCriteria extends Exception {
    public AttdenceLessthanCriteria(String msg){
        super(msg);
    }
}
public class Exception3 {
    public static void main(String[] args) {
        int attdence;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your attdence (in percentage %):");
        attdence = sc.nextInt();
        try {
            if (attdence <= 75  ){
                throw new AttdenceLessthanCriteria("you are not able to appear in exam please first ful fill the criteria");
            }
            else {
                System.out.println("you are able to appear in exam hall dont worry !!1");
            }
        }
        catch (AttdenceLessthanCriteria e){
            System.out.println("oops you can't appear in exam");
        }
        finally {
            System.out.println("we are here to help you !!");
        }
    }
}
