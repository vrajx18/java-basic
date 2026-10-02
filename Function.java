import java.util.*;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)main f1 = new main();
        System.out.println(" enter the value of first numbers");int a = sc.nextInt();
        System.out.println(" enter the value of second numbers");
        int b = sc.nextInt();
        System.out.println(" enter the value of third numbers");
        int c = sc.nextInt();
        sc.close();
        f1.max(a,b,c);
    }
}
class main {
    public void max (int a , int b , int c){
        int num1 = a;
        int num2 = b;
        int num3 = c;
        if (num1 > num2 && num1 > num3){
            System.out.println("num 1 is greatest .");
        }
        else if ( num2 > num1 && num2 > num3 ){
            System.out.println("num2 is greatest ");
        }
        else {
            System.out.println("num3 is greatest ");
        }
    }
}
