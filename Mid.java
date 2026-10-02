import java.util.*;
class value {
    private int num1 ,num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int max (){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
public class Mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number 1 :");
        int n1= sc.nextInt();
        System.out.println("enter the value of number 2 :");
        int n2 = sc.nextInt();
        sc.close();
        value obj = new value();
        obj.setNum1(n1);
        obj.setNum2(n2);
        int result = obj.max();
        System.out.println("the maximum from both number is : " + result);
    }
}
