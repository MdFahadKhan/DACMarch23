class Pall{

public static void main(String[] args)   
{  

int a=0,b,sum=0;
int n=43534;
int temp =n;
while(n>0){
a=n%10;
sum=(sum*10)+a;
n=n/10;
}
System.out.print(a);
if(temp==sum){System.out.print("P");}
else{System.out.print("NP");}

  
}  
}