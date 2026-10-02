import java.util.*;
public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("the name of branch :");
        String branch = sc.next();
        obj.setAcc_branch(branch);
        System.out.println("enter the account no : ");
        int acc = sc.nextInt();
        obj.setAcc_no(acc);
        System.out.println("eneter the name of account holder :");
        String n = sc.next();
        obj.setAcc_name(n);
        float balance = obj.getBalance();
        System.out.println("----------------------------------------------------------------------");
        int choice;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("enter the one number of your service as given below");
        System.out.println("<1> to check account details ");
        System.out.println("<2> to withdraw amount ");
        System.out.println("<3> to deposit amount ");
        System.out.println("press any number to get service :");
        choice = sc.nextInt();
        System.out.println("----------------------------------------------------------------------");

        switch(choice){
            case 1:
                System.out.println("----------------------------------------------------------------------");
                obj.checkdetails();
                System.out.println("----------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("enter the withdraw amount :");
                int w_amount = sc.nextInt();
                obj.setW_amount(w_amount);
                obj.withdraw();
                System.out.println("----------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("eneter the deposit amount :");
                int d_amount = sc.nextInt();
                obj.setW_amount(d_amount);
                obj.deposit();
                System.out.println("----------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("sorry there are some problems plase tray again later !!!!");
                System.out.println("----------------------------------------------------------------------");
        }
        System.out.println(" thank you for banking ! have a good day !!💓💓💓💓");
        sc.close();
    }
}
