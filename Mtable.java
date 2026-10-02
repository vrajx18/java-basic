import java.util.*;
public class Mtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number for multiplication table =");
        num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            int result = (num * i);
            System.out.println(num + " X " + i +" = " + result);
        }
    }
}
