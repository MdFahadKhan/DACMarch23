class A16{
    public static void main(String []args){
        int b=120;
        String s=Integer.toString(b);
        System.out.println("int value to string  "+s);

        Integer b1=new Integer(b);
        System.out.println("int value to int instance "+b1);

       String s1=new String(s);
       Integer b2=new Integer(s1);
       System.out.println("String instance to int instance "+b2);

        String s2=Integer.toBinaryString(b);
        String s3=Integer.toOctalString(b);
        String s4=Integer.toHexString(b);
        System.out.println("Int value to binary/o/hex String  "+s2+"  "+s3+"  "+s4);


    }
}