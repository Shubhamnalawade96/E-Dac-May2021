import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the temperature in Fahrenheit ");
			int f=sc.nextInt();
	       float c;
	       
	       c=(5*(f-32))/9;
	       
	       System.out.println("Temperature F to C "+c+"c");

	}

}
