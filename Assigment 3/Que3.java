import java.util.*;
import java.lang.*;
import java.io.*;

public class Que3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value :");
		int x=sc.nextInt();
		int y,z;
		
	       y=(x*x) + (3*x) - 7;
		 System.out.println("Y = "+y);
		
		 y=(x++ + ++x);
		System.out.println(" X = "+x+" Y= "+y);
		
		 z=( x++ - --y - --x  +  x++ );
		System.out.println(" X = "+x+" Y= "+y+" Z ="+z);
		
		System.out.println("Enter the boolean value of a,b :");
                boolean a=false;
                boolean b=true;
                boolean c;

                c= a && b || !(a||b);
	        System.out.println("Value of c :"+c);

		
	}

}