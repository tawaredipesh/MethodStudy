package variableTypes;

public class GlobalAndLocalVariable {
      //non static global variable
	int a=90;//1+2 declaration + assign value
	
	// static global variable 
	static int b=10;// 1+2 declaration + assign value
	
	public static void main(String[] args) 
	{
        GlobalAndLocalVariable g= new GlobalAndLocalVariable();
        g.test(); // calling non static method from same class 
        test1(); // calling static method from same class
        System.out.println("global value of a is "+g.a);// calling non static global variable from same class
        System.out.println("global value of b is"+b);// calling static global variable from same class
        
        int sum=10+g.a;// usage of non static global variable from same class
        System.out.println("sum is "+sum);
        int sub=100-b;// usage of static global variable from same class
        System.out.println("sub is "+sub);
        // calling non static global variable from another class
        // need to create object of another class(sample class)
        
        Sample s= new Sample();// created object of another class
        System.out.println("value of non static global variable from another class is"+s.p);
        
        // calling static global variable from another class
        System.out.println("value of static global variable from another class is "+Sample.q);
        
	}
    public void test()
    {
    	int a=80;//local variable 
    	int sum=a+100;
    	System.out.println("Sum is "+sum);
    }
	
    public static void test1()
    {
    	//static  b=800;
    	int a=1000;
    	System.out.println("Running static test1 method");
    	System.out.println("total variable " + a);
    }
    
}
