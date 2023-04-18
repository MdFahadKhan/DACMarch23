import java.util.*;
class Tollbooth{
private String vehcileType;
private int numAxles;
private double distanceTraveled;
private double tollFee;
private double totalAmountDue;

public Tollbooth(){
    totalAmountDue=0.0;
}


public Tollbooth(String vehcileType,int numAxles,double distanceTraveled){
    this.vehcileType=vehcileType;
    this.numAxles=numAxles;
    this.distanceTraveled=distanceTraveled;
}

public double TollFee(){
    
    if(vehcileType!="Truck"){
        tollFee=0.25*distanceTraveled*numAxles;
        System.out.println();}
    else{
         tollFee=0.5*distanceTraveled*numAxles;
        System.out.println();
    }
    this.tollFee=tollFee;
    return tollFee;
}
public void generateBill(){
    Tollbooth t=new Tollbooth();
System.out.println("Vechile Type:"+vehcileType);
System.out.println("Vechile Type:"+numAxles);
System.out.println("Vechile Type:"+distanceTraveled);
//System.out.println("Vechile Type:"+tollFee);
System.out.println("Vechile Type:"+totalAmountDue);


}
/*private static Scanner = new Scanner(System.in);
showMenu(){
    System.out.println("1:Enter Vechile Type(car,van,bus,truck)");
        
        System.out.println("2:Enter Number of axles");
        System.out.println("3:Enter Distance Travel");
        System.out.println("4:Caluculate Toll Fees");
        System.out.println("5:Generate Bill");
        System.out.println("6:Exit");
}*/
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("1:Enter Vechile Type(car,van,bus,truck)");
        String t=sc.nextLine();
        System.out.println("2:Enter Number of axles");
        int a =sc.nextInt();
        System.out.println("3:Enter Distance Travel");
        double dt=sc.nextDouble();
        //System.out.println("4:Caluculate Toll Fees");

        //System.out.println("5:Generate Bill");
        //System.out.println("6:Exit");
        Tollbooth tb= new Tollbooth(t,a,dt);
        tb.generateBill();
        System.out.println("Toll Fee: "+tb.TollFee());



    }

}