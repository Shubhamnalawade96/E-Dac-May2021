import java.util.*;
import java.lang.*;
class Program6{

public static void main(String [] args)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("INPUT TWO NUMBER -");
    
   int i=sc.nextInt();
   int j=sc.nextInt();
   int a=i+j;
   int b=i-j;
   int c=i*j;
   int d=i/j;
   int e=i%j;


  System.out.println("result = "+a);
  System.out.println("result = "+b);
  System.out.println("result = "+c);
  System.out.println("result = "+d);
  System.out.println("result = "+e);
}
}