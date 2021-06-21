import java.util.*;
import java.lang.*;
public class Que15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the persons gender :");
	char c=sc.next().charAt(0);
	char M='M';
	char F='F';
	
	if(c=='M' ||c=='F'){
		System.out.println("Enter the person Age");
		int a=sc.nextInt();
		if(a>=18 && a<=35) {
			System.out.println("This Person eligiable for Marriage");
		}else {
			System.out.println("This Person Not Eligiable for Marriage ");
		}
		
	}else {
		System.out.println("please Give valid Input ");
	}
	
  }
}
