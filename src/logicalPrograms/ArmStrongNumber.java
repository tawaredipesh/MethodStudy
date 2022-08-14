package logicalPrograms;

public class ArmStrongNumber 
{

	public static void main(String[] args)
	{
	//153=1^3 + 5^3 + 3^3 = 1+125+27=153
		
		int number=100;
		int sum=0;
		for(int i=number; i>0; i=i/10)
		{
			int rem= i%10;
			
			sum=sum+(rem*rem*rem);
		}
        System.out.println(sum);
        
        if(number==sum)
        {
        	System.out.println("Given number is Armstrong number ");
        }
        else
        {
        	System.out.println("Given number is not armstrong number");
        }
        
        
	}

}
