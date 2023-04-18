import java.util.*;
class TelephoneBill{
    private String name;
    private int callsMade;
    private int phoneNumber;
    private double callDuration;
    
    TelephoneBill(){name="";callDuration=0.00d;phoneNumber=000;callsMade=0;}

    public void setName(String name){this.name=name;}
    public void setcallDuration(double callDuration){this.callDuration=callDuration;}
    public void setphoneNumber(int phoneNumber){this.phoneNumber=phoneNumber;}
    public void setcallsMade(int callsMade){this.callsMade=callsMade;}

    public String getName(){return this.name;}
    public double getcallDuration(){return this.callDuration;}
    public int getphoneNumber(){return this.phoneNumber;}
    public int getcallsMade(){return this.callsMade;}

    public double calculateBillAmount(){
        double amount=0;
        if(callsMade>100){amount=100.0*0.5+(callsMade-100)*0.25;}
        
        else if(callsMade>=0 && callsMade<=100){amount=callsMade*0.5;}
    
    return amount;
    }
    
}
class Q5{
    public static void main(String[] args){
        TelephoneBill tb= new TelephoneBill();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of consumer");
        tb.setName(sc.nextLine());
        System.out.println("Enter Duration of calls(mins) ");
        tb.setcallDuration(sc.nextDouble());
         System.out.println("Phone Number");
        tb.setphoneNumber(sc.nextInt());
        System.out.println("Enter no. of calls made ");
        tb.setcallsMade(sc.nextInt());

        tb.calculateBillAmount();

        System.out.println("Coustomer Name: "+tb.getName());
        System.out.println("Phone Number: "+tb.getphoneNumber());
        System.out.println("Call Duration "+tb.getcallDuration());
        System.out.println("Bill Amount($): "   +tb.calculateBillAmount());
            
            
    }
}