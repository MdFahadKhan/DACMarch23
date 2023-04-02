import java.util.*;
class Leap{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int a=sc.nextInt();
		if(a%400==0||(a%4&&a%100)){
			System.out.println(a+" is leap year");
			
		}
		else{
			System.out.println(a+" not a leap year");
		}
	}
}