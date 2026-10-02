import java.util.*;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.println("1.addition");
        System.out.println("2.substraction");
        System.out.println("3.division");
        System.out.println("4.multiplication");

        System.out.println("enetr the number of choice");
        int choice = sc.nextInt();

        System.out.println("enter the value of number1 =");
        int num1 = sc.nextInt();
        System.out.println(" enter the value of number 2 =");
        int num2 = sc.nextInt();

        switch(choice) {
            case 1:
                 result = num1 + num2;
                System.out.println("ADDITION OF BOTH NUMBER IS " + result);
                break;
            case 2:
                 result = num1 - num2;
                System.out.println("SUBSTRACTION OF BOTH NUMBER IS " + result);
                break;
            case 3:
                 result = num1 / num2 ;
                System.out.println("DIVISION OF BOTH NUMBER IS " + result);
                break;
            case 4:
                 result = num1 * num2 ;
                System.out.println("MULTIPLICATION OF BOTH NUMBER IS " + result);
                break;
            default :
                System.out.println("INVALID CHOICE !!!!!");
        }
    }
}
