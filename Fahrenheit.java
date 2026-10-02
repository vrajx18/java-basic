import java.util.*;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c ,f ;
        System.out.print("enter the value of fehrnhit in F =");
        f = sc.nextDouble();
        c = ( f - 32) * (5/9);
        System.out.println(" the celecius of given F is "+ c + "degree");
    }
}
