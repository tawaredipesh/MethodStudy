package constructor;

public class Test 
{

// public Test()
// {
	// Default constructor-->compiler will create at time of compilation
//  
//  }
	
	public Test()// user defined constructor--> without parameter/with zero parameter
	{
	System.out.println("This is user defined constructor");

	}

	public void res()
	{
	 //
	}
	public static void main(String[] args) // main method
	{
		Test t= new Test();// created object of class
		t.res();
	}
	
}
