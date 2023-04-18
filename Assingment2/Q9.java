import java.util.*;
class Date{
    int day,month,year;

    public boolean isValid(){}
    public void getDayofweek(){

    }
    public boolean isLeapYear(){
        boolean i;
        if((year%4==0 || year%100 !=0) && year%400==0){
                i = true;
        }
        else{i=false}
        return i;
    }
    public void getNextDay(){

    }
    public void getPreviousDay(){

    }
}
class Q9{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Date date=new Date();
        System.out.println(date.isValid());
        System.out.println(date.getDayofweek());
        System.out.println(date.isLeapYear());

        Date nextDay = date.getNextDay();
        System.out.println(nextDay);
        
        Date previousDay = date.getPreviousDay();
        System.out.println(previousDay); 


    }
}