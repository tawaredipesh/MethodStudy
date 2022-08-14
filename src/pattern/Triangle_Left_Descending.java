package pattern;

public class Triangle_Left_Descending {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		
		int star = 5; //No. of star present in first row
		for(int i=1; i<=5; i++)//for outer loop- for rows
		{
			for(int j=1; j<=star; j++);//inner for loop- for columns
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}

	}

}
