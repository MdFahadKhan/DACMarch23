import java.util.*;
class Fact{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no.");
int a=sc.nextInt();
int b=1;
for(int i=1;i<=a;i++){
	b*=i;
	
}
System.out.println(b);
}
}