import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        int r;
        System.out.println("enter the radious of circle");
        r = sc.nextInt();
        sc.close();

        area = (3.14 * r *r) ;

        System.out.println(" area of a given circle is " + area + "sq.feet.");
    }
}
