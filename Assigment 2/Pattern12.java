class Pattern12
{
public static void main(String args[])
 {
   int a=1;
   int b=1;
   for(int i=1;i<=5;i++)
   {
     for(int j=4;j>=i;j--)
    { 
      System.out.print(" ");
     }
      for(int k=1;k<=a;k++)
      {
       System.out.print(b);
       }
      a=a+2;
      b=b+1;
     System.out.println();
    }
    }
  }
