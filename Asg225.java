import java.util.*;
class Asg225{
public static void main(String[] args){
	int n=5;
	int l=1;
	for(int i=1;i<=9;i++){
		
		for(int j=n;j>0;j--){
			System.out.print(" ");
			
		}
		if(i%2!=0){
			n--;
		for(int k=1;k<=i;k++){
			
			System.out.print("*");}
		}

					System.out.println(" ");

	}
	for(int x=0;x<8;x++){
	if(x%2!=0){
	l++;
	for(int y=1;y<=l;y++){
	
	System.out.print(" ");
	}}
	else{
		System.out.println(" ");

	}
	
	
	if(x%2!=0){
	for(int z=7;z>=x;z--){
	System.out.print("*");
	}
	//l++;
	System.out.println(" ");
	}
	}
}
}