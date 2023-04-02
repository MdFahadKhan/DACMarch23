import java.util.*;
class HIHHP{
public static void main(String []args){
	int n=1;
	for(int i=1;i<=6;i++){
		for(int j=6;j>=1;j--){
		if(i==1||i==j||j==6)
		System.out.print("*");
		else
		System.out.print(" ");

		}
		System.out.println();
	}


}}