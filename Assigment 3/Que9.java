import java.util.Scanner;

public class Que9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Days");
	int day=sc.nextInt();
	int year;
	int month;
	
	
	year=day/365;
	month=day/30;
	day=day/30;
	
	System.out.println(" Year :"+year);
	System.out.println(" Month :"+month);
	System.out.println(" Day :"+day);
	
	
	
}
}
