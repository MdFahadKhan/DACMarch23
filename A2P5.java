import java.util.*;
class test{
public static void main(String []args){
	int p=9;
for(int n=1;n<=9;n++){
	for(int k=9;k>=n;k--){
		System.out.print("  ");
	}
for(int i=p-1;i<=n;i++){
System.out.print(i+" ");}
for(int j=p-1-1;j>=1;j--){
System.out.print(j+" ");
}
System.out.println(" ");
}

}}