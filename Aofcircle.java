import java.util.*;
class Aofcircle{
	float r;
	//double pi=3.14;
void area(){
	double pi=3.14;
 double area1=pi*r*r;
 System.out.println("Area of circle is"+area1);
 //return area;
 
}
public static void main(String []args){
Aofcircle a=new Aofcircle();
Scanner sc=new Scanner(System.in);

System.out.println("Enter r");
a.r=sc.nextFloat();
a.area();
//System.out.println("Area of circle is"+a.area());


}


}