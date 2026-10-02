import java.util.Scanner;

public class area {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the length of recteangle:");
       int l = sc.nextInt();
       System.out.println("enter the bridth of recteangle:");
       int b = sc.nextInt();
       int area = l*b;
       System.out.println("the area of given rectengle is =" + area);
       sc.close();
    }
}
