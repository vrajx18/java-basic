import java.util.*;
public class Arm {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number =");
        int num = sc.nextInt();
        int temp = num ;
        int sum = 0;
        sc.close();
        while (num != 0){
            int rem = num % 10 ;
            sum = sum + (rem * rem * rem);
            num = num / 10 ;
        }
        if ( temp == sum ){
            System.out.println("given number is armstrong number");
        } else
        {
            System.out.println("given number is not an armstrong number");
        }
    }
}
