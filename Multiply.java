import java.util.*;
class Multiply{
public static void main(String []args){
int a[][]={{1,1,1},{2,2,2},{3,3,3}};
int b[][]={{1,1,1},{2,2,2},{3,3,3}};
int c[][]=new int[3][3];

for(int i=0;i<3;i++){
	int z=0;
	for(int j=0;j<3;j++){
	 z=z+a[i][j]*b[j][i];
//System.out.print(c[i][j]+" ");
	}
	System.out.print((c[i][j]=z)+" ");

System.out.println();
}
}
}