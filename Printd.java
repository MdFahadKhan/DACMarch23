import java.util.*;
class Printd{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		 
		while(a>0){
			
		
		int b=a%10;
		System.out.println(b);
		a=a/10;
		}
		
	}
}