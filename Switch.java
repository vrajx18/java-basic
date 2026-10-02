import java.util.*;
public class Switch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day;
    System.out.println("enter the value of day from week=");
    day = sc.nextLine();
    sc.close();
    switch(day) {
        case "monday":
            System.out.println("day is MONDAY");
            break;
        case "tuesday":
            System.out.println("day is TUESDAY");
            break;
        case "wednesday":
            System.out.println("day is WEDNESDAY");
            break;
        case "friday":
            System.out.println("day is FRIDAY");
            break;
        case "saturday":
            System.out.println("day is SATURDAY");
            break;
        case "sunday":
            System.out.println("day is SUNDAY");
            break;
    }
    }
}
