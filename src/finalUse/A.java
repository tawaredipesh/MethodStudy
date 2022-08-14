package finalUse;

public class A 
{

	public static void main(String[] args) 
	{
	    int a=20;
	    System.out.println(a);
	    a=a+90;
	    System.out.println(a);
	    
	    final int b=10;
	    System.out.println(b);
	    // b=b+90; final variable wont allow us updating in value
	    
	 }

	public final void test1()
	{
		System.out.println("A's test method");
	}
}
