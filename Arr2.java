import java.util.*;
public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the size of an araay = ");
        int num = sc.nextInt();
        int []arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("entert the " + i +"th element :");
            arr [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println(" the reverse order of an araay is ");
        for ( int j = num-1; j >= 0; j--) {
            System.out.println("the" + j + "th element of an reverse array is :" + arr [j]);
        }
    }
}
