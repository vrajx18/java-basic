import java.util.*;
public class Bank {
    private float balance = 2500 ,d_amount,w_amount,acc_no;
    private String acc_name,acc_branch;

    public void setD_amount(float d_amount) {
        this.d_amount = d_amount;
    }

    public void setW_amount(float w_amount) {
        this.w_amount = w_amount;
    }

    public void setAcc_no(float acc_no) {
        this.acc_no = acc_no;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public void setAcc_branch(String acc_branch) {
        this.acc_branch = acc_branch;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit (){
        System.out.println("----------------------------------------------------------------------");
        if (d_amount <= 0){
            System.out.println("invalid amount !! please check enetered amount ");
        }
        else {
            balance = balance + d_amount;
            System.out.println(d_amount+"  /- ruppes  deposited sucessfully in your account");
            System.out.println("amount after deposit " +  balance + " /- ruppees.");
        }
        System.out.println("----------------------------------------------------------------------");
    }
    public void withdraw(){
        System.out.println("----------------------------------------------------------------------");
        if( balance <= w_amount){
            System.out.println("sorry invalid amount please try again leeter !!!");
        }else {
            balance = balance - w_amount;
            System.out.println(w_amount + "  /- ruppes withdrawn succesfully !!!");
            System.out.println("amount after withdrwan " +  balance + " /- ruppees.");
        }
        System.out.println("----------------------------------------------------------------------");
    }
    public void checkdetails(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("the account number of your account is " + acc_no);
        System.out.println(" The name of branch of your account is " + acc_branch);
        System.out.println("the name of account holder is " + acc_name);
        System.out.println("the available balance of your account is " + balance);
        System.out.println("----------------------------------------------------------------------");
    }
}
