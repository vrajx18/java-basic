import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of lenght and width here : " );
        int l = sc.nextInt();
        int w = sc.nextInt();
        Rectangle  r = new Rectangle( l , w);
        r.area();
        System.out.println(" enter the radius of the circle :");
        int g = sc.nextInt();
        Circle c = new Circle( g );
        c.area();
    }
}
class Rectangle implements Declaration {
    private int lenght,width;
    public int result = 0;
    Rectangle(int n1, int n2){
        this.lenght = n1;
        this.width = n2;
    }
    @Override
    public void area() {
        result = 2 * (lenght + width);
        System.out.println("the area of given rectangle is " +  result);
    }
}
class Circle implements Declaration {
    private int radius;
    public double result = 0;
    Circle(int n1 ){
        this.radius = n1 ;
    }
    @Override
    public void area() {
        double result = (3* radius * radius);
        System.out.println("The radius of the given circle is " + result);
    }
}
