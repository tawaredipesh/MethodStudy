package loops;

public class ForLoopUse {

	public static void main(String[] args) {
		// 9 table
		// initializationn=9//90
		// condition<=90//>=9
		// updation= a=a+9; //a=a-9;
		
		for(int i=9; i<=90; i=i+9)// incremental
		{
			System.out.println(i);
		}

		System.out.println("====================");
		
		for(int i=90; i>=9; i=i-9)// decremental
		{
			System.out.println(i);
		}
		
		System.out.println("=====================");
		for(int i=8; i<=80; i=i+8)// incremental
		{
			System.out.println(i);
		}
		
	}
	

}
