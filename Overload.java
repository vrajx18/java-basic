import java.util.*;
// function overloading
 //  ---> same name , same return type
// diifrent parameters
// different datatypes
public class Overload {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Function f1 = new Function();
      f1.add();
        System.out.println("enter the three numbers  here :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        f1.add(n1 , n2 , n3);
        f1.add(20f, 50.3f);
        f1.add(202155255212L,1545656565655L);
        f1.add(10,20);
    }
}
class Function {
    public void add (){
        System.out.println("you have to enter parameter first !!!!");
    }
    public void add(int n1, int n2){
        System.out.println("the sum of both  integers number is " + (n1 + n2 ));
    }
    public void add (float n1 , float n2 ){
        System.out.println("the sum of both float number is :" + (n1 + n2));
    }
    public void add (int n1 , int n2 , int n3 ){
        System.out.println("the sum of three intergrs is :" + ( n1 + n2 + n3 ));
    }
    public void add(long n1 , long n2 ){
        System.out.println("the minus of both long number is :" + ( n1 - n2 ));
    }
}