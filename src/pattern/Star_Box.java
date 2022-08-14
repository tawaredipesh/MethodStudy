package pattern;

public class Star_Box {

	public static void main(String[] args) 
	{
	  //*****   //Rows =3
	  //*****   //column = 5
	  //*****  //Always start with Rows(outer loop)
     

		for (int i=1; i<=3; i++)//outer for loop for rows.here rows =3
		{
			for(int j=1; j<=5; j++)//outer for loop for columns here column=5
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
