package interfaceUse;

public class IC implements MyInterface {

	public static void main(String[] args) 
	{
		IC i= new IC(); // created object of implementation class
		i.test1();
		i.test2();
		i.test3();
		System.out.println(MyInterface.a);

	}
    
	public void test1()
	{
		System.out.println("Test1 method completed in implementation class");
	}
	
	public void test2()
	{
		System.out.println("Test2 method completed in Implementation class");
	}
	
	public void test3()
	{
		System.out.println("test3 is own method from IC");
	}
}
