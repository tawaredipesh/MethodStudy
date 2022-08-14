package mathoperation;

public class MathOperations2 {

	public static void main(String[] args)
	{
		MathOperations2 m= new MathOperations2(); // created object of a class
		m.add();// calling non static method with the help of object
		m.add(100,90);
		m.add(2,3);
		
		sub();// calling static method 
		sub(90,20,0); // calling method with parameter
        sub(10,20,10);
	}

	public void add()// Non static regular method--without parameter/zero parameter
	
	{
		int a;
		int b;
		int addition;
		a=10;
		b=20;
		addition=a+b;
		System.out.println("addition is "+addition);
		
		
	}
	public void add(int a,int b)//method with parameter
	{
		int sum=a+b;
		System.out.println("Sum is "+ sum);
		
	}
	public static void sub()// static regular method-- without parameter /zero parameter
	{
		int a;
		int b;
		int subs;
		a=0;
		b=0;
		subs=a-b;
		System.out.println("sub is "+ subs);
	}

    public static void sub(int p,int q, int r)// method with parameter
    {
    	int subs=p-q-r;
    	System.out.println("substraction is "+ subs);
    }
}