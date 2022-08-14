package loops;

public class WhileLoopStudy {

	public static void main(String[] args) {
		// i want 4 table
		//initialization-->4
		//condition ----->i<=40
		// updation----->i=i+4
		
		//initialization
		int i=4;
		
		while(i<=40)// condition //4,8,12,36,40,44
		{
			System.out.println(i); //4,8,12...36,40
		
		i=i+4; //updation// 8,12,....36,40,44
		}
		
		System.out.println("==================");
		
		// i want 4 table in reverse order
		      // initialization-->40
		      // condition---->i>=4
		      // updation----->i=i-4
		
		int a=40;
		while (a>=4)
		{
			System.out.println(a);//4
			a=a-4;//0
		}
		System.out.println("==================");
		
		// i want 6 table
		// initialization-->6
		// condition---->i<=60
		// updation--->i=i=6
		
		//initialization
	
		int b=6;
		
		while (b<=60)
		{
			System.out.println(b);
			b=b+6;
		}
		System.out.println("==================");
		
		// i want 6 table in reverse order
		// initialization-->60
		// condition---->c>=6
		// updation ---->c=c-6
		
		int c=60;
		
		while(c>=6)
		{
			System.out.println(c);
			c=c-6;
		}
	}

}
