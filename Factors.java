import java.util.*;
class Factors{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Enter a ");
for(int i=2;i>20;i++){
if(a/i){
System.out.println(i);
i--;
a=a/i;
//System.out.println(x);
}


}
}

}