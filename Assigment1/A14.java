class A14{
    public static void main(String []args){
        short value=121;
        Short bs=new Short(value);
        byte num1 = (byte)bs.byteValue();
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