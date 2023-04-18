class A33{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        float b=Float.parseFloat(args[1]);
        double c=Double.parseDouble(args[2]);

        Double sum=a+b+c;
        Double min=a-b-c;
        Double multy=a*b*c;
        Double Div=(a/b)/c;
        System.out.println(sum);
         System.out.println(min);
          System.out.println(multy);
           System.out.println(Div);
    }
}