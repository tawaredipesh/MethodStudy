package arrayStudy;

public class ArrayEg2 
{

	public static void main(String[] args) 
	{
		int rollNum[]= new int[3];
		System.out.println(rollNum);
		// 1 & 2 declaration + Initialization
		int rollNum1[]= {1,2,3,4,5,6};
		char grade[]= {'A','B','C','D'};
		System.out.println(grade);
		System.out.println(rollNum1[3]);
		System.out.println("\n");

		for (int i=0;i<=rollNum1.length-1;i++)
		{
			
			System.out.println(rollNum1[i]);
			System.out.println("\n0");
		}
		for(int i=rollNum1.length-1;i>=0;i--)
				{
					System.out.println(rollNum1[i]);
				}
		
	}

}
