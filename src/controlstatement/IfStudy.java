package controlstatement;

public class IfStudy {

	public static void main(String[] args) {
		//use of if_else
		// if marks is greater than or equal to 40---->pass
		// else fail
		
		int marks=30;
		
		if(marks>=40)
		{
			System.out.println("you are pass");
		}

		
		else 
		{
			System.out.println("you are fail");
		}
		
		// if grade =A then you are good---->else not good
		
		char grade='B';
		if(grade=='A')
		{
			System.out.println("you are good");
		}
		
		else 
		{
			System.out.println("not good");
		}
	}

}
