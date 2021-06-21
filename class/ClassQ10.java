/*
 * Write a program that would print the information (name, year of joining, salary, address) of three
employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat 
 * 
 */


import java.util.*;

class EmpData{
	String name;
	int year;
	String address;
	
	Scanner sc=new Scanner(System.in);
	
	EmpData()
	{
	}
	
	public EmpData(String name, int year, String address) {
		this.name=name;
		this.year=year;
		this.address=address;
	}

	EmpData info()
	{
		System.out.println("Enter the Name Of Employee");
		String name=sc.nextLine();
		
		System.out.println("Enter the Year Of Joining");
		int year=sc.nextInt();
		
		System.out.println("Enter the Address Of Employee");
		sc.nextLine();
		String address=sc.nextLine();
		
		return new EmpData(name,year,address);
		
		
	}
	
	
}

public class ClassQ10 {

	public static void main(String[] args) {
		
	      EmpData [] list=new EmpData[2];
	      EmpData ae=new EmpData();

	      for(int i=0;i<list.length;i++)
	      {
	    	  list[i]=ae.info();
	    	  
	      }    
	      for(EmpData a:list)
	      {
	    	  System.out.println(a.name+"   "+a.year+"  "+a.address);
	      }
	      

	}

}
