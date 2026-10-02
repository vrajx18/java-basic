import java.util.*;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num,c ,s;
        System.out.println("enter the value of num ");
        num = sc.nextInt();
        sc.close();
        c = (num * num * num);
        System.out.println(" the value of cube of given number is " + c );
        s = ( num * num );
        System.out.println(" the vlaue od square of given number is " + s);
    }
}
