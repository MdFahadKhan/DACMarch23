import java.util.*;
import java.util.Scanner;

public class Solu{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();

        // Write your code here.
		int sum = 2 << i; 

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + sum );
    }
}