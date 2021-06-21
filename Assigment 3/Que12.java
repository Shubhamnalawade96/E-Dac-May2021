import java.util.*;
public class Que12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sallary Ammount :");
	int b=sc.nextInt();
	float g;
	double h;
	float d;
	if(b<=10000) {
		h=(float)(b*10)/100;
		d=(float)(90*b)/100;
		g=(float)(b+h+d);
		System.out.println(" GS :"+g);
		
	}else {
		h=2000;
		d=(float)(98*b)/100;
		g=(float)(b+d+h);
		System.out.println(" GS :"+g);
	}
}
}
