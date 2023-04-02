import java.util.*;
class b1{
public static void main(String[] args){
	
	int alpha=64;
	int n=5;
	for(int i=1;i<=5;i++){
		n--;
		for(int j=5;j>i;j--){
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++){
			
			System.out.print(" "+(char)(alpha+k+n));
			}
			

					System.out.println(" ");

	}
}
}