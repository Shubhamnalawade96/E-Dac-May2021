import java.util.*;

public class Que7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	
	System.out.println("Enter the Marks of Subject = ");
	int a=sc.nextInt();
	int b=sc1.nextInt();
	int c=sc2.nextInt();
	int d=sc2.nextInt();
	int e=sc2.nextInt();

	int total;
	float percentage;
	
	
	total=a+b+c+d+e;
	System.out.println("Total ="+total);

	percentage=(float)(total*100)/500;
	
	System.out.println("Percentage marks="+percentage+"%");
	
	
}
}
