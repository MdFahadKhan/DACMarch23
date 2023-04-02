import java.util.*;
class Sw{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
int a=1;
for(int i=2;i<=n;i++){
 a=a*(i);

}
System.out.println(a);


}
}