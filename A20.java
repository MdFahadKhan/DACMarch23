class A20{
    public static void main(String []args){
        long b=120L;
        String s=Long.toString(b);
        System.out.println("Long value to string  "+s);

        Long b1=new Long(b);
        System.out.println("Long value to Long instance "+b1);

       String s1=new String(s);
       Long b2=new Long(s1);
       System.out.println("String instance to Long instance "+b2);

        String s2=Long.toBinaryString(b);
        String s3=Long.toOctalString(b);
        String s4=Long.toHexString(b);
        System.out.println("Long value to binary/o/hex String  "+s2+"  "+s3+"  "+s4);


    }
}