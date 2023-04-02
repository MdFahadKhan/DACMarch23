import java.util.*;
class Add{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a ");
int a =sc.nextInt();
System.out.println("Enter b ");
int b=sc.nextInt();
if(a>b){
for(int i=b;i>=a;i++){
System.out.println(i);
}}
else{
for(int i=a;i>=b;i++){
System.out.println(i);
}
}
}
}