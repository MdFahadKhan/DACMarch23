import java.util.*;
class Bank{
    private double balance;
    private String name;
    //String IFSC_code;
    private int accountNo;
    public Bank(){name="";balance=0.00;accountNo=0;}

    public void setName(String name){this.name=name;}
    public void setBalance(double balance){this.balance=balance;}
    public void setAccountNo(int accountNo){this.accountNo=accountNo;}

    public String getName(){return this.name;}
    public double getBalance(){return this.balance;}
    public int getAccountNo(){return this.accountNo;}
    
    Scanner sc = new Scanner(System.in);
    public void CreateAcc(){
        System.out.println("Enter name for ur acc");
        name=sc.nextString();
        accountNo=(int)(Math.random()*(901)+100);
        System.out.println(name+"  "+accountNo+" "+balance);
        
    }
    public double depositMoney(){
        System.out.prinntln("Enter the Account NO.");
        if(a=accountNo){
            System.out.println("Enter amount to deposit");
            balance=balance+"depositMoney";
        else{System.out.println("Account no. not found")}
        }
    }
    public double withdrawMoney(){
        System.out.prinntln("Enter the Account NO.");
        if(a=accountNo){
            System.out.println("Enter amount to withdraw");
            balance=balance-"withdrawMoney";
        else{System.out.println("Account no. not found")}
        }
    }
    public double showAccBal(){
         return balance;
    }
    public void accHolderInfo(){
         System.out.println("name");
    System.out.println("Account No.");
    System.out.println("Current Balance");
    }
}
class Q6{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Bank b=new Bank();
        
        b.setName(sc.nextLine());
        b.setBalance(sc.nextDouble());
        b.setAccountNo(sc.nextInt());



        System.out.println("Enter:");
        System.out.println("0: CreateAcc");
        System.out.println("1: depositMoney");
        System.out.println("2: withdrawMoney");
        System.out.println("3: showAccBal");
        System.out.println("4: accHolderInfo");
        int c=sc.nextInt();

        Switch(c){
    case 0:b.createAcc();
    case 1:b.depositMoney();
    case 2:b.withdrawMoney();
    case 3:b.showAccBal();
    case 4:b.accHolderInfo();
}
    }
}