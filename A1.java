import java.util.*;
class A1{
	static int max=0;
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<5;i++){
		System.out.println("Enter elements");
		arr[i]=sc.nextInt();
	}	
	for(int j=0;j<5;j++){
		System.out.println("Elements are"+arr[j]);
	}
	for(int k=0;k<5;k++){
	//int max=0;
	if(max<arr[k]){
		max=arr[k];
		}
		//System.out.println(max);
		}
				System.out.println("Max no. in array is "+max);

	}


}