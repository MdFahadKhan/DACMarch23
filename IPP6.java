import java.util.*;
class IPP6{
public static void main(String []args){
	int n=1;
	for(int i=9;i>=1;i--){
		for(int j=1;j<=n;j++){
			System.out.print(" ");
		}
		n++;
		for(int k=i;k>=1;k--){
			System.out.print(" "+i);
		}
		System.out.println();
	}


}}