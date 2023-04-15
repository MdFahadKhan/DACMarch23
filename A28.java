class A28{
    public static void main(String []args){
        double b=20.453d;
        String s=Double.toString(b);
        System.out.println("Double value to string  "+s);

        Double b1=new Double(b);
        System.out.println("double value to double instance "+b1);

       String s1=new String(s);
       Double b2=new Double(s1);
       System.out.println("String instance to double instance "+b2);
        
        long a1=Double.doubleToLongBits(b);

        String s2=Long.toBinaryString(a1);
        String s3=Long.toOctalString(a1);
        String s4=Double.toHexString(b);
        System.out.println("Double value to binary/o/hex String  "+s2+"  "+s3+"  "+s4);


    }
}