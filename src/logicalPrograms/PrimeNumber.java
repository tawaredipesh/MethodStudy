package logicalPrograms;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int num=25;
		int counter=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				counter++;
				
			}
		}
        
		if(counter==1) 
		{
			System.out.println("Given number is Not a prime number");
		}
		else
		{
			System.out.println("Given number is a prime number");
		}
	}

}
