import java.util.*;
public class NDaraaY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , c ;
        System.out.println("enter the row of  an array :");
        r = sc.nextInt();
        System.out.println("enter the column of an araay :");
        c = sc.nextInt();
        int [][] arr = new int [r][c];
        System.out.println("enter the elements of an araay :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("enter the element :");
                arr[i][j] = sc.nextInt();
            }
        }
            System.out.println(" the araay is in matrix form :");
            for (int i = 0; i < r; i++) {
                for ( int j = 0; j < c; j++) {
                    System.out.print(" " + arr[i][j]);
                }
                System.out.println(" ");
            }
            sc.close();
        System.out.println("reverse of the araay :");
        for (int i = r - 1; i >= 0 ; i--) {
            for (int j = c - 1; j >= 0 ; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
