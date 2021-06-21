/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with constructor having the three sides as its parameters.
 * 
 */

class Triangle1
{
	int side1;
	int side2;
	int side3;
	
	Triangle1(){}
	 Triangle1(int x,int y,int z)
	 {
		 this.side1=x;
		 this.side2=y;
		 this.side3=z;
	 }
	 float perimeter()
	 {
		 return ((side1+side2+side3)/2);
	 }
	 float Area()
	 {
		 float s=((side1+side2+side3)/2);
		 
		 float A=(s*((s-side1)*(s-side2)*(s-side3)));
		 
		 return A;
	 }
	
	 
	}
public class ClassQ4 {

	public static void main(String[] args) {
		Triangle1 t1=new Triangle1(3,4,5);
		System.out.println("Area = "+t1.Area()+" Perimeter ="+t1.perimeter());		

	}

}
