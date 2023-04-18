class A24{
    public static void main(String []args){
        float b=12.0f;
        String s=Float.toString(b);
        System.out.println("float value to string  "+s);

        Float b1=new Float(b);
        System.out.println("Float value to Float instance "+b1);

       String s1=new String(s);
       Float b2=new Float(s1);
       System.out.println("String instance to float instance "+b2);

       
        String s4=Float.toHexString(b);
        System.out.println("Float value to hex String  "+s4);


    }
}