import java.util.*;
class creditScore{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    public creditScore(){creditHistory=0;creditUtilization=0.0;}

    public void setcreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    public void setcreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    public void paymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }

    public int getcreditHistory(){return creditHistory;}
    public double creditUtilization(){return creditUtilization;}
    //public boolean paymentHistory(){return paymentHistory;}


    public int calculateCreditScore(){
        double creditscore;
        if(paymentHistory==true){
            creditscore=(creditHistory*15)+(int)(creditUtilization*30)+55;
            
        }
        else{
            creditscore=(creditHistory*15)+(int)(creditUtilization*30)+35;
        }
        return creditscore;
    }


}
class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        creditScore cs=new creditScore();

        cs.setcreditHistory(sc.nextInt());
        cs.setcreditUtilization(sc.nextDouble());
        System.out.println("If payment history is good type true");
        cs.paymentHistory(sc.nextBoolean());

        System.out.println("Ur credit History = "+cs.getcreditHistory());
        System.out.println("Ur credit utilization = "+cs.getcreditUtilization());
        System.out.println("Ur credit score = "+cs.calculateCreditScore());



    }
}