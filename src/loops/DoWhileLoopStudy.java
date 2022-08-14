package loops;

public class DoWhileLoopStudy {

	public static void main(String[] args) {
		// i want 4 table 
		    // Initialization-->4
		    // Condition---->i<=40
		    // updation------>i=i+4
		
		int i=4;// Initialization
		
		do
		{
			System.out.println(i);//4,8,...,36,40.
			i=i+4;// 8,12,...,40,44
		}
		 while (i<=40);

		System.out.println("======================");
		
		// i want 5 table
		//Initialization-->5
		//Condition--->a<=50
		//Updation--->a=a+5
		
		int a=5; // Initialization
		
		do
		{
			System.out.println(a);
			a=a+5;
		}
		while (a<=50);
	}

}
