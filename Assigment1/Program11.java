import java.util.*;
class Program11
{

public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Radius Of Circle");
 double r = sc.nextDouble();
 double Area,Perimeter;
 double PI=3.14;
 Area=(PI*r*r);
 Perimeter=(2*PI*r);

 System.out.println("Area of circle="+Area);

 System.out.println("Perimeter of circle="+Perimeter);
}
}


