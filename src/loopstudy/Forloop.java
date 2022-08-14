package loopstudy;

public class Forloop {

	public static void main(String[] args) {
		// Loop is used to perform repetative task
		// for loop is used when number iteration is fixed
		// 3 steps to use loop---->Initialization--->condition--->Updation(Increment/decrement)
		
		// i want to print 1 to 10 digit by using for loop
		
		for(int i=1;i<=10;i=i+1)
		{
			System.out.println(i);
		}
		
		System.out.println("=================================");

		// i want to print table of 2
		
		for (int i=2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		System.out.println("===================================");
		
		// i want to print 10 to 1
		for(int i=10;i>=1;i=i-1)
		{
			System.out.println(i);
		}
		
		System.out.println("====================================");
		
		// i want to print my name 10 times
		
		for (int i=1;i<=10;i=i+1)
		{
			System.out.println("Dipesh");
		}
	}
}
