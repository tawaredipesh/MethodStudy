package logicalPrograms;

public class ReverseNumberWithoutStringConvert 
{

	public static void main(String[] args) 
	{
		int number=123;
		int revNum=0;
//		System.out.println(number/10); //12.3-> 12
//		System.out.println(number%10);//12.3  ->3
//		System.out.println(12/10); //1.2-> 1
//		System.out.println(12%10); //1.2-> 2
        
		for(int i=number; i>0; i=i/10)//123,12,1
		{
			int rem=i%10;//3,2,1
			revNum=revNum*10+rem;
		}
	    System.out.println(revNum);
	}

}
