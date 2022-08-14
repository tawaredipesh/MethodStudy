package mathoperation;

public class MathOperations1 {

	public static void main(String[] args) 
	{
		sub();// calling static regular method from same class
		// className.methodName(); --- calling static regular method from another class
		
		
		
		
	}

	public static void sub()//Static Regular Method
	{
		int a;
		int b;
		int subs;
		a=30;
		b=20;
		subs=a-b;
		System.out.println(" Substration is " + subs );
	}
}
