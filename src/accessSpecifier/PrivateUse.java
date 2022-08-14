package accessSpecifier;

public class PrivateUse {

	public static void main(String[] args)
	{
		PrivateUse pu= new PrivateUse();// created object of class
		pu.test1(); // public can be accessed within project
		pu.test2(); // private can be accessed within class
		pu.test3(); // default can be accessed within package
		pu.test4(); //protected can accesses within package/ outside of package
	}

	public void test1()
	{
		System.out.println("Public test1 method");// Public can be accessed within project
	}
	
	private void test2()
	{
		System.out.println("private test2 method");// private can be accessed within class
	}
	
	void test3()
	
	{
		System.out.println("default test3 method");// default can be accessed within package
	}
	
	protected void test4()
	{
		System.out.println("protected test4 method");// protected can be accessed within package,outside of package with inheritance operation
	}
}
