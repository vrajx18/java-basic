import java.util.*;
public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circlee();
        s.calculateArea();
        Shape s1 = new rectanglee();
        s1.calculateArea();
    }
}
abstract  class Shape {
    abstract  void calculateArea();
}
class Circlee extends Shape {
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea() {
        int r ;
        System.out.println("enter the radious of the circle :");
        r = sc.nextInt();
        double area = (3.14 * r *r);
        System.out.println("the area of given circle is :" + area);
    }
}
class rectanglee extends Shape {
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea() {
        int l , w ;
        System.out.println("enter the lenghth and width of given rectangle :");
        l = sc.nextInt();
        w = sc.nextInt();
        int area = 2 * ( l + w);
        System.out.println("the area of a rectangle is " + area);
    }
}