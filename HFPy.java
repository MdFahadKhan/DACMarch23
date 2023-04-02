import java.util.*;
class HFPy{
public static void main(String[] args){
	int n=6;
	int j=n;
	for (int i =1;i<=6;i++){n--;
		for(j=n;j>=1;j--){System.out.print(" ");}
		for(int k=1;k<=i;k++){
			if(i==6||k==1||k==i){
			System.out.print(" *");}
			else{System.out.print("  ");
}
}
	System.out.println();
	}

}
}