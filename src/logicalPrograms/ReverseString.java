package logicalPrograms;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args) 
	{
		//String s="Velocity";
		// yticoleV
		
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Please enter String");
	//	String s= sc.next();
		String s="Pankaj";
		String r=""; //blank string
		
		for (int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
        System.out.println("Reverse string is "+r);
	}

}
