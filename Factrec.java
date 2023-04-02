import java.util.*;
class Factrec{
	
	int Fact(int i){
		
		if(i==0){
			return 1;	
		}
		else{
			i=i*Fact(i-1);
					System.out.println("Factorial of "+ i+ " is");
			return i;
		}	
	}
	public static void main(String []args){
		Factrec r=new Factrec();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. i");
		//int i = sc.nextInt();
		r.Fact(int i = sc.nextInt(););
		
		//System.out.println("Factorial of "+ i+ " is");
	}
}