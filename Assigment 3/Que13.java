import java.util.*;
public class Que13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three Numbers ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	System.out.println(x+" "+y+" "+z);
	
	if(x>y && x>z) {
		System.out.print("Greatest number = "+x);
	}else if(y>z) {
		System.out.print("Greatest number = "+y);
	}else {
		System.out.print("Greatest number = "+z);
	}
		
		
	}
	
	
			}

