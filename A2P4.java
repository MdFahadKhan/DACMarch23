import java.util.*;
class A2P4{
public static void main(String []args){
for(int n=1;n<=9;n++){
	for(int k=9;k>=n;k--){
		System.out.print("  ");
	}
for(int i=1;i<=n;i++){
System.out.print(i+" ");}
for(int j=n-1;j>=1;j--){
System.out.print(j+" ");
}
System.out.println(" ");
}

}}