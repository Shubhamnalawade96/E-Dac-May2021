package Exam;
import java.util.*;
public class Ass4 {

	public static void main(String[] args) {
		TreeSet<String>t1=new TreeSet<String>(new decending());
		t1.add("ABC");
		t1.add("XBC");
		t1.add("TBC");
		t1.add("ZYC");
	    t1.add("MBC");
		t1.add("PBC");
		t1.add("CBC");
		t1.add("YBC");
		
		System.out.println(t1);
//		
//		Iterator itr=t1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			
//		}
//		TreeSet<String>t2=new TreeSet<String>(new decending());
//		System.out.println(t2);
		Iterator itr=t1.iterator();
		for(int i=0;i<3;i++)
		{
			if(itr.hasNext())
			{
				String s=(String)itr.next();
				System.out.println(s);
			}
		}
		
		
		TreeSet<Integer>t2=new TreeSet<Integer>();
		t2.add(2);
		t2.add(3);
		t2.add(1);
		t2.add(4);
	    t2.add(5);
		t2.add(10);
		t2.add(15);
		t2.add(96);
		System.out.println(t2);
		
		Iterator itr1=t2.iterator();
		while(itr1.hasNext())
		{
			Integer n=(Integer)itr1.next();
			if(n<7)
			{
				System.out.println(n);
			}
		}
				
	}
}
class decending implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String) obj1;
		String s2=(String) obj2;
	  return (s2).compareTo(s1);

		
	}
}

