import java.util.*;
class F11{
static int n=1;
static int Fact(int count){
if(count>0){

System.out.print(" "+(count*Fact(count-1)));
//System.out.print(" "+n*Fact(count-1));

}
return 1;
}
public static void main(String[] args){
//System.out.print(n1+" "+n2);
Fact(5);
}
}