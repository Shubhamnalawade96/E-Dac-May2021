package StackExampl;

import java.util.Scanner;



public class StackUsingPalindrome {
	int size;
	 int Arr[];
	 int top;
	
	 StackUsingPalindrome(int size)
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
	public void pop() {
		if(isEmpty())
		{
			System.out.println("Stack is Underflow");
		}
		int data=Arr[top--];
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String : ");
				String s1=sc.nextLine();
				int size=s1.length();
		StackUsingPalindrome p1=new StackUsingPalindrome(size);
				
		for(int i=0;i<size;i++)
				{
					p1.push(s1.charAt(i));
			      
				}
				
		 for(int i=0;i<=size-1;i++)
				{
				if(p1.Arr[p1.top]!=s1.charAt(i)) {
						break;
					}else {
						p1.pop();
					}
				}
				if(p1.isEmpty())
				{
					System.out.println("Palindrome..!!");
				}else {
					System.out.println("Not Palindrome ..!!");
				}
		
	}

}
