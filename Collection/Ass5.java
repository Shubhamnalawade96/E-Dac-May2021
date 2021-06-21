package Exam;
import java.util.*;
public class Ass5 {

	public static void main(String[] args) {
		
	HashMap<Integer,String>h1=new HashMap<Integer,String>();	
//		h1.put(null,  null);
//		h1.put(null, null);
	    h1.put(10, "ghwf");
		h1.put(50, "xbc");
		h1.put(30, "ibc");
		h1.put(40, "lbc");
		h1.put(7, "gbc");
		
		System.out.println(h1);
//		System.out.println(h1.size());
//		HashMap<Integer,String>h2=new HashMap<Integer,String>(h1);
//		System.out.println(h2);
//		h1.clear();
//		//h1.re
		//System.out.println(h1);
		
		//System.out.println(h1.containsKey(50));
		//System.out.println(h1.containsValue("gbc"));
		//System.out.println(h1.keySet());
		//System.out.println(h1.values());
	     Set s=h1.entrySet();
	     Iterator itr=s.iterator();
	     while(itr.hasNext())
	     {
	    	 Map.Entry m1=(Map.Entry)itr.next();
	    	// System.out.println(m1.getKey()+" " +m1.getValue());
	    	 if(m1.getKey().equals(40))
	    	 {
	    		 m1.setValue("ZZZZUJUJULI");
	    	 }
	    	 System.out.println(m1.getKey()+" "+m1.getValue());
	     }
	
		
	}

}
