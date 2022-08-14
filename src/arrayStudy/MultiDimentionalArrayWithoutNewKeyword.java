package arrayStudy;

public class MultiDimentionalArrayWithoutNewKeyword 
{

	public static void main(String[] args) 
	{
		// Declaration + Initialization
		char grade[][]= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}}; // by using without keyword
		
		
		for (int i=0;i<=2;i++)// outter for loop -> for row
		{
			for (int j=0;j<=3;j++)//inner for loop --> for column
			{
				System.out.print(grade[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		
		

	}

}
