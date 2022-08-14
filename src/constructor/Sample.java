package constructor;

public class Sample {

	public static void main(String[] args) 
	{
	Sample s= new Sample();
	s.sub();
     
	
	
	}
//1. Variable declaration
	int x;
	int y;
	
	public Sample()// user defined constructor
	{
		// To initialize data member/variable
		x=100;
		y=200;
	}
	public void sub()
	{
		int sub=x-y;
		System.out.println("sub is"+ sub);
	}
}
