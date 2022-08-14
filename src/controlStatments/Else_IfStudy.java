package controlStatments;

public class Else_IfStudy {

	public static void main(String[] args) {
		// if i got >=90 then i am dist
		// else if i got >=66 and <90 i am in 1st class
		// else if i got >=50 and <66 i am in 2nd class
		// else if i got >=40 and <50 i am pass class
		// else i am fail
		
		int marks=80;
		if(marks>=90)
		{
			System.out.println("i am in dist");
		}

		else if(marks>=66 & marks<90)
		{
			System.out.println("i am in 2nd class");
			
	    }
		
		else if(marks>=50 & marks<66)
		{
			System.out.println("i am in 3rd class");
		}
		
		else if(marks>=40 & marks<50)
		{
			System.out.println("i am in pass class");
		}
		
		else
		{
			System.out.println("i am fail");
		}
		
		
	}

}
