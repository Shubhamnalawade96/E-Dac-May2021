class PyaramidP7

{
public static void main(String args[])
 {
    int a=9;
   for(int i=9;i>=1;i--)
   {

     for(int j=8;j>=i;j--)
    { 
      System.out.print(" ");
     }
      for(int k=1;k<=i;k++)
      {  
       System.out.print(a+" ");
        
       }
      a=a-1;
     System.out.println( );
    }
    }
  }
