package Exam;
import java.util.*;
public class Ass3 {

	public static void main(String[] args) {
	HashSet <String>h1=new HashSet<String>();
	
	h1.add("Shubham");
	h1.add("Mangesh");
	h1.add("AkASH");
	h1.add("Ajit");
	
	System.out.println(h1);//Display
	
	System.out.println(h1.size());//size of set
	
	String arr[]=h1.toArray(new String[0]);//convert to Array
	for(String s:arr)
	{
		System.out.println(s);
	}
	
	TreeSet<String> t1=new TreeSet<String>(h1);//convert treeset
	System.out.println(t1);
	
	ArrayList l1=new ArrayList(h1);//convert ArrayList
	System.out.println(l1);
	
	
	}

}
