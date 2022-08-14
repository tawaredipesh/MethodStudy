package constructor;

public class MathOperation {

	int a;//1. Variable declaration
	int b;
	
	public MathOperation()// user defined constructor
	{
		//To initialize data member/variable
	//	System.out.println("Running user defined constructor");
		a=50;
		b=50;
	}

	public static void main(String[] args)
	{
		MathOperation mo= new MathOperation();// created object of a class
		mo.add();
		
		UserDefinedWithParameter ud = new UserDefinedWithParameter();
		ud.addition();
	}
	
	public void add()
	{
		int a=20;//2. assign value (Initialization)
		int b=30;
		int sum=a+b;
		System.out.println("sum is "+ sum);
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
