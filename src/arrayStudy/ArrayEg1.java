package arrayStudy;

public class ArrayEg1 
{

	public static void main(String[] args) 
	{
		// i want to store city names
		
		//1. Array declaration--> for String
		String city[]=new String[5];
		
		// 2. Array initialize

		city[0]="Pune";
		city[1]="Dhule";
		city[2]="Beed";
		city[3]="Thane";
		city[4]=null;
		//city[5]="kkkk"; error-->ArrayIndexOutOfBoundsException.
		
		// 3. usage
		
		System.out.println(city[2]);
		System.out.println("\n");
		
		//System.out.println(city[19]); error--> ArrayIndexOutOfBoundsException.
		
		//1. Array declaration 
		int count[]=new int [3];
		
		//Initialization
		count[0]=10;
		
		//3.Usage
		System.out.println(count[0]);
		System.out.println(count[1]);
	}

}
