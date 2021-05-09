class PyramidP5
{
public static void main(String args[])
 {
    
   for(int i=1;i<=9;i++)
   {
     for(int j=8;j>=i;j--)
    { 
      System.out.print(" ");
     }
  int x=9;
  int z=9;
   for(int k=1;k<=i;k++)
       {
        System.out.print(x+"");
       x=x-1;
       }
   for(int l=1;l<i;l++)
    {  
   System.out.print(z+"");
     z=z-1;
      }
     
   
     System.out.println();
    }
    }
  }
