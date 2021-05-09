class Pattern5
{
public static void main(String args[])
 {
   int a=64;
   for(int i=1;i<=5;i++)
   {
     for(int j=1;j<=i;j++)
    { 
      System.out.print((char)(a+1));
     }
        a=a+1;  
     System.out.println();
    }
    }
  }
