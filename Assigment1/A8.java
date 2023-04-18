class A8{
    public static void main(String []args){
        byte b=120;
        String s=Byte.toString(b);
        System.out.println("Byte value to string  "+s);

        Byte b1=new Byte(b);
        //byte b1=Byte.valueOf(b);
        System.out.println("byte value to byte instance "+b1);

       String s1=new String(s);
       Byte b2=new Byte(s1);
       System.out.println("String instance to byte instance "+b2);
//byte b2=Byte.parseByte(s1);
    }
}
/*
byte value =123;
Byte bs=new Byte(value);
byte b=bs.byteValue();
SOP(b);
byte instance to byte*/

