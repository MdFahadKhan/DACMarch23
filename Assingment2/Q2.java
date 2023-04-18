/**BMI calculator Class
fields:
1.height,2.Weight;

Methods:
1.Constructor:intilize height and weight
2.Getter setter methods
3.calculateBMI() BMI=weight/h*h;

Input:
User input

Prints output on console
 */
 import java.util.*;
 class BMIcalculator{
    private double height;
    private double weight;

    public BMIcalculator(){
        height=1.0d;
        weight=0.00d;
    }
    public void setHeight(double height){this.height=height;}
    public void setWeight(double weight){this.weight=weight;}

    public double getHeight(){return this.height;}
    public double getWeight(){return this.weight;}
    
    public double calculateBMI(){
        double BMI=weight/(height*height);
        return BMI;
    }
 }
 class Q2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    BMIcalculator bmi=new BMIcalculator();
    System.out.println("Enter height in mts ");
    bmi.setHeight(sc.nextDouble());
    System.out.println("Enter weight in kg ");
    bmi.setWeight(sc.nextDouble());
    System.out.println("Ur BMI with height "+bmi.getHeight()+" Weight "+bmi.getWeight()+" is "+bmi.calculateBMI() );





    }
 }