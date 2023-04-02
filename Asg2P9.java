import java.util.*;
class Asg2P9{
public static void main(String[] args){
	int z=5;
	for(int i=1;i<=5;i++){
		z--;
		for(int j=z;j>0;j--){
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++){
			
			System.out.print("*");}
			

					System.out.println(" ");

	}
	for(int l=1;l<=5;l++){
		for(int m=1;m<=l;m++){
          System.out.print(" ");			
		}
		for(int n=4;n>=l;n--){
			System.out.print("*");
		}
							System.out.println(" ");

	}
}
}