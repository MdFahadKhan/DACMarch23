class A29{
    public static void main(String []args){
        double value=101.2345d;
        Double bs=new Double(value);
        byte num1 = (byte)bs.byteValue();
         System.out.println("num1 "+ num1);
        
         short num2 = (short)bs.shortValue();
         System.out.println("num2 "+ num2);

          int num3 = (int)bs.intValue();
         System.out.println("num3 "+ num3);

          float num4 =(float) bs.floatValue();
         System.out.println("num4 "+ num4);

          double num5 = bs.doubleValue();
         System.out.println("num5 "+ num5);
    }
}