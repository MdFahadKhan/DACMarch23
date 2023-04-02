import java.util.*;
class Small{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a ");
	int a =sc.nextInt();
	
	System.out.println("Enter b");
	int b =sc.nextInt();
	System.out.println("Enter c");
	int c =sc.nextInt();
		if(Math.min(a,b)>Math.min(b,c)){
			System.out.println("Min no is "+Math.min(b,c));
		}
		else{
				System.out.println("Min no. is "+Math.min(a,b));

		}

		
		
	
}}