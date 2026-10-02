import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println(" enter the value of number:");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("given nmber is prime number");
        }else
        {
            System.out.println("given number is not prime number");
        }
    }
}
