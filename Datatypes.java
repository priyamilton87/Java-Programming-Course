 class Datatypes
 {
    public static void main(String a[])
    {
       int num1=4;
       int num2=2147483647;//beyond
       int result;
       byte by=127;
       short sh=558;
       long l=334l; //include l
       float fvv=3.4f; //include f
       char c='g';
       boolean b=true;
       int num4=0b101; //binary b 101- 5 //Literals
       byte bb=127;
       int aa=bb;

        int tt=120;
        byte k=(byte)tt;
         System.out.println(b);
        System.out.println(num2);
        System.out.println(k);
       System.out.println(aa);

       result=num1+num2;
       System.out.println(l);
       System.out.println(num4);

       System.out.println(result); // Prints -2147483645 (may wrap if exceeded)
   
    }
 }
