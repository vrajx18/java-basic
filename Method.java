import java.util.*;
public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,i,sum = 0;
        System.out.println("enter the size of an araaay :");
        n = sc.nextInt();
        int [] array = new int [n];
        System.out.println(" enter the  element of an array ");
        for (i = 0; i < n; i++) {
            array [i] = sc.nextInt();
        }
        sc.close();
        System.out.println("the elements of an araay are as under :");
        for (i = 0; i < n; i++) {
            System.out.println("array["+ i + "] =" + array[i]);
        }
        System.out.println("the sum of given elemnets of an araay is :");
        for (i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("the sum is : "+ sum );
    }
}
