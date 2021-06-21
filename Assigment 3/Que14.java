import java.util.*;
import java.lang.*;

public class Que14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year :");
	int year=sc.nextInt();
	boolean l=false;
	
	if(year%4==0) {
		
		if(year%100==0) {
			
			if(year%400==0){
				l=true;}
				else {
					l=false;
				}
			}
			else l=true;
			}
		else
			{l=false;
	}
	if(l==true) {
		System.out.println("This is a leap Year :"+year);
	}else {
		System.out.println("This is NOT leap Year : "+year);
	}
	
	
 }
}
