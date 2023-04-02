import java.util.*;
class Swap{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1");
		int a= sc.nextInt();
		System.out.println("Enter value of b");
		int b= sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
}