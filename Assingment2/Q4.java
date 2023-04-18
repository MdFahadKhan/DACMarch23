import java.util.*;
class ElectricityBill{
    private String name;
    private double unitsConsumed;
    private double billamount;
    
    ElectricityBill(){name="";unitsConsumed=0.00d;}

    public void setName(String name){this.name=name;}
    public void setunitsConsumed(double unitsConsumed){this.unitsConsumed=unitsConsumed;}
    
    public String getName(){return this.name;}
    public double getunitsConsumed(){return this.unitsConsumed;}

    public double calculateBillAmount(){
        double amount=0;
        if(unitsConsumed>300){amount=100.0*5.0+200.0*7.0+(unitsConsumed-300.0)*10.0;}
        else if(unitsConsumed>100 && unitsConsumed<=300){amount=100.0*5.0+(unitsConsumed-100)*7.0;}
        else if(unitsConsumed>=0 && unitsConsumed<=100){amount=unitsConsumed*5.0;}
    
    return amount;
    }
    
}
class Q4{
    public static void main(String[] args){
        ElectricityBill eb= new ElectricityBill();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of consumer");
        eb.setName(sc.nextLine());
        System.out.println("Enter units consumed by consumer");
        eb.setunitsConsumed(sc.nextDouble());
        eb.calculateBillAmount();

        System.out.println("Coustomer Name: "+eb.getName());
        System.out.println("Units Consumed: "+eb.getunitsConsumed());
        System.out.println("Bill Amount: "   +eb.calculateBillAmount());
            
            
    }
}