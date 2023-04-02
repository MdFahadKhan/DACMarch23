import java.util.*;
class Area{
float r;
float base,ht,l,b,a;
void circle(){
	double pi=3.14;
	double a1=pi*r*r;
	System.out.println(a1);
}
void triangle(){
	float a2=(base*ht)/2;
		System.out.println(a2);

}
void rectangle(){
	float a3=l*b;
		System.out.println(a3);

}
void square(){
	float a4=a*a;
		System.out.println(a4);

}
public static void main(String []args){
	Area aa=new Area();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter r");
	aa.r=sc.nextFloat();
	System.out.println("Enter base");
		aa.base=sc.nextFloat();

	System.out.println("Enter ht");
		aa.ht=sc.nextFloat();

	System.out.println("Enter l");
		aa.l=sc.nextFloat();

	System.out.println("Enter b");
		aa.b=sc.nextFloat();

	System.out.println("Enter a");
		aa.a=sc.nextFloat();
		
aa.circle();
aa.triangle();
aa.rectangle();
aa.square();
//aa.circle();



	
	
}
}