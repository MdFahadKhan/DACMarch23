import java.util.*;
class Search{
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
	int s=sc.nextInt();
	
	for(int k=0;k<5;k++){
	//int max=0;
	if(s==arr[k]){
		max=arr[k];
				System.out.println("Element "+s+" Found");
				break;
}
else if(s!=arr[k]){continue;}
else{				System.out.println("Element "+s+" not  Found");
}

	
		//System.out.println(max);
		}
						//System.out.println("Element "+s+" not Found");

				
	}
}