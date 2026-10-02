
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the size of an araay:");
        num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter the " + i + "th element :");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("at index " + i + "element is " + arr[i]);
        }
        sc.close();
    }
}
