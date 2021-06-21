package StackExampl;

import java.util.Scanner;

class Stack{
	private int size;
	private int Arr[];
	private int top;
	
	Stack(int size)
	{
		this.size=size;
		this.Arr=new int[size];
		this.top=-1;
		
	}
	
	public boolean isEmpty()
	{
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		return false;
	}
	public void push(int data)
	{
		if(isFull()) {
			System.out.println("Stack Overflow");
		             }
		  Arr[++top]=data;
	}
	public int pop() {
		if(isEmpty())
		{
			System.out.println("Stack is Underflow");
		}
		int data=Arr[top--];
		return data;
	}
	public int peek()
	{
		if(!isEmpty()) {
		return Arr[top];
		}
		return 0;
	}	
}
public class StackReversal {
	
	public static void Stackreversal(StringBuffer s)
	{
		int n=s.length();
		 Stack obj=new Stack(n);
		 int i;
		for(i=0;i<n;i++)
			obj.push(s.charAt(i));
			
			
		for(i=0;i<n;i++)
		{
			char ch=(char) obj.pop();
			s.setCharAt(i, ch);
		}		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		StringBuffer s=new StringBuffer(str);
		Stackreversal(s);
		System.out.println("Revesrd String is : "+s);	

	}

}
