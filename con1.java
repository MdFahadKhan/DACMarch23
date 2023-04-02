class con{
	int i,j;
con(){
	i=10;
	j=20;
	
System.out.println("Hello i am constructor");
}
int me(int i,int j){
	
	
	return i+j;

}
}
class con1{
public static void main(String args[])
{
con c=new con();

System.out.println(c.me(24,34));

}
}