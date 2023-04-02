import java.util.*;
class Asg211{
public static void main(String[] args){
	int n=5;
	for(int i=1;i<=9;i++){
		if(i%2!=0){
		for(int j=n;j>0;j--){
			System.out.print(" ");	
		}
		
			n--;
		for(int k=1;k<=i;k++){
			System.out.print("*");}
		}
		else
			continue;
					System.out.println(" ");
	}
}
}