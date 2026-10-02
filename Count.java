import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int count = 1;
        sc.close();
        while(num != 0){
            int rem = num % 10 ;
            num /= 10;
            if (num == 0){
                break;
            }else {
                count = count + 1 ;
            }
        }
        System.out.println(" the digit of  given number is =" + count );
    }
}
