import java.util.*;
class Minn{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a");
int a=sc.nextInt();
System.out.println("Enter b");
int b=sc.nextInt();
System.out.println("Enter c");
int c=sc.nextInt();
if(a<b&&a<c){
System.out.println(a+" a Is Smallest");
}
else if(b<c){
System.out.println(b+" b is Smallest");

}
else if(b>c){
System.out.println(c+" c is Smallest");

}
else if(a=b || b=c || a=c || a=b=c){
	System.out.println("Two or three are same");

}

}}
