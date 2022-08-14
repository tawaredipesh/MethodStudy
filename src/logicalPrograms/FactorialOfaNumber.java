package logicalPrograms;

import java.util.Scanner;

public class FactorialOfaNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
     
		int fact=1;
		
		for(int i=number; i>=1; i--)//4,3,2,1
		{
			fact=fact*i;  //4,12,24,24
		}
		System.out.println("Factorial of "+number+" is "+fact);
		
	}

}
