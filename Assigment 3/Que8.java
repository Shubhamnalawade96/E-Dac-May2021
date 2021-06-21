import java.util.*;

public class Que8 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println(" Enter the Principle Ammount ");
   int p=sc.nextInt();
   System.out.println("Enter the rate of interst =");
   float r=sc.nextFloat();
   System.out.println("Enter the time period ");
   int n=sc.nextInt();
   
    double Simple=(float)(p*r*n)/100;
    
    System.out.println("Simple Interset =  "+Simple);
	}

}
