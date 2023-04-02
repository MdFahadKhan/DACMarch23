import java.util.*;
class Pone{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a=sc.nextInt();
		if(a>=0){
			System.out.println(a+"Number is Positive");
		}
		else
		{
			System.out.println(a+"is negative");
		}
	}
}