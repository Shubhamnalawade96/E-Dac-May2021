import java.util.*;
import java.lang.*;

class Swapping
{
   public static void main(String args[])
    {  
      Scanner sc= new Scanner(System.in);
      System.out.println("ENTER TWO INTERGER NUMBER:-");
      int i=sc.nextInt();
      int j=sc.nextInt();
    

       i=i+j;
       j=i-j;
       i=i-j;


      System.out.println("AFTER SWAPPING TWO NUMBER:-");
      System.out.println("i= "+i);
      System.out.println("j= "+j);

     }
}

