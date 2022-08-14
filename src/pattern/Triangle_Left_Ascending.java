package pattern;

public class Triangle_Left_Ascending {

	public static void main(String[] args) 
	{
		//*       rows=5, columns=5
		//**
		//***
		//****
		//*****
        int star=1; //Write no of star in 1st Row
        for(int i=1; i<=5; i++)//outer loop for rows
        {
        	for(int j=1; j<=star; j++)//inner loop for column
        	{
        		System.out.print("*");
        	}
        	System.out.println(); // after printing star go on next line
        	star++;               // Increment in stars
        	}
	 
	}
}
