package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{    Scanner sc= new Scanner(System.in);//scanner is a java class
	     //String int float char
	     System.out.println("Please enter the 1st number");
	     int number1 = sc.nextInt();
	     
	     System.out.println("Please enter the 2nd number");
	     int number2 = sc.nextInt();
	     
	     int sum=number1+number2;
	     
	     System.out.println("Addition of two numbers is "+sum);
	     
	     System.out.println("Please enter your name");
	     String name=sc.next();
	     System.out.println("You entered name as "+name);
		
	}

}
