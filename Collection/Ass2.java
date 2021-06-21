package Exam;
import java.util.*;
public class Ass2 {

	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		System.out.println(l1);//Display
		
		l1.addLast(70);//Addlast element 
		System.out.println(l1);
		
		Iterator<Integer> itr=l1.iterator();
         while(itr.hasNext())
         {
        	 Integer s1=40;
        	 Integer s2=(Integer)itr.next();
        	 if(s2==s1)
        	 {
        		 break;
        		
        	 } System.out.println(s2);
         }
         
         
         Iterator<Integer> it=l1.descendingIterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
		
          l1.add(2, 100);

          System.out.println(l1);
          l1.addFirst(1000);
          l1.addLast(5000);
          System.out.println(l1);
          
          System.out.println(l1.getFirst());
          System.out.println(l1.getLast());
          l1.removeFirst();
          l1.removeLast();
          System.out.println(l1);
          
          Collections.swap(l1, 3, 6);
          System.out.println(l1);
          
          LinkedList<Integer>l2=new LinkedList<Integer>();
        l2.add(100);
  		l2.add(200);
  		l2.add(300);
  		l2.add(400);
  		l2.add(500);
  		l2.add(600);
  		System.out.println(l2);  
  		l1.addAll(l2);
  		System.out.println(l1);
  		System.out.println(l1.contains(100));
  		System.out.println(l1.contains(10001));
  		
  		System.out.println(l1.toArray());
  		Integer []arr=l1.toArray(new Integer[0]);
  		for(Integer x:arr)
  		{
  			System.out.println(x);
  		}
         
  		System.out.println(l1.isEmpty());//empty list
  		LinkedList<Integer>l3=new LinkedList<Integer>();
  		
  		System.out.println(l1.equals(l2));//compare list
  		l1.set(5, 999);
  		System.out.println(l1);
  	
  		
  		
          

	}

}
