import java.util.Scanner;
public class User {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the name of student=");
       String name = sc.nextLine();
       System.out.println(" hello dear " + name);
       sc.close();
    }
}
