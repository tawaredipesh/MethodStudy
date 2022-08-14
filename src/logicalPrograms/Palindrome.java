package logicalPrograms;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s ="level";
		String r="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);
		
		if(r.equals(r)) 
		{
		  System.out.println("String is Palindrome");	
		}
		
		else {
		
			System.out.println("String is not Palindrome");
		}
		System.out.println("~~~~~~~~~~~*~~~~~~~~~~~");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number/String: ");
		String p=sc.nextLine();
		String t="";
		
		for(int i=p.length()-1; i>=0; i--)
		{
			t=t+p.charAt(i);
		}
		System.out.println(t);
		
		if(p.equals(t))
		{
			System.out.println("String is Palindrome");
		}
		
		else 
		{
			System.out.println("String is not Palindrome");
		}
		
		
	}

}
