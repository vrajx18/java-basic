
 class Classic {
    private int balance , acc_no;
    private String name;
    Classic(){
        balance = 1000;
    }
// setter methods
    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }
// withdraw method
public void withDraw(int w_amount) {
    if (w_amount <= balance) {
        balance = balance - w_amount;
    } else {
        System.out.println("ensufficient balance !!");
    }
}
// depositmethod
public void depoSite(int d_amount){
            if (d_amount <= 0){
                System.out.println("invalid amount !!!");
            }
            else {
                balance = balance + d_amount;
                System.out.println("the balance after deposit amount :" +  balance);
            }
    }
//display method
public void displayDetails(){
    System.out.println("the name of account holder is :" + name);
    System.out.println("the couunt number of your account is :" + acc_no);
    System.out.println("the current balnce of your account is :" + balance);
}
}
