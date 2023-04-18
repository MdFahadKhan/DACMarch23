/**Book inventory Managment System
Class Book 

Fields: 1.title: 2.author: 3.publisher: 4.ISBN::string  5.year:int; 
6.price: Double  7.quantity: int.

methhods:
1.constructor
2.getter setter 
3.logic methods
   3.1. increaseQuantity(int quantity)
   3.2. decreaseQuantity(int quantity)
   3.3. getInventoryValue():  totalValue = price*quantity of book;
 */
 import java.util.*;
 class Book{
     String title,author,publisher,ISBN,year;
     private double price;
     private int quantity;

     Book(){price=100;quantity=1;}
     Book(String title,String author,String pub,String ISBN,int year){}

     public void setPrice(double price){this.price=price;}
     public void setQuantity(int quantity){this.quantity=quantity;}

     public double getPrice(){return price;}
     public int getQuantity(){return quantity;}
     
     public int increaseQuantity(int i){quantity=quantity+i;return quantity;}
     public int decreaseQuantity(int i){quantity=quantity-i;return quantity;}
     public double getInventoryValue(){double totalValue = price*quantity;return totalValue;}
 }
 class Q3{
    public static void main(String []args){
        Book b=new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantity of book");
        b.setQuantity(sc.nextInt());
        System.out.println("Price of book");
        b.setPrice(sc.nextInt());

        System.out.println("Press 1 to increase q and press 2 to decrease q and 3 to exit  ");
        int c=sc.nextInt();
        switch(c){
            case 1:System.out.println("Enter Quantity to increase ");b.increaseQuantity(sc.nextInt());
            break;
            case 2:System.out.println("Enter Quantity to decrease ");b.decreaseQuantity(sc.nextInt());
            break;
            default:break;
        }
        System.out.println("price of book : "+b.getPrice()+" quantity left is "+b.getQuantity()+" Total value of inventory is "+b.getInventoryValue());
    }
}