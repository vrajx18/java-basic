import java.util.*;
public class main1 {
    public static void main(String[] args) {
     /* main o = new main();
     o.min(10,20);
     o.sum(10,20); */
     Classic c = new Classic();
     c.setAcc_no(102);
     c.setName("vraj");
     c.depoSite(500);
     c.displayDetails();
     c.withDraw(200);
     c.displayDetails();
    }
}
class main implements firstRemove,firstAdd {
    @Override
    public void min(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("the minus of both number is :" +  result);
    }

    @Override
    public void sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("the sum of both number is :" + result);
    }
}
