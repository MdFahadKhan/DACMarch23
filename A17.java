class A17{
    public static void main(String []args){
        int value=1243;
        Integer bs=new Integer(value);

        byte num1 = (byte)bs.byteValue();
         System.out.println("num1 "+ num1);
        
         short num2 = (short)bs.shortValue();
         System.out.println("num2 "+ num2);

          int num3 = bs.intValue();
         System.out.println("num3 "+ num3);

          float num4 = bs.floatValue();
         System.out.println("num4 "+ num4);

          double num5 = bs.doubleValue();
         System.out.println("num5 "+ num5);
    }
}