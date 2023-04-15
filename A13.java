class A13{
    public static void main(String []args){
        short b=120;
        String s=Short.toString(b);
        System.out.println("short value to string  "+s);

        Short b1=new Short(b);
        System.out.println("short value to short instance "+b1);

       String s1=new String(s);
       Short b2=new Short(s1);
       System.out.println("String instance to short instance "+b2);

    }
}