import java.util.*;
class Asg27{
public static void main(String[] args){
	int n=5;
	for(int i=1;i<=5;i++){
		n--;
		for(int j=n;j>0;j--){
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++){
			System.out.print(" "+k);
		}
					System.out.println(" ");

	}
}
}