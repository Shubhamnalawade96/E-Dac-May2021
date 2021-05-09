import java.util.*;
class Program13
{

public static void main(String [] args)
{
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the base and height");
 float b = sc.nextFloat();
 float h = sc.nextFloat();
 float Area,Perimeter;
 Area=b*h;
 Perimeter=2*(b+h);

 System.out.println("Area of Triangle="+Area);

 System.out.println("Perimeter of Triangle="+Perimeter);
}
}
