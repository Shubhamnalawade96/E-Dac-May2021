import java.util.*;

public class Que6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius of circle = ");
		double r=sc.nextDouble();
		
		double area=3.14*r*r;
		double circumference =3.14*2*r;
		
		System.out.println(" Area = "+area);
		System.out.println("Perimeter = "+circumference);

	}

}
