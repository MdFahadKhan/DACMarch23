class A6{
    public static void main(String []args){
        boolean a=true;
        String s=Boolean.toString(a);
        System.out.println("Boolean to String s "+s);

        boolean b=Boolean.valueOf(s);
        System.out.println("String to Boolean value of b is "+b);

         String s1="False";
         boolean a1=Boolean.parseBoolean(s1);
        System.out.println("string to Boolean instance a1 value "+a1);

        boolean c=Boolean.valueOf(b);
        System.out.println("B to Boolean instance of c is "+c);

    }
}