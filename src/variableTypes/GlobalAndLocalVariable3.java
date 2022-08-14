package variableTypes;

public class GlobalAndLocalVariable3 {

	    // Non static global variable 
		int a=80;//1+2 Declaration + Assign value
		
		// Static Global variable
		static int b=20;//1+2 Declaration + Assign value
		
		public static void main (String[] args)
		{
			GlobalAndLocalVariable3 g= new GlobalAndLocalVariable3();// Created object of class
			g.multiply(); // calling non static method from same class
			division(); // Calling static method from same class
			System.out.println("global value of a is "+g.a); // calling non static global variable from same class
			System.out.println("global value of b is "+ b); // calling static global variable from same class
			
		   int sum=20+g.a;// usage of non static global variable from same class
		   System.out.println("Sum is "+sum); 
		   
		   int sub=130-b; // Usage of static global variable from same class
		   System.out.println("sub is "+ sub);
			
		   // calling non static global variable from another class
		   // need to create object of another class(Sample3 class)
		   
		   Sample3 s= new Sample3();// created object of another class
		   System.out.println("Value of non static global variable from another class is "+s.p);
		   
		   //calling static global variable from another class
		   System.out.println("Value of static global variable from another class is "+ Sample3.t);
		   
		}
        
		public void multiply()
		{
			int a=5;//Local Variable
			int multiply=a*100;
			System.out.println("Multiplication is "+ multiply);
		}
	
        public static void division()
        {
        	int a=100;
        	int division=a/10;
        	System.out.println("Division is "+ division);
        	
        }
}
