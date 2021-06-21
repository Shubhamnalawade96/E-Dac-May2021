import java.util.*;
public class Que11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two Numbers ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int temp;
	    System.out.println("Number before the swap  "+a+"  "+b);
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("Number After the swap  "+a+"  "+b);
	    
}
}
