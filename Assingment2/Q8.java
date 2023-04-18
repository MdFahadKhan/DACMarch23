import java.util.*;
class rational{
    int n1,n2,d1,d2;
    
    public rational(){n1=0;n2=0;d1=1;d2=1;}
    
    public double sum(){
        double sum=(n1*d1+n2*d2)/(d1*d2);
        return sum;
    }
    public double difference(){
        double diff=(n1*d1-n2*d2)/(d1*d2);
        return diff;
    }
    public double multiplication(){
        double mul=(n1*n2)/(d1*d2);
        return mul;
    }
    public double division(){
        double div=(n1*d2)/(n2*d1);
        return div;
    }

}
class Q8{
    public static void main(String[] args){
           
        rational r=new rational();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st rational No.");
        System.out.println("Enter num1 ");
        int n1=sc.nextInt();
        System.out.println("Enter den1 ");
        int d1=sc.nextInt();
        System.out.println("Enter 2nd rational No.");
        System.out.println("Enter num2 ");
        int n2=sc.nextInt();
        System.out.println("Enter 1st rational No.");
        int d2=sc.nextInt();
        
        System.out.println("Which opertion u like to perform:");
        System.out.println("Sum: Press 0");
        System.out.println("Substraction Press 1");
        System.out.println("Multiplication Press 2");
        System.out.println("Division : Press 3 ");
        
        int c=sc.nextInt();
        switch(c){
            case0:r.sum();System.out.println("Sum is"+sum);break;
            case1:r.difference();System.out.println("Difference is"+diff);break;
            case2:r.multiplication();System.out.println("Multiplication is"+mul);break;
            case3:r.division();System.out.println("Division is"+div);break;
            default:break;
        }

        System.out.println("Thanks");
    


    }
}