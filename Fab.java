import java.util.*;
class Fab{
static int n1=0,n2=1,n3=0;
static void print1(int count){
if(count>0){
n3=n1+n2;
System.out.print(" "+n3);
print1(count-1);
}

}
public static void main(String[] args){
int count=15;
System.out.print(n1+" "+n2);
print1(count-2);
}
}