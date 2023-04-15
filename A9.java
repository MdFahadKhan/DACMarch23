class A9{
    public static void main(String []args){
        byte value=10;
        Byte bs=new Byte(value);
        byte num1 = bs.byteValue();
         System.out.println("num1 "+ num1);
        
         short num2 = bs.shortValue();
         System.out.println("num2 "+ num2);

          int num3 = bs.intValue();
         System.out.println("num3 "+ num3);

          float num4 = bs.floatValue();
         System.out.println("num4 "+ num4);

          double num5 = bs.doubleValue();
         System.out.println("num5 "+ num5);
    }
}