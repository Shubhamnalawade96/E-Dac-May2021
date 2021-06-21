package Exam;
import java.util.*;

public class Ass1 {

	public static void main(String[] args) {
	
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("KGF");
		a1.add("Rambo");
		a1.add("Lagan");
		a1.add("KIck");
		a1.add("GAJANI");
		a1.add("zaks");
		a1.add("uhjbs");
		
		System.out.println(a1);
		
		
		System.out.println(a1.get(2));//get element
		
		a1.set(1, "KGF-2");//set element
		System.out.println(a1);
		
		a1.add(0, "ASUR...");
		System.out.println(a1);
		a1.remove(3);//remove element
		System.out.println(a1);
		
		System.out.println(a1.indexOf("KGF"));//index
		System.out.println(a1.contains("KIck"));//search
		Collections.sort(a1);//sort element
		System.out.println(a1);
		a1.remove(0);//remove element
		System.out.println(a1);
		Collections.reverse(a1);//reverse list
		System.out.println(a1);
		
		
		Iterator itr=a1.iterator();//iterator element
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		

		
		
		
		
		
	}

}
