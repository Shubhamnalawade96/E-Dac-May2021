class Pattern10
{
public static void main(String args[])
 {
    
   for(int i=1;i<=5;i++)
   {

     for(int j=4;j>=i;j--)
    { 
      System.out.print(" ");
     } 
       int a=69;
      for(int k=1;k<=i;k++)
      {  
       
       System.out.print((char)(a)+" ");
        a=a-1;
       } 
     
     System.out.println( );
    }
    }
  }
